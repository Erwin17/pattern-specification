package com.app;

import com.app.model.Person;
import com.app.model.TYPE_DOCUMENT;
import com.app.specification.Specification;

public class Main {

    public static void main(String[] args) {
        Person person  = new Person("Nombre", 7, TYPE_DOCUMENT.CC, "12345678");
    }
}
