
package TOG;


public class nodo_g {
    Object value;
    Lista aristas = new Lista();

    public nodo_g() {
    }

    public nodo_g(Object value) {
        this.value = value;
    }
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        return value.toString();
    }
    
    
}
