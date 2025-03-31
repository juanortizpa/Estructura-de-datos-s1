#include <iostream>
#include <queue>
#include <mutex>
#include <string>
#include <thread>
#include "encabezado.c++"
using namespace std;
 
queue<string> mensajes;
mutex mtx;
 
void enviarMensajes() {
    for (int i = 0; i < 4; ++i) {
        this_thread::sleep_for(chrono::milliseconds(300));
        lock_guard<mutex> lock(mtx);
        mensajes.push("Mensaje " + to_string(i+1));
    }
}
 
void recibirMensajes() {
    for (int i = 0; i < 4; ++i) {
        this_thread::sleep_for(chrono::milliseconds(500));
        lock_guard<mutex> lock(mtx);
        if (!mensajes.empty()) {
            cout << "Recibido: " << mensajes.front() << endl;
            mensajes.pop();
        }
    }
}
 
int main() {
    imprimirEncabezado();
    thread productor(enviarMensajes);
    thread consumidor(recibirMensajes);
    productor.join();
    consumidor.join();
    return 0;
}
