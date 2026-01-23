
// Create an array and count no. of element having atleast 1 element greater than itself.
public class CountingElement {
    public static void main(String[] args) {
        int[] array = {9, 9, 9, 9, 9, 9, 9, 9};
        int count = 0;
        int max = array[0];
        int no_max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max: " + max);
        for (int j = 0; j < array.length; j++) {
            if (array[j] == max) {
                no_max=no_max + 1;
            }
        }
        System.out.println("number of max no. are:  "+no_max);
        for (int i = 0; i< array.length; i++){
            if(array[i] != max){
                count = count + 1;
            }
        }
        System.out.print("number of element excluding max number: " + count);
    }
}

/*Step 1: Start
Step 2: Declare an integer array A of size N
Step 3: Declare integer variables max and count
Step 4: Set

        max = A[0]
count = 0

Step 5: Find the maximum element in the array

Repeat for i = 0 to N - 1
If A[i] > max then
Set max = A[i]
End If
End Repeat

Step 6: Count elements having at least one greater element

Repeat for i = 0 to N - 1
If A[i] ≠ max then
Set count = count + 1
End If
End Repeat

Step 7: Display count
Step 8: Stop*/
