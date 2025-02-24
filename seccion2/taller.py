import time
import math

# 1. Análisis de Complejidad en un Algoritmo de Ordenamiento
def ordenamiento_burbuja(lista):
    n = len(lista)
    for i in range(n):
        for j in range(0, n-i-1):
            if lista[j] > lista[j+1]:
                lista[j], lista[j+1] = lista[j+1], lista[j]

def ordenamiento_merge(lista):
    if len(lista) > 1:
        mitad = len(lista) // 2
        izquierda = lista[:mitad]
        derecha = lista[mitad:]

        ordenamiento_merge(izquierda)
        ordenamiento_merge(derecha)

        i = j = k = 0
        while i < len(izquierda) and j < len(derecha):
            if izquierda[i] < derecha[j]:
                lista[k] = izquierda[i]
                i += 1
            else:
                lista[k] = derecha[j]
                j += 1
            k += 1

        while i < len(izquierda):
            lista[k] = izquierda[i]
            i += 1
            k += 1

        while j < len(derecha):
            lista[k] = derecha[j]
            j += 1
            k += 1

# 2. Cálculo del Factorial con Diferentes Algoritmos
def factorial_recursivo(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial_recursivo(n - 1)

def factorial_dinamico(n):
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado

# 3. Medición del Tiempo de Inserción en Diferentes Estructuras
def medir_tiempo_insercion():
    lista = []
    diccionario = {}

    inicio_lista = time.time()
    for i in range(100000):
        lista.append(i)
    fin_lista = time.time()

    inicio_diccionario = time.time()
    for i in range(100000):
        diccionario[i] = i
    fin_diccionario = time.time()

    print(f"Tiempo de inserción en lista: {fin_lista - inicio_lista} segundos")
    print(f"Tiempo de inserción en diccionario: {fin_diccionario - inicio_diccionario} segundos")

# 4. Implementación de la Función de Fibonacci con Diferentes Enfoques
def fibonacci_recursivo(n):
    if n <= 1:
        return n
    return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2)

def fibonacci_dinamico(n):
    if n <= 1:
        return n
    fib = [0, 1]
    for i in range(2, n + 1):
        fib.append(fib[i - 1] + fib[i - 2])
    return fib[n]

# 5. Comparación de Complejidad de Algoritmos de Búsqueda
def busqueda_lineal(lista, objetivo):
    for elemento in lista:
        if elemento == objetivo:
            return True
    return False

def busqueda_binaria(lista, objetivo):
    izquierda, derecha = 0, len(lista) - 1
    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        if lista[medio] == objetivo:
            return True
        elif lista[medio] < objetivo:
            izquierda = medio + 1
        else:
            derecha = medio - 1
    return False

# Prueba de los algoritmos
if __name__ == "__main__":
    lista_prueba = [5, 2, 9, 1, 5, 6]
    
    print("Ordenamiento Burbuja:")
    ordenamiento_burbuja(lista_prueba.copy())
    
    print("Ordenamiento Merge:")
    ordenamiento_merge(lista_prueba.copy())
    
    print("\nFactorial Recursivo de 5:", factorial_recursivo(5))
    print("Factorial Dinámico de 5:", factorial_dinamico(5))
    
    medir_tiempo_insercion()
    
    print("\nFibonacci Recursivo de 10:", fibonacci_recursivo(10))
    print("Fibonacci Dinámico de 10:", fibonacci_dinamico(10))
    
    lista_busqueda = list(range(1000000))
    print("\nBúsqueda Lineal de 999999:", busqueda_lineal(lista_busqueda, 999999))
    print("Búsqueda Binaria de 999999:", busqueda_binaria(lista_busqueda, 999999))