import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MinimalMavenDemoTest {
    @Test
    fun testSayHello() {
        var minimalMavenDemo = MinimalMavenDemo()
        assertEquals("Maven demo says hi!", minimalMavenDemo.sayHello())
    }
}
