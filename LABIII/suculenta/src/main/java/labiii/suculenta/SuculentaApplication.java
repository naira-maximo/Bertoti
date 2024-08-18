package labiii.suculenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SuculentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuculentaApplication.class, args);
	}
}

@RestController
@RequestMapping("/suculentas")
class RestApiDemoController {
	private final List<Suculenta> suculentas = new ArrayList<>();

	public RestApiDemoController() {
		suculentas.addAll(List.of(
				new Suculenta("Echeveria", "Crassulaceae"),
				new Suculenta("Sedum", "Crassulaceae"),
				new Suculenta("Haworthia", "Asphodelaceae"),
				new Suculenta("Aloe Vera", "Asphodelaceae")
		));
	}

	@GetMapping
	Iterable<Suculenta> getSuculentas() {
		return suculentas;
	}

	@GetMapping("/{id}")
	Optional<Suculenta> getSuculentaById(@PathVariable String id) {
		for (Suculenta s: suculentas) {
			if (s.getId().equals(id)) {
				return Optional.of(s);
			}
		}
		return Optional.empty();
	}

	@PostMapping
	Suculenta postSuculenta(@RequestBody Suculenta suculenta) {
		suculentas.add(suculenta);
		return suculenta;
	}

	@PutMapping("/{id}")
	ResponseEntity<Suculenta> putSuculenta(@PathVariable String id,
										   @RequestBody Suculenta suculenta) {
		int suculentaIndex = -1;

		for (Suculenta s: suculentas) {
			if (s.getId().equals(id)) {
				suculentaIndex = suculentas.indexOf(s);
				suculentas.set(suculentaIndex, suculenta);
			}
		}

		return (suculentaIndex == -1) ?
				new ResponseEntity<>(postSuculenta(suculenta), HttpStatus.CREATED) :
				new ResponseEntity<>(suculenta, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteSuculenta(@PathVariable String id) {
		suculentas.removeIf(s -> s.getId().equals(id));
	}
}
