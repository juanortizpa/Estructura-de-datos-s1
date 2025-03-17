#include <iostream>
#include <stack>
#include "encabezado.c++" // Incluir el archivo de encabezado
using namespace std;
 
int main() {
    // Llamar a la función para imprimir el encabezado
    imprimirEncabezado();
    stack<string> acciones;
    acciones.push("Escribir 'Hola'");
    acciones.push("Agregar negrita");
    acciones.push("Insertar imagen");
    
    cout << "Última acción: " << acciones.top() << endl;
    acciones.pop();
    cout << "Deshacer... Ahora la última acción es: " << acciones.top() << endl;
    return 0;
}
