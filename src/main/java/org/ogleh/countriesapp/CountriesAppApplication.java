package org.ogleh.countriesapp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class CountriesAppApplication {
private final CountryService countryService;
    public static void main(String[] args) {
        SpringApplication.run(CountriesAppApplication.class, args);
    }


    @PostMapping("/add")
    public String addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
        return "country added.";
    }

    @GetMapping("/{country-id}")
    public Country getCountry(@PathVariable("country-id") int countryId) {
        return countryService.getCountry(countryId);
    }
    @GetMapping("/")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
}
