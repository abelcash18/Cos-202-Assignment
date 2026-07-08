def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        swapped = False
        for j in range(n - 1 - i): # after each pass, the last i elements are already sorted
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j] # swap
                swapped = True

        print(f"Pass {i + 1} completed")
        if not swapped:
            print("Early termination: list already sorted, stopping early.")
            break
    return arr

numbers = [64, 34, 25, 12, 22, 11, 90]
print("Original list:", numbers)
sorted_list = bubble_sort(numbers)
print("Sorted list:", sorted_list)