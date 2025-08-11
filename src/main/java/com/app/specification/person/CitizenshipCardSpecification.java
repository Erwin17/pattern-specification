package com.app.specification.person;

import com.app.model.TypeDocument;
import com.app.specification.AbstractSpecification;
import com.app.model.Person;

public class CitizenshipCardSpecification extends AbstractSpecification<Person> {

    private final int minAgeForCC = 18;

    @Override
    public boolean isSatisfiedBy(Person person) {
        return person.getAge() >= minAgeForCC && person.getTypeDocument().equals(TypeDocument.CC);
    }
}
