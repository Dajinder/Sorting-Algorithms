import java.util.Arrays;
public class sorting{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        // int[] arr = {5,9,8,1,2};
        // selection_sort(arr);
        // bubble_sort(arr);
        // insertion_sort(arr);

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);

        // int[] arr1 = {2,5,12,18,20};
        // int[] arr2 = {7,9,11,15,25,28,30,35};
        // int[] res = merge2sortedarrays(arr1,arr2);
        // System.out.print(Arrays.toString(res));

        int[] arr = {7,4,1,3,6,8,2,5};
        int[] res = mergeSort(arr,0,arr.length-1);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        
    }

    
    public static void bubbleSort(int[] arr){
        for(int itr = 1; itr<arr.length-1; itr++){
            for(int i=0,j=1;j<arr.length;i++,j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int itr=0;itr<arr.length-1;itr++){
            for(int i=0,min=0,j=i+1;j<arr.length;i++,min++,j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static int[] merge2sortedarrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        // for(int x=0;x<arr3.length;x++){
        //     System.out.print(arr3[x]+" ");
        // }

        return arr3;
    }

    public static int[] mergeSort(int[] arr, int lo, int hi){
        if(lo == hi){
            int[] basearray = new int[1];
            basearray[0] = arr[lo];
            return basearray;
        }
        
        int mid = (lo+hi)/2;

        int[] fsh = mergeSort(arr,lo,mid);
        int[] ssh = mergeSort(arr,mid+1,hi);
        int[] fsa = merge2sortedarrays(fsh,ssh);

        // for(int i=0;i<fsa.length;i++){
        //     System.out.print(fsa[i]+" ");
        // }

        return fsa;

    }

}