package proyecto_final.io;

import proyecto_final.modelo.*;
import java.io.*;
import java.util.*;

public class CSVLoader {
    public static Grafo cargar(String path) throws IOException {
        Grafo g = new Grafo();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            boolean primera = true;
            while ((line = br.readLine()) != null) {
                if (primera) {
                    primera = false;
                    continue; // saltar encabezado
                }
                String[] tok = line.split(",");
                Nodo u = new Nodo(tok[0].trim());
                Nodo v = new Nodo(tok[1].trim());
                int peso = Integer.parseInt(tok[2].trim());
                g.addArista(u, v, peso);
            }
        }
        return g;
    }
}
