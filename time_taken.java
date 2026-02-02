package DSA_4sem;
//given an integer array of size n, in one sec you can increase the value of 1 element by 1, find the minimum time in sec to make all elements of the array equal.
//observation: to minimize time makes all element equal to the max element in the array.
//step1: find the max in array
//step2: for every element cal how much its need to be increased to reach the max
//step3: sum all those differences
public class time_taken {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int max = a[0];
        int time = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int j = 0; j < a.length; j++) {
            time = time + (max - a[j]);

        }
        System.out.println(time);
    }
}
