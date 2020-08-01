public class sorting{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        int[] arr = {10,15,2,-1,7};
        selection_sort(arr);
        bubble_sort(arr);
        insertion_sort(arr);
    }

    public static void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
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

    public static void bubble_sort(int[] arr){
        for(int jc = 1;jc<arr.length-1;jc++){  // jc = journey_counter
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

    public static void insertion_sort(int[] arr){
        for(int jc = 1;jc<arr.length-1;jc++){
            for(int i=1;i<arr.length;i++){
                for(int j=i-1;j>=0;j--){
                    if(arr[i]<arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp; 
                    }
                }
            }    
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}