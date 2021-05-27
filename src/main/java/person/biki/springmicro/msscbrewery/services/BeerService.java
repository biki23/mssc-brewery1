package person.biki.springmicro.msscbrewery.services;

import person.biki.springmicro.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}