package task4;
import java.util.stream.Stream;

public class Task4b {

    char M = 'M';
    char A = 'A';
    char S = 'S';

    char[] xmas = {M, A, S};

    public long xXmasInArr(char[][] arr) {
        long totalXMAS = 0;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                totalXMAS += isXmas(arr, 1, x, y);
            }
        }
        return totalXMAS;
    }

    ;

    private int isXmas(char[][] input, int check, int x, int y) {
        if (outOfBounds(input, x, y)) return 0;

        if (input[x][y] == xmas[check] && x > 0 && x < input[y].length - 1 && y > 0 && y < input.length - 1) {
            final Stream<String> diagonals = getDiagonals(input, x, y);
            return diagonals.filter(s -> s.equals("SAM") || s.equals("MAS"))
                    .count() == 2 ? 1 : 0;

        }
        return 0;
    }

    private static Stream<String> getDiagonals(char[][] input, int x, int y) {
        var c1 = new String(new char[]{input[x - 1][y - 1], input[x][y], input[x + 1][y + 1]});
        var c2 = new String(new char[]{input[x + 1][y - 1], input[x][y], input[x - 1][y + 1]});

        return Stream.of(c1, c2);
    }

    private static boolean outOfBounds(char[][] input, int x, int y) {
        return x < 0 || x >= input.length || y >= input[x].length || y < 0;
    }

}

