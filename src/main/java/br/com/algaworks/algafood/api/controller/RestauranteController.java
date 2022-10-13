package br.com.algaworks.algafood.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import br.com.algaworks.algafood.domain.model.Restaurante;
import br.com.algaworks.algafood.domain.repository.RestauranteRepository;
import br.com.algaworks.algafood.domain.service.CadastroRestauranteService;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private CadastroRestauranteService cadastroRestaurante;

    @GetMapping
    public List<Restaurante> listar() {
        return restauranteRepository.findAll();
    }

    @GetMapping("/{restauranteId}")
    public ResponseEntity<Restaurante> buscar(@PathVariable Long restauranteId) {
        Optional<Restaurante> restaurante = restauranteRepository.findById(restauranteId);

        if (restaurante.isPresent()) {
            return ResponseEntity.ok(restaurante.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{restauranteId}")
    public ResponseEntity<?> adicionar(@RequestBody Restaurante restaurante) {
        try {
            restaurante = cadastroRestaurante.salvar(restaurante);

            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(restaurante);
        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @PutMapping("/{restauranteId}")
    public ResponseEntity<?> atualizar(@PathVariable Long restauranteId, @RequestBody Restaurante restaurante) {
        Optional<Restaurante> restauranteAtual = restauranteRepository.findById(restauranteId);
        try {
            if (restauranteAtual.isPresent()) {
                BeanUtils.copyProperties(restaurante, restauranteAtual.get(), "id");

                Restaurante restauranteSalvo = cadastroRestaurante.salvar(restauranteAtual.get());

                return ResponseEntity.ok(restauranteSalvo);
            }
            return ResponseEntity.notFound().build();
        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // @PatchMapping("/{restauranteId}")
    // public ResponseEntity<?> atualizaParcial(@PathVariable Long restauranteId,
    // @RequestBody Map<String, Object> dados) {
    // Restaurante restauranteAtual = restauranteRepository.buscar(restauranteId);

    // if (restauranteAtual == null) {
    // return ResponseEntity.notFound().build();
    // }

    // merge(dados, restauranteAtual);

    // return atualizar(restauranteId, restauranteAtual);
    // }

    // private void merge(Map<String, Object> dadosOrigem, Restaurante
    // restuaranteDestino) {
    // ObjectMapper objectMapper = new ObjectMapper();
    // Restaurante restauranteOrigem = objectMapper.convertValue(dadosOrigem,
    // Restaurante.class);

    // System.out.println(restauranteOrigem);

    // dadosOrigem.forEach((nomePropriedade, valorPropriedade) -> {
    // Field field = ReflectionUtils.findField(Restaurante.class, nomePropriedade);
    // field.setAccessible(true);

    // Object novoValor = ReflectionUtils.getField(field, restauranteOrigem);

    // ReflectionUtils.setField(field, restuaranteDestino, novoValor);
    // });
    // }

    @GetMapping("/com-frete-gratis")
    public List<Restaurante> restaurantesComFreteGratis(String nome) {
        return restauranteRepository.findComFreteGratis(nome);
    }

    @GetMapping("/primeiro")
    public Optional<Restaurante> restaurantePrimeiro() {
        return restauranteRepository.buscarPrimeiro();
    }
}
