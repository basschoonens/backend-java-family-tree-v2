package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {


    @Test
    void getName() {
        // arrange
//        Person person1 = new Person("Bas","Schoonens","man",42);
        var name = "Bas";

        // act
//        String name = person1.getName();
        var person = new Person("Bas","Schoonens","man", 42);

        // assert
        assertEquals(name, person.getName());
    }

    @Test
    void getMiddleName() {
        // arrange
        var middleName = "Peter";

        // act
        var person = new Person("Bas","Peter","Schoonens","man", 42);

        // assert
        assertEquals(middleName, person.getMiddleName());
    }

    @Test
    void getLastName() {
        // arrange


        // act

        // assert
    }

    @Test
    void getSex() {
        // arrange

        // act

        // assert
    }

    @Test
    void getAge() {
        // arrange

        // act

        // assert
    }

    @Test
    void getMother() {
        // arrange

        // act

        // assert
    }

    @Test
    void getFather() {
        // arrange

        // act

        // assert
    }

    @Test
    void getSiblings() {
        // arrange

        // act

        // assert
    }

    @Test
    void getChildren() {
        // arrange

        // act

        // assert
    }

    @Test
    void getPets() {
        // arrange

        // act

        // assert
    }

    @Test
    void addParents() {
        // arrange
        var bojoura = new Person("Bojoura", "Blom","vrouw",20);
        var tim = new Person("Tim","Blom","man",25);
        var bart = new Person("Bart","Blom","man",6);

        // act

        bart.addParents(tim, bojoura);

        Person mother = bart.getMother();
        Person father = bart.getFather();

        // assert

        assertEquals(bojoura.getName(),mother.getName());
        assertEquals(tim.getName(),father.getName());

    }

    @Test
    void addChild() {
        // arrange
//        var bas = new Person("Bas","Schoonens","man",42);
//                bas.addChild("Anne-Lynn");
        // act

        // assert

    }

    @Test
    void addPet() {
        // arrange

        // act

        // assert

    }

    @Test
    void addSibling() {
        // arrange

        // act

        // assert

    }

    @Test
    void getGrandchildren() {
        // arrange

        // act

        // assert

    }

}