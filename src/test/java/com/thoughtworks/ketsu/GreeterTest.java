package com.thoughtworks.ketsu;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GreeterTest {

    @Test
    public void test1() {
        Greeter greeter = new Greeter();
        assertThat(greeter.greet("And"), is("Hello Andy"));
    }

    @Test
    public void test2() {
        Greeter greeter = new Greeter();
        assertThat(greeter.greet("Bob"), is("Hello Bob"));
    }
}
