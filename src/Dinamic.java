public class Dinamic {

    public static int findNumber(int nNumberToSearch) {
        if (nNumberToSearch <= 1) {
            return nNumberToSearch;
        }

        int[] result    = new int[nNumberToSearch + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= nNumberToSearch; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[nNumberToSearch];
    }
}
