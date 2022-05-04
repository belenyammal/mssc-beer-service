package guru.springboot.msscbeerservice.web.controller;

import guru.springboot.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {


    @GetMapping("/{beerId}")
    @ResponseStatus(HttpStatus.OK)
    public BeerDto getBeerById(@PathVariable("beerId") UUID beerId) {
        return BeerDto.builder().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNewBeer( @RequestBody BeerDto beerDto) {

    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {

    }
}
