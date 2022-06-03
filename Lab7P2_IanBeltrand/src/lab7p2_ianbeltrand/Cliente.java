package lab7p2_ianbeltrand;

import java.util.ArrayList;

public class Cliente extends Usuario{
    
    //Atributos
    ArrayList<Cancion> favs = new ArrayList();
    ArrayList<ListaRepro> listas = new ArrayList();
    ArrayList<ListaRepro> listasLike = new ArrayList();
    
    //Constructores y mutadores

    public Cliente(String Username, String Password, int Age, String Tipo) {
        super(Username, Password, Age, Tipo);
    }

    public ArrayList<Cancion> getFavs() {
        return favs;
    }

    public void setFavs(ArrayList<Cancion> favs) {
        this.favs = favs;
    }

    public ArrayList<ListaRepro> getListas() {
        return listas;
    }

    public void setListas(ArrayList<ListaRepro> listas) {
        this.listas = listas;
    }

    public ArrayList<ListaRepro> getListasLike() {
        return listasLike;
    }

    public void setListasLike(ArrayList<ListaRepro> listasLike) {
        this.listasLike = listasLike;
    }

    @Override
    public String toString() {
        return "Cliente{" + "favs=" + favs + ", listas=" + listas + ", listasLike=" + listasLike + '}';
    }
    
    
}
