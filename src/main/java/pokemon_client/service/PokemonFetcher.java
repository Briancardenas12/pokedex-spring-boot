package pokemon_client.service;

import pokemon_client.model.Pokemon;

public interface PokemonFetcher {
    Pokemon fetch(String nameOrId);
}
