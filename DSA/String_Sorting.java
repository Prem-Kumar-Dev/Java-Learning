public class String_Sorting {


    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static String[] swap(String[] arr,int i){
        String tmp=arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
        return arr;

    }
    public static String[] bubbleSort(String[] arr) {
        for (int j = 0; j < arr.length-1; j++) {

            for (int i = 0; i<arr.length-1-j; i++) {
                Boolean needSwap=false;

                int n = arr[i].length()>arr[i+1].length()?arr[i+1].length():arr[i].length();

                    for (int j1=0;j1<n;j1++) {
                        char c1= Character.toLowerCase(arr[i].charAt(j1));
                        char c2= Character.toLowerCase(arr[i+1].charAt(j1));

                        if (c1 != c2) {

                            if (c1 > c2) {
                                needSwap=true;
                            }
                            break;


                        }
                    }
                    if (!needSwap && arr[i].length() > arr[i + 1].length()) {
                        needSwap = true;
                    }
                    if (needSwap) {
                        arr=swap(arr,i);
                    }
                }


            }
        return arr;
    }


    public static void main(String[] args) {
        String[] arr ={"zeck","new","a","a","Bbb","ba","c","ss","anna","Zeck"};

        printArr(bubbleSort(arr));

    }
}