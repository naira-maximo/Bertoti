package labiii.suculenta.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import labiii.suculenta.model.Suculenta;

@RestController
@RequestMapping("/suculentas")
public class SuculentaController {
    private final List<Suculenta> suculentas = new ArrayList<>();

    public SuculentaController() {
        suculentas.addAll(List.of(
                new Suculenta(0, "Echeveria", "Crassulaceae"),
                new Suculenta(0, "Sedum", "Crassulaceae"),
                new Suculenta(0, "Haworthia", "Asphodelaceae"),
                new Suculenta(0, "Aloe Vera", "Asphodelaceae")
                // new Suculenta(0, "Sempervivum", "Crassulaceae"),
                // new Suculenta(0, "Agave", "Asparagaceae"),
                // new Suculenta(0, "Crassula Ovata", "Crassulaceae"),
                // new Suculenta(0, "Graptopetalum", "Crassulaceae"),
                // new Suculenta(0, "Kalanchoe", "Crassulaceae"),
                // new Suculenta(0, "Euphorbia", "Euphorbiaceae")
        ));
        // Atribuir IDs após a lista ser preenchida
        for (Suculenta suculenta : suculentas) {
            suculenta.setId(gerarId());
        }
    }

    private int gerarId() {
        return suculentas.stream()
                .mapToInt(Suculenta::getId)
                .max()
                .orElse(0) + 1;
    }

    @GetMapping
    Iterable<Suculenta> getSuculentas() {
        return suculentas;
    }

    @GetMapping("/{id}")
    Optional<Suculenta> getSuculentaById(@PathVariable int id) {
        return suculentas.stream().filter(s -> Objects.equals(s.getId(), id)).findFirst();
    }

    @PostMapping
    Suculenta postSuculenta(@RequestBody Suculenta suculenta) {
        suculenta.setId(gerarId()); // Atribui um novo ID autoincrementado
        suculentas.add(suculenta);
        return suculenta;
    }

    @PutMapping("/{id}")
    ResponseEntity<Suculenta> putSuculenta(@PathVariable int id,
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
                new ResponseEntity<>(postSuculenta(suculenta), HttpStatus.CREATED) :
                new ResponseEntity<>(suculenta, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteSuculenta(@PathVariable int id) {
        suculentas.removeIf(s -> Objects.equals(s.getId(), id));
    }
}