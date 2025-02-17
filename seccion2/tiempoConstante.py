def obtener_primero(lista):
    """
    Devuelve el primer elemento de una lista.

    Parámetros:
    lista (list): La lista de la cual se quiere obtener el primer elemento.

    Retorna:
    El primer elemento de la lista.

    Complejidad:
    O(1) - Tiempo constante, ya que siempre accede al primer elemento.
    """
    return lista[0]  # Siempre devuelve el primer elemento en O(1)

numeros = [10, 20, 30, 40, 50]
print(obtener_primero(numeros))  # Output: 10
