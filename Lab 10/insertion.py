def insertion_sort(arr):
    comparisons = 0
    shifts = 0
    for i in range(1, len(arr)): # start from 2nd element
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            comparisons += 1
            arr[j + 1] = arr[j] # shift
            shifts += 1
            j -= 1
        # count the last comparison that failed the while condition
        if j >= 0:
            comparisons += 1
        arr[j + 1] = key
        print(f"Step {i}: {arr}")
    return arr, comparisons, shifts

numbers = [12, 11, 13, 5, 6]
print("Original list:", numbers)
sorted_list, comps, shifts = insertion_sort(numbers)
print("Sorted list:", sorted_list)
print("Number of comparisons:", comps)
print("Number of shifts:", shifts)