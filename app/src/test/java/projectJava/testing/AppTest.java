/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import projectJava.testing.App;

class SomeClassTest {

    @Test
    public void testSum() {
        var expected = 5;
        var actual = App.sum(3, 2);
        assertEquals(expected, actual);
    }
}