
package togo;


public class TOGO {

    
    public static void main(String[] args) {
        //ejemplo de como funciona
        
        grafo G = new grafo();
        
        nodo_g vertex  =  new nodo_g("proveedor");
        nodo_g vertex2 = new nodo_g("Domicilio1");
        
        arista cable1 = new arista(10,5, vertex,vertex2); //esta es la arista que va del primer vertice al segundo
        arista cable2 = new arista(10,5, vertex2,vertex);//hay que recordar que no es dirigido asi que hay que hacer una arista que apunte al opuesto
        
        vertex.agregar_a(cable1);// aqui agregamos la arista
        vertex2.agregar_a(cable2);// ahora haciendo es no dirigido 
        
        G.addVertex(vertex);
        G.addVertex(vertex2);// agregamos los 2 vertices al grafo
        if (G.isAdjacent(vertex, vertex2)) {
            System.out.println(cable1.toString());// el toString ya tiene el formato de como apunta un vertice a otro
        }
        
        // vos proba los metodos y si miras una falla me avisas, este main solo es para pruebas si queres lo podes borrar
        
        
    }
    
}
