def median_of_three(arr, low, high):
    mid = (low + high) // 2
    a, b, c = arr[low], arr[mid], arr[high]

    # return index of median value
    if (a <= b <= c) or (c <= b <= a):
        return mid
    elif (b <= a <= c) or (c <= a <= b):
        return low
    else:
        return high

def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1

    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

def quick_sort_median3(arr, low, high):
    if low < high:
        pivot_idx = median_of_three(arr, low, high)
        arr[pivot_idx], arr[high] = arr[high], arr[pivot_idx] # move chosen pivot to end

        p = partition(arr, low, high)
        quick_sort_median3(arr, low, p - 1)
        quick_sort_median3(arr, p + 1, high)
    return arr

numbers = [33, 10, 55, 71, 29, 3, 18, 91, 2]
print("Original list:", numbers)
sorted_list = quick_sort_median3(numbers, 0, len(numbers) - 1)
print("Sorted list (median-of-three pivot):", sorted_list)