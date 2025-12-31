package pokemon_client.service;

import org.springframework.stereotype.Service;
import pokemon_client.model.Pokemon;

@Service
public class PokemonService {

    private final PokemonFetcher fetcher;

    public PokemonService(PokemonFetcher fetcher) {
        this.fetcher = fetcher;
    }

    public Pokemon getPokemonByNameOrId(String query) {
        return fetcher.fetch(query.toLowerCase());
    }
}

