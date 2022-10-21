package org.exemple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinOpsTest {
    private BinOps bins;

    @BeforeEach
    void setUp() {
        bins = new BinOps();
    }

    @Test
    @DisplayName("Проверка сложения")
    void sumTest() {
        assertEquals("110", bins.sum("100", "10"));
    }

    @Test
    @DisplayName("Проверка умножения")
    void multTest() {
        assertEquals("1001", bins.mult("11", "11"));
    }
}
