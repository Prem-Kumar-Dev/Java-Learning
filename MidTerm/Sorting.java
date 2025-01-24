public class Sorting {

    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j = i;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static int[] insertion(int[] arr){
        for(int i =0;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>arr[j+1]){

                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(ei>=si){
            return;
        }
        int mid = (ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }
    public static void merge(int[] arr,int si,int ei,int mid){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j=ei;
        int k=0;

        while(i<=mid && j<=mid+1){
            if(arr[i]>arr[j]) {
                temp[k] = arr[j];
                k++;
                j++;
            }else{
                temp[k]=arr[i];
                k++;
                i++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;i++;
        }
        while(j<=mid+1){
            temp[k]=arr[j];
            k++;j++;
        }
    }
    public static void quicksort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=parition(arr,si,ei);
        quicksort(arr,si,pidx-1);
        quicksort(arr,pidx+1,ei);

    }
    public static int parition(int[] arr,int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=arr[j];
            }


        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=pivot;
        return i;

    }
    public static void disp(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr= {6,5,9,2,3,8,2,5};
        bubbleSort(arr);
        disp(arr);


        selection(arr);
        disp(arr);

        insertion(arr);
        disp(arr);
        mergeSort(arr,0,arr.length-1);
        disp(arr);
        quicksort(arr,0,arr.length-1);
        disp(arr);

    }
}