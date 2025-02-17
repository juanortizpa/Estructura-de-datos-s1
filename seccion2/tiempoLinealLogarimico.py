def merge_sort(lista):
    if len(lista) <= 1:
        return lista
    medio = len(lista) // 2
    izquierda = merge_sort(lista[:medio])
    derecha = merge_sort(lista[medio:])
    return fusionar(izquierda, derecha)

def fusionar(izquierda, derecha):
    """
    Fusiona dos listas ordenadas en una sola lista ordenada.

    Args:
        izquierda (list): La primera lista ordenada.
        derecha (list): La segunda lista ordenada.

    Returns:
        list: Una lista ordenada que contiene todos los elementos de las listas de entrada.
    """
    resultado = []
    while izquierda and derecha:
        if izquierda[0] < derecha[0]:
            resultado.append(izquierda.pop(0))
        else:
            resultado.append(derecha.pop(0))
    return resultado + izquierda + derecha

numeros = [8, 3, 5, 1, 9, 6]
print(merge_sort(numeros))  # Output: [1, 3, 5, 6, 8, 9]
