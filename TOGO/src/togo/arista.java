package togo;


public class arista {
    int longitud;
    int ancho_banda;
    nodo_g inicio= new nodo_g();
    nodo_g fin = new nodo_g();

    public arista() {
    }

    public arista(int longitud, int ancho_banda, nodo_g inicio, nodo_g fin) {
        this.longitud = longitud;
        this.ancho_banda = ancho_banda;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getAncho_banda() {
        return ancho_banda;
    }

    public void setAncho_banda(int ancho_banda) {
        this.ancho_banda = ancho_banda;
    }

    public nodo_g getInicio() {
        return inicio;
    }

    public void setInicio(nodo_g inicio) {
        this.inicio = inicio;
    }

    public nodo_g getFin() {
        return fin;
    }

    public void setFin(nodo_g fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return  inicio.toString() + "<---"+ ancho_banda +"MB/S"+ "--"+ longitud + "mts" +"---->" + fin.toString();
    }
    
    
    
    
}
