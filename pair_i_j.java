package DSA_4sem;

public class pair_i_j {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 5, 6, 4, 6, 4, 6};
        int k = 10;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == k && i != j) {
                    c = c + 1;
                }
            }
        }
        if (c > 0) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}


