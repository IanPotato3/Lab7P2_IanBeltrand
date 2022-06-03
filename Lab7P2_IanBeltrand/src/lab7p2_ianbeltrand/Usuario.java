package lab7p2_ianbeltrand;

public class Usuario {
    
    
    //Atributos
    String Username = "";
    String Password = "";
    int Age = 0;
    String Tipo = "";
    
    //Construtores y Mutadores

    public Usuario(String Username, String Password, int Age, String Tipo){
        this.Username = Username;
        this.Password = Password;
        this.Age = Age;
        this.Tipo = Tipo;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Username=" + Username + ", Password=" + Password + ", Age=" + Age + '}';
    }
            
}
