# pattern-specification

El patrón Specification es un patrón de diseño que permite definir criterios o reglas de negocio que los objetos deben cumplir, basados en condiciones previamente establecidas.

Este patrón utiliza el método **isSatisfiedBy**, el cual se puede emplear para realizar verificaciones simples o para combinar especificaciones mediante operadores lógicos como **AND, OR y NOT**.

Gracias a estos operadores, es posible componer especificaciones complejas y anidadas, lo que facilita la reutilización y combinación de reglas de forma mucho mas flexible.

## Ejemplo

El código proporcionado solo se implementó el método **isSatisfiedBy** y el operador lógico **AND**. 

A continuación, vemos el uso de su implementación:

* Definimos e implementamos dos specifications: la primera nos permite validar si el tipo de documento del usuario es válido, teniendo en cuenta que para el tipo CC es válido únicamente para personas de 18 años de edad o mayores.
```
Person person  = new Person("Nombre", 7, TypeDocument.CC, "12345678", Country.EL_SALVADOR);

Specification<Person> citizenshipCardValidation = new CitizenshipCardSpecification();
```

* Luego hacemos uso de nuestra specification para comprobar si nuestro objeto person cumple con nuestras condiciones.

```
if(citizenshipCardValidation.isSatisfiedBy(person)){
    System.out.println("Age and type document valid");
}else{
    System.out.println("Age or type document invalid");
}
```
* La salida para este escenario es **Age or type document invalid**


* La segunda especificacion, esta destinada a comprobar si el usuario reside en un pais valido para nosotros, y ademas combinamos la primera especificacion para demostrar el uso del operador **and**.
```
Specification<Person> citizenshipCardValidation = new CitizenshipCardSpecification();
Specification<Person> countryValid =  new CountriesValidationSpecification();

Person person2 = new Person("Nombre2", 18, TypeDocument.CC, "123456", Country.COLOMBIA);
if(citizenshipCardValidation.and(countryValid).isSatisfiedBy(person2)){
    System.out.println("Country valid, age valid, type document valid");
}else{
    System.out.println("User invalid.");
}
```

* La salida para este escenario es **Country valid, age valird, type document valid**

 
### NOTA
Puede revisar el código para más detalles sobre la implementación del patrón y su uso.