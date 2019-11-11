package com.adrianilea.javacourse.lesson1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest{

    @Test
    public void shouldReturnHelloWorld(){

        Person adrian = new Person();
        assertEquals("Hello World",adrian.helloWorld() );
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop(){

        for (int i=0; i < 4; i++){
            new Person();
        }
        assertEquals(4, Person.numberOfPersons());

        int j= 0;
        while (j < 4){
            new Person ();
            j++;

        }
        assertEquals(8, Person.numberOfPersons());


        j = 0;
        do {
            new Person();
            j++;
        } while (j < 4);
        assertEquals(12, Person.numberOfPersons());

    }

}