package com.app.model;

public class Person {

    private  Long id;
    private final String name;
    private final int age;
    private final TYPE_DOCUMENT typeDocument;
    private final String document;


    public Person(String name, int age, TYPE_DOCUMENT typeDocument, String document){
        this.id = 0L;
        this.name = name;
        this.age = age;
        this.typeDocument = typeDocument;
        this.document = document;
    }

    public Long getId(){return this.id;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public TYPE_DOCUMENT getTypeDocument(){return this.typeDocument;}
    public String getDocument(){return this.document;}
}
