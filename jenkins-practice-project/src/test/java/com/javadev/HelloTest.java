package com.javadev;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void helloTest(){
        Hello hi = new Hello();
        assertEquals("My name Jenkins, I am a CICD tools", hi.hello());
    }

    @Test
    void helloTest2(){
        Hello hi = new Hello();
        assertEquals("My name Jenkins, I am a CICD tools", hi.hello());
    }
}
