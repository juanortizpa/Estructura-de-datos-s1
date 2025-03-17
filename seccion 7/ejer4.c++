#include <iostream>
#include <stack>
#include "encabezado.c++"
using namespace std;
 
int evaluarPostfija(string expr) {
    stack<int> pila;
    for (char c : expr) {
        if (isdigit(c)) {
            pila.push(c - '0');
        } else {
            int b = pila.top(); pila.pop();
            int a = pila.top(); pila.pop();
            if (c == '+') pila.push(a + b);
            else if (c == '-') pila.push(a - b);
            else if (c == '*') pila.push(a * b);
            else if (c == '/') pila.push(a / b);
        }
    }
    return pila.top();
}
 
int main() {
    imprimirEncabezado();
    cout << evaluarPostfija("23+5*") << endl; // Output: 25
    return 0;
}
