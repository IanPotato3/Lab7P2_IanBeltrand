package lab7p2_ianbeltrand;

import java.util.ArrayList;

public class ListaRepro {
    
    //Atributos
    String Nombre = "";
    int Likes = 0;
    ArrayList<Cancion> canciones = new ArrayList();

    public ListaRepro(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "ListaRepro{" + "Nombre=" + Nombre + ", Likes=" + Likes + ", canciones=" + canciones + '}';
    }
        
}
