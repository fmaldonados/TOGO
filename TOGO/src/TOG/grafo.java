package TOG;


public class grafo {
    Lista nodos = new Lista();

    public grafo() {
    }
    
    public void addVertex(nodo_g a){
        for (int i = 0; i < nodos.size(); i++) {
            if (((nodo_g)nodos.at(i)).toString().equals(a.toString())) {
                System.out.println("nodo no se inserto al grafo");
                return;
            }
        }
       nodos.push_back(a);
    }
    public Lista getAdjacents(nodo_g node){
        Lista aristas = new Lista();
        Lista adjacents = new Lista();
        for (int i = 0; i < nodos.size(); i++) {
            if (((nodo_g)nodos.at(i)).getValue() == node.getValue()) {
                aristas = ((nodo_g)nodos.at(i)).aristas;
            }
        }
        for (int i = 0; i < aristas.size(); i++) {
            adjacents.push_back(((arista)aristas.at(i)).getFin());
        }
        return adjacents;
    }
    
    public int getWeight1 (nodo_g a,nodo_g b){
        Lista aristas = new Lista();
        for (int i = 0; i < nodos.size(); i++) {
            if (((nodo_g)nodos.at(i)).getValue() == a.getValue()) {
                aristas = ((nodo_g)nodos.at(i)).aristas;
            }
        }
        for (int i = 0; i < aristas.size(); i++) {
            if (((nodo_g)aristas.at(i)) == b) {
                return ((arista)aristas.at(i)).getLongitud();
            }
        }
        
        return -1;
    }
    public int getWeight2 (nodo_g a,nodo_g b){
        Lista aristas = new Lista();
        for (int i = 0; i < nodos.size(); i++) {
            if (((nodo_g)nodos.at(i)).getValue() == a.getValue()) {
                aristas = ((nodo_g)nodos.at(i)).aristas;
            }
        }
        for (int i = 0; i < aristas.size(); i++) {
            if (((nodo_g)aristas.at(i)) == b) {
                return ((arista)aristas.at(i)).getAncho_banda();
            }
        }
        
        return -1;
    }
    public boolean isAdjacent(nodo_g a, nodo_g b){
        for (int i = 0; i < a.aristas.size(); i++) {
            if(((arista)a.aristas.at(i)).fin == b){
                return true;
            }
        }
        return false;
    }
    
}
