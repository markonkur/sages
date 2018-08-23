package pl.com.sages.maven.hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void shouldBeNotAdult() {
        Person person = new Person();
        person.age=15;
        assertFalse(person.isAdult());
    }
    @Test
    public void shouldBeAdult() {
        Person person = new Person();
        person.age=20;
        assertTrue(person.isAdult());
    }
}