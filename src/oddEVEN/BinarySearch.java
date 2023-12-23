package oddEVEN;
public class BinarySearch {

    boolean binarySearchMethod(int[] givemearray, int target) {

        int lowerbound = 0;
        int upperbound = givemearray.length;
        while (lowerbound < upperbound) {
            int mid = lowerbound + (upperbound - lowerbound) / 2;

            if (givemearray[mid] == target) {
                return true;
            }
            if (givemearray[mid] < target) {

                lowerbound = givemearray[mid] + 1;

            } else {
                upperbound = givemearray[mid] - 1;
            }

        }
        return false;
    }

    int[] getSortedArray(int[] unsortedarray) {
        int i = 0;
        while (i < unsortedarray.length) {
            if (unsortedarray[i] > unsortedarray[i + 1]) {
                int temp = unsortedarray[i];
                unsortedarray[i] = unsortedarray[i + 1];
                unsortedarray[i + 1] = temp;
            }
            i++;
        }
        return unsortedarray;
    }

}
