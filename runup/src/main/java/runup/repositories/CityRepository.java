package runup.repositories;
import java.util.List;
import org.springframework.data.repository.Repository;
import runup.model.City;

public interface CityRepository extends Repository<City, Long> {
    City findByNameAndCountryAllIgnoringCase(String name, String country);
    List<City> findAll();
}