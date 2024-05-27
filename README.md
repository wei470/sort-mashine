# sort-mashine
In the sorting algorithm project, we implemented six common sorting methods: bubble sort, heap sort, insertion sort, merge sort, quick sort, and selection sort. Each sorting algorithm has its own specific application scenario. The following is a detailed introduction to the working principle, examples, and time and space complexity of each algorithm.

# Bubble Sort

Working principle: By repeatedly traversing the list to be sorted, comparing each pair of adjacent elements, and swapping them if they are in the wrong order. Traverse the list until no more swaps are needed, at which point the list is sorted.
Example: Use bubble sort on the array [5, 1, 4, 2, 8]. After the first traversal, the largest number is moved to the end, and the array becomes [1, 4, 2, 5, 8]. Repeat this process until the array is completely ordered.
Complexity: The time complexity is O(n²) In all cases, the space complexity is O(1).

# Heap Sort

Working principle: By constructing the sequence to be sorted into a big top heap, so that the value of each parent node is greater than or equal to the value of the child node, then swapping the element at the top of the heap (the maximum value) with the element at the bottom of the heap, and then re-adjusting the heap structure.
Example: Use heap sort on the array [4, 10, 3, 5, 1]. First construct a big top heap, then gradually remove the top of the heap to the end of the array, and reconstruct the heap.
Complexity: Time complexity is O(n log n), space complexity is O(1).

# Insertion Sort

Working principle: By constructing an ordered sequence, for unsorted data, scan from back to front in the sorted sequence, find the corresponding position and insert it.
Example: Use insertion sort on the array [22, 27, 16, 15, 18]. Starting from the second element, insert 27 after 22, and then insert 16 to the correct position between 22 and 27.
Complexity: The best case time complexity is O(n), the average and worst cases are O(n²). The space complexity is O(1).

# Merge Sort

How it works: Using a divide-and-conquer strategy, the array is divided into two halves of equal length, recursively merge-sorted them, and then merged into a large sorted array.
Example: Use merge sort on the array [38, 27, 43, 3, 9]. First divide it into [38, 27] and [43, 3, 9], sort them separately and then merge them.
Complexity: The time complexity is O(n log n), and the space complexity is O(n).

# Quick Sort

How it works: By selecting an element as the pivot, the array is rearranged, and all elements smaller than the pivot are placed before the pivot, and those larger than the pivot are placed after the pivot. Then recursively repeat this process in the subarrays before and after the pivot.
Example: Use quick sort on the array [10, 7, 8, 9, 1, 5]. The last element 5 is selected as the pivot, and the array is partitioned into [1, 5, 7, 8, 9, 10].
Complexity: The average time complexity is O(n log n), and the worst case is O(n²). The space complexity is O(log n), mainly because of the stack space for recursive calls.

# Selection Sort

How it works: The selection sort algorithm works by repeatedly selecting the smallest element of the unsorted part and placing it at the end of the sorted sequence.
Example: Use selection sort on the array [29, 10, 14, 37, 13]. The first time, the smallest 10 is selected and placed first, then 13, and so on, until all elements are properly sorted.
Complexity: The time complexity is always O(n²) because no matter how the array is initially sorted, selection sort needs to compare each unsorted element to find the minimum value. The space complexity is O(1).
Each of the above sorting methods has its own advantages and disadvantages and is suitable for different application scenarios:
