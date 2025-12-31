package pokemon_client.service;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import pokemon_client.model.Pokemon;

@Component
public class PokemonFetcherImpl implements PokemonFetcher {

    private final WebClient webClient;

    public PokemonFetcherImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Pokemon fetch(String nameOrId) {
        return webClient
                .get()
                .uri("/pokemon/{value}", nameOrId)
                .retrieve()
                .bodyToMono(Pokemon.class)
                .block();
    }
}
