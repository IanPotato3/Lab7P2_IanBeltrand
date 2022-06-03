package lab7p2_ianbeltrand;

import java.util.Date;

public class Lanzamiento {
    
    //Atributos
    private String Title = "";
    private Date Lanzamiento = null;
    private int Likes = 0;
    
    //Constrcutores y mutadores

    public Lanzamiento(String Title, Date Lanzamiento){
        this.Title = Title;
        this.Lanzamiento = Lanzamiento;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Date getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(Date Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "Title=" + Title + ", Lanzamiento=" + Lanzamiento + ", Likes=" + Likes + '}';
    }
           
}
