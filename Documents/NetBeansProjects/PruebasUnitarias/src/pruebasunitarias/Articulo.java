
package pruebasunitarias;


public class Articulo {
    
         int nro_articulo;
         String tipo_articulo;
         String nombre;

public int getnro_articulo(){
     return nro_articulo;
}

public void setnro_articulo(int nro_articulo){
    this.nro_articulo = nro_articulo;
} 

public String gettipo_articulo(){
    return tipo_articulo;
}

public void settipo_articulo(String tipo_articulo){
    this.tipo_articulo = tipo_articulo;
}

public String getnombre(){
    return tipo_articulo;
}

public void setnombre(String nombre){
    this.nombre = nombre;
}

public Articulo(){
}

public Articulo(int nro_articulo,String tipo_articulo,String nombre) {
        nro_articulo = nro_articulo;
        tipo_articulo = tipo_articulo;
        nombre = nombre;
}
}

    

