 public class QuickSort {

    public static void quickSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }

        //last element as piviot
        int pidx= partition(arr,si,ei);
        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);

    }
    public static  int partition(int[] arr,int si,int ei){
        int pivot = arr[ei];
        int i= si-1; // to malke place for elem smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

     public static void main(String[] args) {
         int[] arr= {6,5,9,2,3,8};
         quickSort(arr,0, arr.length-1);

         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
     }
}