import time
import random

# Búsqueda lineal
def busqueda_lineal(arr, x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1

# Búsqueda binaria
def busqueda_binaria(arr, x):
    low = 0
    high = len(arr) - 1
    mid = 0

    while low <= high:
        mid = (high + low) // 2
        if arr[mid] < x:
            low = mid + 1
        elif arr[mid] > x:
            high = mid - 1
        else:
            return mid
    return -1

def compare_search_methods(size):
    arr = sorted([random.randint(0, size) for _ in range(size)])
    x = random.choice(arr)

    start_time = time.time()
    busqueda_lineal(arr, x)
    lineal_time = time.time() - start_time

    start_time = time.time()
    busqueda_binaria(arr, x)
    binaria_time = time.time() - start_time

    print(f"Búsqueda lineal en lista de tamaño {size} tomó: {lineal_time:.6f} segundos")
    print(f"Búsqueda binaria en lista de tamaño {size} tomó: {binaria_time:.6f} segundos")

if __name__ == "__main__":
    for size in [1000, 10000, 100000]:
        compare_search_methods(size)