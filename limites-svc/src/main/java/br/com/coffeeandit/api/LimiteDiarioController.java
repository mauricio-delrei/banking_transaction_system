package br.com.coffeeandit.api;

import br.com.coffeeandit.entity.LimiteDiario;
import br.com.coffeeandit.service.LimiteDiarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/limite-diario")
public class LimiteDiarioController {

    private final LimiteDiarioService limiteDiarioService;

    public LimiteDiarioController(LimiteDiarioService limiteDiarioService) {
        this.limiteDiarioService = limiteDiarioService;
    }

    @GetMapping(value = "/{id}")
    public Optional<LimiteDiario> findById(@PathVariable("id") Long id) {
        return limiteDiarioService.findById(id);
    }
}
