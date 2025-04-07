#include <iostream>
#include <string>
#include "encabesao.c++"
using namespace std;
 
struct Especie {
    string nombre;
    Especie* izq;
    Especie* der;
};
 
Especie* nuevaEspecie(string nombre) {
    Especie* e = new Especie();
    e->nombre = nombre;
    e->izq = e->der = nullptr;
    return e;
}
 
Especie* insertar(Especie* raiz, string nombre) {
    if (raiz == nullptr) return nuevaEspecie(nombre);
    if (nombre < raiz->nombre) raiz->izq = insertar(raiz->izq, nombre);
    else raiz->der = insertar(raiz->der, nombre);
    return raiz;
}
 
void inorden(Especie* raiz) {
    if (raiz) {
        inorden(raiz->izq);
        cout << raiz->nombre << " ";
        inorden(raiz->der);
    }
}
 
int main() {
    imprimirEncabezado();
    Especie* raiz = nullptr;
    raiz = insertar(raiz, "Tigre");
    insertar(raiz, "Elefante");
    insertar(raiz, "Mono");
    insertar(raiz, "Cebra");
    insertar(raiz, "Gorila");
 
    cout << "Especies en orden alfabético: ";
    inorden(raiz);
    return 0;
}
