import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void getName() throws Exception {
        HelloWorld john = new HelloWorld("John");
        assertEquals("John",john.getName());
    }
}