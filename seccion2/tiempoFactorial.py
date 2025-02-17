from itertools import permutations

def generar_permutaciones(lista):
    """
    Genera todas las permutaciones posibles de una lista dada.

    Args:
        lista (list): La lista de elementos para los cuales se generarán las permutaciones.

    Returns:
        list: Una lista de tuplas, donde cada tupla es una permutación posible de los elementos de la lista original.
    """
    return list(permutations(lista))

numeros = [1, 2, 3]
print(generar_permutaciones(numeros))
# Output: [(1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1), (3, 1, 2), (3, 2, 1)]