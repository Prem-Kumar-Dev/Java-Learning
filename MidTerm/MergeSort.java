public class MergeSort {


    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2; //or (si+ei)/2

        //to seperate the arry from mid
        //we only need mid since indiex can be si--mid and mid+1--ei
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }

    public static void merge(int[] arr,int si,int mid,int ei){
        // size is (0,4) and (5,6)
        //here si=0,mid=4 and ei=6
        //size = 0,1,2,3,4,5,6=ei-si+1=6-0+1;

        int temp[] = new int[ei-si+1];
        int i = si;//left
        int j = mid+1;//right
        int k = 0;//temp index

        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;k++;
            }else{
                temp[k]=arr[i];
                i++;k++;
            }
        }
        //left part which ar left
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }
        //right part which are left
        while (j<=ei){
            temp[k]=arr[j];
            j++;k++;
        }
        //copy to arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr= {6,5,9,2,3,8};
        mergeSort(arr,0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}