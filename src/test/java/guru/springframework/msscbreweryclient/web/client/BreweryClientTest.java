package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    public void getBeerById() {
        BeerDto beerDto = client.getBeerById(UUID.randomUUID());
        System.out.println(beerDto.toString());
        assertNotNull(beerDto);
    }

    @Test
    void saveNewBeerTest() {
        BeerDto quilmes = BeerDto.builder().beerName("Quilmes").upc(99l).build();
        URI newBeerUri = client.saveNewBeer(quilmes);
        System.out.println("newBeerUri = " + newBeerUri);
        assertNotNull(newBeerUri);
    }

    @Test
    void updateBeerTest() {
        BeerDto quilmes = BeerDto.builder().beerName("Quilmes").upc(99l).build();
        client.updateBeer(UUID.randomUUID(), quilmes);
    }

    @Test
    void deleteBeerTest() {
        client.deleteBeer(UUID.randomUUID());
    }
}