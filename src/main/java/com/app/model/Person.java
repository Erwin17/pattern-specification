package com.app.model;

public class Person {

    private  Long id;
    private final String name;
    private final int age;
    private final TypeDocument typeDocument;
    private final String document;
    private final Country country;


    public Person(String name, int age, TypeDocument typeDocument, String document, Country country){
        this.id = 0L;
        this.name = name;
        this.age = age;
        this.typeDocument = typeDocument;
        this.document = document;
        this.country = country;
    }

    public Long getId(){return this.id;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public TypeDocument getTypeDocument(){return this.typeDocument;}
    public String getDocument(){return this.document;}
    public Country country(){return this.country;}
}
