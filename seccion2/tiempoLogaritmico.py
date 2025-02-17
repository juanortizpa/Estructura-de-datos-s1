def busqueda_binaria(lista, objetivo):
    """
    Realiza una búsqueda binaria en una lista ordenada para encontrar el índice de un elemento objetivo.

    Args:
        lista (list): Una lista ordenada de elementos.
        objetivo: El elemento que se desea buscar en la lista.

    Returns:
        int: El índice del elemento objetivo en la lista si se encuentra, de lo contrario, -1.
    """
    inicio, fin = 0, len(lista) - 1
    while inicio <= fin:
        medio = (inicio + fin) // 2
        if lista[medio] == objetivo:
            return medio
        elif lista[medio] < objetivo:
            inicio = medio + 1
        else:
            fin = medio - 1
    return -1

numeros = [1, 3, 5, 7, 9, 11, 13, 15]
print(busqueda_binaria(numeros, 1))  # Output: 3 (posición del número)
