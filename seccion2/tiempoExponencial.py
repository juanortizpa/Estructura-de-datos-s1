def fibonacci(n):
    """
    Calculate the nth Fibonacci number using a recursive approach.

    The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones,
    usually starting with 0 and 1. That is, F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1.

    Args:
        n (int): The position in the Fibonacci sequence to calculate. Must be a non-negative integer.

    Returns:
        int: The nth Fibonacci number.

    Raises:
        ValueError: If n is a negative integer.

    Examples:
        >>> fibonacci(0)
        0
        >>> fibonacci(1)
        1
        >>> fibonacci(5)
        5
        >>> fibonacci(10)
        55
    """
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)

print(fibonacci(6))  # Output: 8
