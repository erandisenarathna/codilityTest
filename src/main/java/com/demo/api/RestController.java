package com.demo.api;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.impl.Animal;
import com.demo.impl.Bird;
import com.demo.impl.Chicken;
import com.demo.impl.Duck;
import com.demo.impl.Fish;
import com.demo.impl.Parrot;
import com.demo.impl.Response;

@Path("/animals")
public class RestController {

	static final Map<String, Animal> animals = new HashMap<String, Animal>() {
		{
			put("Bird", new Bird());
			put("Duck", new Duck());
			put("Chicken", new Chicken());
			put("Fish", new Fish());
			put("Parrot", new Parrot());
		}
	};

	@GET
	@Path("/{type}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getAnimal(@PathParam("type") String type) {
		Response response = new Response();
		if (animals.get(type) == null) {
			response.setStatus(false);
			response.setAnimal("Not Found");
			return response;
		} else {
			response.setStatus(true);
			response.setAnimal("Found");
		}

		return response;
	}

}
