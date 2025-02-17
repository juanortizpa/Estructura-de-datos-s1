import time
import random

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        L = arr[:mid]
        R = arr[mid:]

        merge_sort(L)
        merge_sort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1

def compare_sorts():
    size = 10000
    arr = [random.randint(0, 10000) for _ in range(size)]

    arr_copy = arr.copy()
    start_time = time.time()
    bubble_sort(arr_copy)
    bubble_sort_time = time.time() - start_time

    arr_copy = arr.copy()
    start_time = time.time()
    merge_sort(arr_copy)
    merge_sort_time = time.time() - start_time

    print(f"Bubble Sort took: {bubble_sort_time:.6f} seconds")
    print(f"Merge Sort took: {merge_sort_time:.6f} seconds")

if __name__ == "__main__":
    compare_sorts()