package question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloworldTest {
    @Test
    public void sayHelloTest() {
        Helloworld helloworld = new Helloworld();
        assertTrue(helloworld.sayHello() == "Hello world!");
    }
}
