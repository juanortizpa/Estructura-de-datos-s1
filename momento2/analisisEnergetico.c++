#include <iostream>
#include <fstream>
#include <stack>
#include <string>
#include "cabeza.c++"

using namespace std;

struct Registro
{
    string hora;
    int consumo;
};

int main()
{
    // Imprimir encabezado
    imprimirEncabezado();

    ifstream archivo("consumo.txt");
    stack<Registro> pila;

    if (!archivo)
    {
        cerr << "No se pudo abrir el archivo 'consumo.txt'." << endl;
        return 1;
    }

    string hora;
    int consumo;

    // Leer línea por línea el archivo
    while (archivo >> hora >> consumo)
    {
        Registro reg;
        reg.hora = hora;
        reg.consumo = consumo;
        pila.push(reg);
    }

    archivo.close();

    // Mostrar los registros en orden inverso
    cout << "Registros en orden inverso:\n";
    while (!pila.empty())
    {
        Registro r = pila.top();
        pila.pop();
        cout << "Hora: " << r.hora << " | Consumo: " << r.consumo << " kW";

        if (r.consumo > 550)
        {
            cout << " !!ALERTA: Pico de consumo!!";
        }

        cout << endl;
    }

    return 0;
}
