package DSA_4sem;
public class second_num {
    public static void main(String[] args) {
        int a[] = {1,2,8,4,9,6,9,8};
        int max = a[0];
        int second_max = a[0];
        for(int i = 1 ; i<a.length ; i++){
            if(a[i]> max){
                max= a[i];
            }

        }for(int j = 1 ; j<a.length ; j++){
            if(a[j]> second_max && a[j]!= max){
                second_max= a[j];
            }
        }if(max==second_max){
            System.out.println("no second largest element");
        }else {
            System.out.println(second_max);
        }
    }
}

