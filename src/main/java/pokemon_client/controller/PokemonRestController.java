package pokemon_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pokemon_client.model.Pokemon;
import pokemon_client.service.PokemonService;

@RestController
public class PokemonRestController {

    private final PokemonService pokemonService;

    public PokemonRestController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/api/pokemon/{name}")
    public Pokemon getpokemon(@PathVariable String name){
        return pokemonService.getPokemonByNameOrId(name);
    }
}
