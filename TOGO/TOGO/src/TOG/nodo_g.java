
package TOG;


public class nodo_g {
    String value;
    String tipo;
    int numero;
    int x;
    int y;
    Lista aristas = new Lista();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Lista getAristas() {
        return aristas;
    }

    public void setAristas(Lista aristas) {
        this.aristas = aristas;
    }

    public nodo_g() {
    }

    public nodo_g(String value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public nodo_g(String value, int numero, int x, int y) {
        this.value = value;
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public nodo_g(String value, String tipo, int numero, int x, int y) {
        this.value = value;
        this.tipo = tipo;
        this.numero = numero;
        this.x = x;
        this.y = y;
    }
    
    
    

    public nodo_g(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    void agregar_a(arista a){
        for (int i = 0; i < aristas.size(); i++) {
            if(a.toString().equals(((arista)aristas.at(i)).toString())){
                return;
            }
        }
        aristas.push_back(a);
    }

    @Override
    public String toString() {
        return value;
    }
    
    
}
