package br.com.coffeeandit.service;


import br.com.coffeeandit.entity.LimiteDiario;
import br.com.coffeeandit.repository.LimiteDiarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class LimiteDiarioService {

    private final LimiteDiarioRepository limiteDiarioRepository;

    public LimiteDiarioService(LimiteDiarioRepository limiteDiarioRepository) {
        this.limiteDiarioRepository = limiteDiarioRepository;
    }

    public Optional<LimiteDiario> findById(Long id) {
        return Optional.ofNullable(limiteDiarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Recurso nao encontrado")));
    }

}
