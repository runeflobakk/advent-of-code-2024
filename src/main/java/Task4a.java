public class Task4a {

    char X = 'X';
    char M = 'M';
    char A = 'A';
    char S = 'S';

    char[] xmas = new char[]{X, M, A, S};

    public long xXmasInArr(char[][] arr) {
        long totalXMAS = 0;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                totalXMAS += isXmas(arr, 0, x, y, 1, 0) +
                        isXmas(arr, 0, x, y, -1, 0) +
                        isXmas(arr, 0, x, y, 0, -1) +
                        isXmas(arr, 0, x, y, 0, 1) +
                        isXmas(arr, 0, x, y, 1, -1) +
                        isXmas(arr, 0, x, y, 1, 1) +
                        isXmas(arr, 0, x, y, -1, 1) +
                        isXmas(arr, 0, x, y, -1, -1);
            }
        }
        return totalXMAS;
    };

    private int isXmas(char[][] input, int check, int x, int y, int dx, int dy) {
        if (outOfBounds(input, x, y)) return 0;

        if (input[x][y] == xmas[check]) {
            if (check == xmas.length - 1) return 1;

            return isXmas(input, check + 1, x + dx, y + dy, dx, dy);
        }
        return 0;
    }

    private static boolean outOfBounds(char[][] input, int x, int y) {
        return x < 0 || x >= input.length || y >= input[x].length || y < 0;
    }

}

