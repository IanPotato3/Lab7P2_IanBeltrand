package lab7p2_ianbeltrand;

public class Cancion {
    
    //Atributos
    String Title = "";
    int Duracion = 0;
    String NombreAlbum = "";
    
    //Constructores y mutadores
    public Cancion(String Title, int Duracion, String NombreAlbum){
        this.Title = Title;
        this.Duracion = Duracion;
        this.NombreAlbum = NombreAlbum;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getNombreAlbum() {
        return NombreAlbum;
    }

    public void setNombreAlbum(String NombreAlbum) {
        this.NombreAlbum = NombreAlbum;
    }

    @Override
    public String toString() {
        return Title;
    }
            
}
