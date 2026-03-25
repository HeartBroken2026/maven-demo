package com.example; // Remove "test.java" [cite: 34]

import org.junit.Test; // [cite: 42]
import static org.junit.Assert.*; // [cite: 43]

public class AppTest { // [cite: 44]
    @Test // [cite: 45]
    public void testAdd() { // [cite: 46]
        App app = new App(); // Now it can find App because they are in the same package [cite: 47]
        assertEquals(5, app.add(2, 3)); // 
    }
}