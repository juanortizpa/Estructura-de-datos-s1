#include <iostream>
#include <stack>
#include "encabezado.c++" // Incluir el archivo de encabezado

using namespace std;

int main() {
    // Llamar a la función para imprimir el encabezado
    imprimirEncabezado();

    stack<string> historial;
    historial.push("www.google.com");
    historial.push("www.github.com");
    historial.push("www.stackoverflow.com");

    cout << "Página actual: " << historial.top() << endl;
    historial.pop();
    cout << "Retrocediendo... Ahora en: " << historial.top() << endl;
    return 0;
}