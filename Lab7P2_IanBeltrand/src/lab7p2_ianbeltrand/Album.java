package lab7p2_ianbeltrand;

import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamiento{
    
    //Atributos
    ArrayList<Cancion> canciones = new ArrayList();
    int CantidadCanciones = 0;

    public Album(String Title, Date Lanzamiento, int CantidadCanciones) {
        super(Title, Lanzamiento);
        this.CantidadCanciones = CantidadCanciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantidadCanciones() {
        return CantidadCanciones;
    }

    public void setCantidadCanciones(int CantidadCanciones) {
        this.CantidadCanciones = CantidadCanciones;
    }

    @Override
    public String toString() {
        return "Album{" + "canciones=" + canciones + ", CantidadCanciones=" + CantidadCanciones + '}';
    }
    
    
}
