class Solution {
    static void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0 ; i<n-1;i++){
            int mi=i;
            for(int j = i+1;j<n;j++){
                if (arr[j]<arr[mi]){
                    mi=j;
                }
            }
            
            int temp = arr[i];
            arr[i]=arr[mi];
            arr[mi]=temp;
            
        }
    }
    
    static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {4,1,3,9,7};
        
        System.out.println("Original array: ");
        printArray(arr);
        
        selectionSort(arr);
        
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
