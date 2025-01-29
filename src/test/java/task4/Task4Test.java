package task4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Test {

    String input = """
            MMMSXXMASM
            MSAMXMSMSA
            AMXSXMAAMM
            MSAMASMSMX
            XMASAMXAMM
            XXAMMXXAMA
            SMSMSASXSS
            SAXAMASAAA
            MAMMMXMMMM
            MXMXAXMASX
            """;
    private char[][] chararr;

    @BeforeEach
    void setUp() {
        var linjer = input.split("\\s+");

        chararr = new char[linjer.length][linjer[0].length()];
        for (int i = 0; i < linjer.length; i++) {
            chararr[i] = linjer[i].toCharArray();
        }
    }

    @Test
    void letsgo() {
        
        final long l = new Task4b().xXmasInArr(chararr);

        

        assertEquals(9, l);

    }
}
