package lab7p2_ianbeltrand;

import java.util.Date;

public class Single extends Lanzamiento{
    
    //Atributos
    Cancion SingleCancion = null;
    
    //Constrcutores y Mutadores

    public Single(String Title, Date Lanzamiento, Cancion cancion){
        super(Title, Lanzamiento);
        this.SingleCancion = cancion;
    }

    public Cancion getSingleCancion() {
        return SingleCancion;
    }

    public void setSingleCancion(Cancion SingleCancion) {
        this.SingleCancion = SingleCancion;
    }

    @Override
    public String toString() {
        return "Single{" + "SingleCancion=" + SingleCancion + '}';
    }
    
}
