package pokemon_client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pokemon_client.model.Pokemon;
import pokemon_client.service.PokemonService;


@Controller
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon")
    public String showPokemon(@RequestParam(required = false) String query, Model model) {

        if (query != null && !query.isBlank()) {
            Pokemon pokemon = pokemonService.getPokemonByNameOrId(query.trim().toLowerCase());

            if (pokemon == null) {
                model.addAttribute("error", "Pokémon no encontrado");
            } else {
                model.addAttribute("pokemon", pokemon);
            }
        }

        return "pokemon";
    }
}
