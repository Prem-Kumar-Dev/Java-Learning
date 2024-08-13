import java.util.Scanner;


public class searching {

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int[] arr, int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
        //time complexity = O(n) :cause loop goes n time for wrost case;
    }

    public static int[] largest_smallest(int[] arr) {
        int largest = arr[0];  //Integer.MIN_VALUE --> can be used to assign -infinity
        int smallest = arr[0]; //Integer.MAX_VALUE --> can be used to assign +infinity
        int indexlarge = 0;
        int indexsmall = 0;
        for (int i=1;i<arr.length;i++) {
            if (arr[i]>largest) {
                largest = arr[i];
                indexlarge = i;
            }
            if (arr[i]<smallest) {
                smallest = arr[i];
                indexsmall = i;
            }
        }
        return new int[]{largest,indexlarge,smallest,indexsmall};

        //TC => O(n)
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid =(low+high)/2;
            if (arr[mid]==key) {
                return mid;
            }
            else if (arr[mid]<key) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return -1;

        //TC => O(log(n))
    }

    public static void reverse(int[] arr){
        int low=0;
        int high=arr.length-1;
        while (low<high){
            int lowVal=arr[low];
            arr[low]=arr[high];
            arr[high]=lowVal;
            low+=1;
            high-=1;
        }
    }





    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,8,50};

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the element to be searched: ");
//        int n = sc.nextInt();

//        int result=linearSearch(num,n);
//        System.out.println("Element found at index: " + ((result == -1) ? "Not found" : result));
//        System.out.println("Largest element="+largest_smallest(num)[0]+" At index="+largest_smallest(num)[1]);
//        System.out.println("Smallest element="+largest_smallest(num)[2]+" At index="+largest_smallest(num)[3]);

//        int result=binarySearch(num,n);
//        System.out.println("Element found at index: " + ((result == -1) ? "Not found" : result));

        reverse(num);
        printarr(num);



    }
}