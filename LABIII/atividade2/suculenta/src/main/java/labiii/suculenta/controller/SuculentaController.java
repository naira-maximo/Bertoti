package labiii.suculenta.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import labiii.suculenta.model.Suculenta;

@RestController
@RequestMapping("/suculentas")
public class SuculentaController {
    private final List<Suculenta> suculentas = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public SuculentaController() {
        suculentas.addAll(List.of(
                new Suculenta(idCounter.getAndIncrement(), "Echeveria", "Crassulaceae"),
                new Suculenta(idCounter.getAndIncrement(), "Sedum", "Crassulaceae"),
                new Suculenta(idCounter.getAndIncrement(), "Haworthia", "Asphodelaceae"),
                new Suculenta(idCounter.getAndIncrement(), "Aloe Vera", "Asphodelaceae")
        ));
    }

    @GetMapping
    public Iterable<Suculenta> getSuculentas() {
        return suculentas;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suculenta> getSuculentaById(@PathVariable int id) {
        Optional<Suculenta> suculenta = suculentas.stream().filter(s -> Objects.equals(s.getId(), id)).findFirst();
        return suculenta.map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Suculenta> postSuculenta(@RequestBody Suculenta suculenta) {
        suculenta.setId(idCounter.getAndIncrement()); // Atribui um novo ID autoincrementado
        suculentas.add(suculenta);
        return new ResponseEntity<>(suculenta, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Suculenta> putSuculenta(@PathVariable int id,
                                           @RequestBody Suculenta suculenta) {
        int suculentaIndex = -1;

        for (Suculenta s: suculentas) {
            if (Objects.equals(s.getId(), id)) {
                suculentaIndex = suculentas.indexOf(s);
                suculenta.setId(id);
                suculentas.set(suculentaIndex, suculenta);
            }
        }

        return (suculentaIndex == -1) ?
                new ResponseEntity<>(postSuculenta(suculenta).getBody(), HttpStatus.CREATED) :
                new ResponseEntity<>(suculenta, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSuculenta(@PathVariable int id) {
        boolean removed = suculentas.removeIf(s -> Objects.equals(s.getId(), id));
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}