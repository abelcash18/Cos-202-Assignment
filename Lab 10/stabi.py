class Item:
    def __init__(self, key, original_index):
        self.key, self.original_index = key, original_index

    def __repr__(self):
        return f"({self.key},orig:{self.original_index})"

def bubble_sort_stable_check(items):
    items = items.copy()
    n = len(items)
    for i in range(n - 1):
        for j in range(n - 1 - i): # reduce range each pass
            if items[j].key > items[j + 1].key:
                items[j], items[j + 1] = items[j + 1], items[j] # swap
    return items

def is_stable(sorted_items):
    for i in range(len(sorted_items) - 1):
        if sorted_items[i].key == sorted_items[i + 1].key:
            # if original index went backwards, it wasn't stable
            if sorted_items[i].original_index > sorted_items[i + 1].original_index:
                return False
    return True

data = [Item(5, 0), Item(3, 1), Item(5, 2), Item(2, 3), Item(3, 4)]
print("Original:", data)
sorted_data = bubble_sort_stable_check(data)
print("Sorted (Bubble sort):", sorted_data)
print("Is Bubble Sort stable on this data?", is_stable(sorted_data))