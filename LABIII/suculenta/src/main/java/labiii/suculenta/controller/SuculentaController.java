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
        private int idAtual = 1;

        public SuculentaController() {
            suculentas.addAll(List.of(
                    new Suculenta(idAtual++,"Echeveria", "Crassulaceae"),
                    new Suculenta(idAtual++,"Sedum", "Crassulaceae"),
                    new Suculenta(idAtual++,"Haworthia", "Asphodelaceae"),
                    new Suculenta(idAtual++,"Aloe Vera", "Asphodelaceae")
            ));
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
            suculenta.setId(idAtual++); // Atribui um novo ID autoincrementado
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
