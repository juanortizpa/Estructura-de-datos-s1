#include <iostream>
#include <vector>
#include "encabesao.c++"
using namespace std;
 
class Ciudad {
    int nodos;
    vector<vector<int>> adyacente;
public:
    Ciudad(int n) {
        nodos = n;
        adyacente.resize(n);
    }
    void conectar(int u, int v) {
        adyacente[u].push_back(v);
        adyacente[v].push_back(u);
    }
    void mostrar() {
        for (int i = 0; i < nodos; i++) {
            cout << "Intersección " << i << ": ";
            for (int j : adyacente[i])
                cout << j << " ";
            cout << endl;
        }
    }
};
 
int main() {
    imprimirEncabezado();
    Ciudad c(4);
    c.conectar(0, 1);
    c.conectar(0, 2);
    c.conectar(1, 3);
 
    cout << "Red de intersecciones:\n";
    c.mostrar();
    return 0;
}
