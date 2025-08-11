package com.app;

import com.app.model.Country;
import com.app.model.Person;
import com.app.model.TypeDocument;
import com.app.specification.Specification;
import com.app.specification.person.CitizenshipCardSpecification;
import com.app.specification.person.CountriesValidationSpecification;

public class Main {

    public static void main(String[] args) {
        Person person  = new Person("Nombre", 7, TypeDocument.CC, "12345678", Country.EL_SALVADOR);
        Person person2 = new Person("Nombre2", 18, TypeDocument.CC, "123456", Country.COLOMBIA);

        Specification<Person> citizenshipCardValidation = new CitizenshipCardSpecification();
        Specification<Person> countryValid =  new CountriesValidationSpecification();

        System.out.println("========Person-1============");
        //Validation CC and age >=18
        if(citizenshipCardValidation.isSatisfiedBy(person)){
            System.out.println("Age and type document valid");
        }else{
            System.out.println("Age or type document invalid");
        }

        System.out.println("========Person-2============");
        //Validation CC and age >= 18 and country valid
        if(citizenshipCardValidation.and(countryValid).isSatisfiedBy(person2)){
            System.out.println("Contry valid, age valird, type document valid");
        }else{
            System.out.println("User invalid.");
        }






    }
}
