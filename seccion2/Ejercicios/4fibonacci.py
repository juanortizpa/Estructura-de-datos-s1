# Cálculo de Fibonacci usando recursión simple
def fibonacci_recursivo(n):
    if n <= 1:
        return n
    else:
        return fibonacci_recursivo(n-1) + fibonacci_recursivo(n-2)

# Cálculo de Fibonacci usando programación dinámica
def fibonacci_dinamico(n):
    if n <= 1:
        return n
    fib = [0] * (n + 1)
    fib[1] = 1
    for i in range(2, n + 1):
        fib[i] = fib[i-1] + fib[i-2]
    return fib[n]

def compare_fibonacci_methods(n):
    import time

    start_time = time.time()
    fib_recursivo = fibonacci_recursivo(n)
    recursivo_time = time.time() - start_time

    start_time = time.time()
    fib_dinamico = fibonacci_dinamico(n)
    dinamico_time = time.time() - start_time

    print(f"Fibonacci recursivo ({n}) = {fib_recursivo}, tomó: {recursivo_time:.6f} segundos")
    print(f"Fibonacci dinámico ({n}) = {fib_dinamico}, tomó: {dinamico_time:.6f} segundos")

if __name__ == "__main__":
    n = 30  # Puedes cambiar este valor para probar con diferentes números
    compare_fibonacci_methods(n)