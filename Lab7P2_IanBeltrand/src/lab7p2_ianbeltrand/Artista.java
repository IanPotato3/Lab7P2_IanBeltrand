package lab7p2_ianbeltrand;

import java.util.ArrayList;

public class Artista extends Usuario{
    
    //Atributos
    String NombreArtistico = "";
    ArrayList<Single> singles = new ArrayList();
    ArrayList<Album> albumes = new ArrayList();
    
    public Artista(String Username, String Password, int Age, String Tipo, String NombreArtistico) {
        super(Username, Password, Age, Tipo);
        this.NombreArtistico = NombreArtistico;
    }

    public String getNombreArtistico() {
        return NombreArtistico;
    }

    public void setNombreArtistico(String NombreArtistico) {
        this.NombreArtistico = NombreArtistico;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public ArrayList<Single> getSingles() {
        return singles;
    }

    public void setSingles(ArrayList<Single> singles) {
        this.singles = singles;
    }
    
    @Override
    public String toString() {
        return "Artista{" + "NombreArtistico=" + NombreArtistico + ", canciones=" + singles + ", albumes=" + albumes + '}';
    }
    
    
    
}
