package runup.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import runup.model.City;
import runup.services.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;

	@RequestMapping("/find/{city}/{country}")
	public String find(@PathVariable String city, @PathVariable String country) {
		return cityService.getCity(city, country).toString();
	}

	@RequestMapping(value = "/findAll", headers = "Accept=application/json")
	public List<City> findAll() {
		List<City> list = cityService.findAll();
		return list;
	}

}
