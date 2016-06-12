package TOG;


public class arista {
    int longitud;
    int ancho_banda1;
    int ancho_banda2;
    String material;
    nodo_g inicio= new nodo_g();
    nodo_g fin = new nodo_g();

    public arista() {
    }

    public arista(int longitud, int ancho_banda1, int ancho_banda2, String material) {
        this.longitud = longitud;
        this.ancho_banda1 = ancho_banda1;
        this.ancho_banda2 = ancho_banda2;
        this.material = material;
    }

    public int getAncho_banda1() {
        return ancho_banda1;
    }

    public void setAncho_banda1(int ancho_banda1) {
        this.ancho_banda1 = ancho_banda1;
    }

    public int getAncho_banda2() {
        return ancho_banda2;
    }

    public void setAncho_banda2(int ancho_banda2) {
        this.ancho_banda2 = ancho_banda2;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
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

    
    
    
    
    
}
