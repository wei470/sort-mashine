import java.util.Arrays;

public class SortMachine {
    
    public static void print(int[] array, String name){
System.out.println("Sorted Array using " + name + "Sort: \n" + Arrays.toString(array));
    }
    
    public static void main(String[] args) {
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {64, 34, 25, 12, 22, 11, 90};
        int[] array3 = {64, 34, 25, 12, 22, 11, 90};
        int[] array4 = {64, 34, 25, 12, 22, 11, 90};
        int[] array5 = {64, 34, 25, 12, 22, 11, 90};
        int[] array6 = {64, 34, 25, 12, 22, 11, 90};
        SortAlgorithm sorter1 = new QuickSort();
        SortAlgorithm sorter2 = new InsertionSort();
        SortAlgorithm sorter3 = new MergeSort();
        SortAlgorithm sorter4 = new HeapSort();
        SortAlgorithm sorter5 = new BubbleSort();
        SortAlgorithm sorter6 = new SelectionSort();


        System.out.println("Original Array: " + Arrays.toString(array1));
        sorter1.sort(array1);
        print(array1,"Quick");
        
        sorter2.sort(array2);
        print(array2,"Insertion"); 
        
        sorter3.sort(array3);
        print(array3,"Merge");
      
        sorter4.sort(array4);
        print(array4,"Heap");
        
        sorter3.sort(array5);
        print(array5,"Bubble");
      
        sorter4.sort(array6);
        print(array6,"Selection");
    }
}