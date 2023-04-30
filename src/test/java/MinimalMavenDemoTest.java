import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MinimalMavenDemoTest {
    @Test
    void testSayHello() {
        var minimalMavenDemo = new MinimalMavenDemo();
        assertEquals("Maven demo says hi!", minimalMavenDemo.sayHello());
    }
}
