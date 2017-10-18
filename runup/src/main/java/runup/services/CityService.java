package runup.services;

import java.util.List;
import runup.model.City;

public interface CityService {
	City getCity(String name, String country);
	List<City> findAll();
}
