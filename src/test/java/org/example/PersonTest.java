package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void getName() {
        // arrange
        var name = "Bas";

        // act
        var person = new Person("Bas", "Schoonens", "man", 42);

        // assert
        assertEquals(name, person.getName());
    }

    @Test
    void getMiddleName() {
        // arrange
        var middleName = "Peter";

        // act
        var person = new Person("Bas", "Peter", "Schoonens", "man", 42);

        // assert
        assertEquals(middleName, person.getMiddleName());
    }

    @Test
    void addParents() {
        // arrange
        var chantal = new Person("Chantal", "Bakker", "vrouw", 20);
        var tim = new Person("Tim", "Bakker", "man", 25);
        var bart = new Person("Bart", "Bakker", "man", 6);
        // act
        bart.addParents(tim, chantal);

        Person mother = bart.getMother();
        Person father = bart.getFather();
        // assert
        assertEquals(chantal.getName(), mother.getName());
        assertEquals(tim.getName(), father.getName());
    }

    @Test
    void addChild() {
        // arrange
        var bas = new Person("Bas", "Schoonens", "man", 42);
        var anneLynn = new Person("Anne Lynn", "Schoonens", "vrouw", 1);

        // act
        bas.addChild(bas, anneLynn);

        // assert
        assertTrue(bas.getChildren().contains(anneLynn));
    }

    @Test
    void addPet() {
        // arrange
        var bas = new Person("Bas", "Schoonens", "man", 42);
        var bobbie = new Pet("Bobbie", 6, "Dachshund");
        var pippa = new Pet("Pippa",1, "Dachshund");

        List<Pet> pets = new ArrayList<>();
        pets.add(bobbie);

        // act
        bas.addPet(bobbie);

        // assert
        assertEquals(pets,bas.getPets());
    }


    @Test
    void addSibling() {
        // arrange
        var bas = new Person("Bas", "Schoonens", "man", 4);
        var noah = new Person("Noah","Schoonens","Man",2);
        var emma = new Person("Emma","Schoonens","Woman",4);
        List<Person> sibblings = new ArrayList<>();
        sibblings.add(noah);
        sibblings.add(emma);

        // act
        bas.addSibling(noah);
        bas.addSibling(emma);

        // assert
        assertEquals(sibblings,bas.getSiblings());
    }

    @Test
    void getGrandchildren() {
        // arrange

        // act

        // assert

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

}