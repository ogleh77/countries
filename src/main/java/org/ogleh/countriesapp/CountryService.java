package org.ogleh.countriesapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepo countryRepo;


    public void addCountry(Country country) {
        countryRepo.save(country);
    }

    public Country getCountry(int countryId) {
        return countryRepo.findById(countryId).orElse(null);
    }

    public List<Country> getAllCountries() {
        return countryRepo.findAll();
    }
}
