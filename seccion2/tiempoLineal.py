def encontrar_maximo(lista):
    """
    Encuentra el valor máximo en una lista de números.

    Args:
        lista (list): Una lista de números.

    Returns:
        int/float: El valor máximo encontrado en la lista.

    Raises:
        ValueError: Si la lista está vacía.
    """
    maximo = lista[0]  # Inicializar con el primer elemento
    for num in lista:
        if num > maximo:
            maximo = num
    return maximo

numeros = [2, 8, 1, 6, 12, 5, 3]
print(encontrar_maximo(numeros))  # Output: 12
