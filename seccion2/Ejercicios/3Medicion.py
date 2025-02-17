import time

def medir_tiempo_insercion_lista(n):
    lista = []
    start_time = time.time()
    for i in range(n):
        lista.append(i)
    end_time = time.time()
    return end_time - start_time

def medir_tiempo_insercion_diccionario(n):
    diccionario = {}
    start_time = time.time()
    for i in range(n):
        diccionario[i] = i
    end_time = time.time()
    return end_time - start_time

def comparar_tiempos_insercion(n):
    tiempo_lista = medir_tiempo_insercion_lista(n)
    tiempo_diccionario = medir_tiempo_insercion_diccionario(n)

    print(f"Tiempo de inserción en lista: {tiempo_lista:.6f} segundos")
    print(f"Tiempo de inserción en diccionario: {tiempo_diccionario:.6f} segundos")

if __name__ == "__main__":
    n = 100000  # Número de elementos a insertar
    comparar_tiempos_insercion(n)