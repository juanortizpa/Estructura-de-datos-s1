#include <iostream>
#include "encabesao.c++"
using namespace std;
 
struct Producto {
    int codigo;
    Producto* izq;
    Producto* der;
};
 
Producto* nuevoProducto(int codigo) {
    Producto* p = new Producto();
    p->codigo = codigo;
    p->izq = p->der = nullptr;
    return p;
}
 
Producto* insertar(Producto* raiz, int codigo) {
    if (raiz == nullptr) return nuevoProducto(codigo);
    if (codigo < raiz->codigo) raiz->izq = insertar(raiz->izq, codigo);
    else raiz->der = insertar(raiz->der, codigo);
    return raiz;
}
 
bool buscar(Producto* raiz, int codigo) {
    if (raiz == nullptr) return false;
    if (raiz->codigo == codigo) return true;
    return (codigo < raiz->codigo) ? buscar(raiz->izq, codigo) : buscar(raiz->der, codigo);
}
 
int main() {
    imprimirEncabezado();
    Producto* raiz = nullptr;
    raiz = insertar(raiz, 102);
    insertar(raiz, 85);
    insertar(raiz, 150);
    insertar(raiz, 60);
    insertar(raiz, 90);
 
    int codigoBuscado = 90;
    cout << "¿Existe el producto con código " << codigoBuscado << "? "
         << (buscar(raiz, codigoBuscado) ? "Sí" : "No") << endl;
    return 0;
}
