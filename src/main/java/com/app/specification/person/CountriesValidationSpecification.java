package com.app.specification.person;

import com.app.model.Country;
import com.app.specification.AbstractSpecification;
import com.app.model.Person;
import java.util.List;


public class CountriesValidationSpecification extends AbstractSpecification<Person> {

    private final List<Country> countriesList = List.of(Country.ARGENTINA, Country.COLOMBIA, Country.CHILE);

    @Override
    public boolean isSatisfiedBy(Person person) {
        return countriesList.stream()
                .anyMatch(element -> person.country().equals(element));
    }
}
