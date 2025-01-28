import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class HiTest {

    @Test
    void itWorks() {
        assertDoesNotThrow(new Hi()::main);
    }

}
