package com.app.specification.person;

import com.app.model.TYPE_DOCUMENT;
import com.app.specification.AbstractSpecification;
import com.app.model.Person;
public class CitizenshipCardSpecification extends AbstractSpecification<Person> {

    private final int minAgeForCC = 18;

    @Override
    public boolean isSatisfiedBy(Person person) {
        return person.getAge() >= minAgeForCC && person.getTypeDocument().equals(TYPE_DOCUMENT.CC);
    }
}
