package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());

        int expectedOutputA = 100;
        assertEquals(expectedOutputA, baseDemo.sum(30, 70));
        int expectedOutputB = -9;
        assertEquals(expectedOutputB, baseDemo.sum(-19, 10));
        int expectedOutputC = 0;
        assertEquals(expectedOutputC, baseDemo.sum(1, -1));
    }
}
