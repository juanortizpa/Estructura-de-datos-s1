def ordenar_burbuja(lista):
    """
    Ordena una lista de elementos utilizando el algoritmo de ordenamiento de burbuja.

    El algoritmo de burbuja compara elementos adyacentes y los intercambia si están en el orden incorrecto.
    Este proceso se repite hasta que la lista esté ordenada.

    Args:
        lista (list): La lista de elementos a ordenar.

    Returns:
        list: La lista ordenada en orden ascendente.
    """
    n = len(lista)
    for i in range(n):
        for j in range(n - i - 1):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]  # Intercambiar
    return lista

numeros = [5, 2, 9, 1, 7]
print(ordenar_burbuja(numeros))  # Output: [1, 2, 5, 7, 9]
