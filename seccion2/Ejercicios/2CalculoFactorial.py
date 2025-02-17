import time

# Cálculo del factorial usando recursión
def factorial_recursivo(n):
    if n == 0:
        return 1
    else:
        return n * factorial_recursivo(n-1)

# Cálculo del factorial usando programación dinámica
def factorial_dinamico(n):
    if n == 0:
        return 1
    factorial = 1
    for i in range(1, n + 1):
        factorial *= i
    return factorial

def compare_factorial_methods(n):
    start_time = time.time()
    factorial_recursivo(n)
    recursivo_time = time.time() - start_time

    start_time = time.time()
    factorial_dinamico(n)
    dinamico_time = time.time() - start_time

    print(f"Factorial recursivo tomó: {recursivo_time:.6f} segundos")
    print(f"Factorial dinámico tomó: {dinamico_time:.6f} segundos")

if __name__ == "__main__":
    n = 1000  # Puedes cambiar este valor para probar con diferentes números
    compare_factorial_methods(499)