package pokemon_client.service;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import pokemon_client.model.Pokemon;

@ExtendWith(MockitoExtension.class)
class PokemonServiceTest {

    @Mock
    private PokemonFetcher fetcher;

    @InjectMocks
    private PokemonService pokemonService;

    @Test
    void shouldReturnPokemonWhenFetcherReturnsData() {
        // given
        Pokemon pokemon = new Pokemon();
        pokemon.setName("pikachu");

        when(fetcher.fetch("pikachu")).thenReturn(pokemon);

        // when
        Pokemon result = pokemonService.getPokemonByNameOrId("Pikachu");

        // then
        assertEquals("pikachu", result.getName());
    }

    @Test
    void shouldThrowExceptionWhenPokemonNotFound() {
        // given
        when(fetcher.fetch("unknown"))
                .thenThrow(new RuntimeException("Not found"));

        // when + then
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> pokemonService.getPokemonByNameOrId("unknown")
        );

        assertEquals("Not found", exception.getMessage());
    }

}

