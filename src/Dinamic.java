public class Dinamic {

    public static int findNumber(int findNumber) {
        if (findNumber <= 1) {
            return findNumber;
        }

        int[] result = new int[findNumber + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= findNumber; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[findNumber];
    }
}
