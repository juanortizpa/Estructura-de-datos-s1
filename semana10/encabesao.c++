#include <iostream>
#include <string>
#include <chrono>
#include <iomanip>

using namespace std;

void imprimirEncabezado() {
    // Datos del encabezado
    string nombre = "Juan Ortiz";
    string campus = "Campus Cali, U. Cooperativa de Colombia";
    string repositorioGit = "https://github.com/juanortizpa/Estructura-de-datos-s1/seccion8";

    // Obtener la fecha y hora actual
    auto ahora = chrono::system_clock::now();
    time_t tiempo = chrono::system_clock::to_time_t(ahora);
    tm* tiempoLocal = localtime(&tiempo);
    char buffer[80];
    strftime(buffer, sizeof(buffer), "%d/%m/%Y %H:%M:%S", tiempoLocal);
    string fechaHora(buffer);

    // Imprimir el encabezado
    cout << "+----------------------------------------" << endl;
    cout << "| 👤 Nombre: " << nombre << endl;
    cout << "| 🎓 Campus: " << campus << endl;
    cout << "| 📅 Fecha y hora: " << fechaHora << endl;
    cout << "| 📂 Repositorio Git: " << repositorioGit << endl;
    cout << "+----------------------------------------" << endl;
    cout << endl;
}