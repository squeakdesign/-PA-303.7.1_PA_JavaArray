import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        /*Write a program to sort the following int array
         in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
          and print the smallest and the largest element of the array.
          The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13*/
        int[] a={4,2,9,13,1,0};


        int minval=a[0];
        int maxval=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<minval)
            {minval=a[i];
            }
            if(a[i]>maxval){
                maxval=a[i];
            }
        }
            System.out.println(Arrays.toString(a));
            System.out.println("The largest number is "+ minval);
        System.out.println("The biggest number is "+maxval);
        /*int[] myarray = {0, 2, 4, 6, 8, 10};
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < minVal) {
                minVal = myarray[i];
            }
        }
        System.out.println("minVal = " +
                minVal);*/


    }
}
