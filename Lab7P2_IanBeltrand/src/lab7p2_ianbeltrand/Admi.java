package lab7p2_ianbeltrand;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Admi {
    
    
    //Atributos
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Cancion> canciones = new ArrayList();
    File file = new File("./RegistroUsuarios.txt");
    
    //Funciones
    public Usuario BuscarUsuario(String Username){
        for (Usuario usuario : usuarios){
            if(usuario.getUsername().equals(Username)){
                return usuario;
            }
        }
        
        return null;
    }
    
    public void EscribirArchivo(Usuario usuario) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try{
            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);
                bw.write(usuario.Tipo + ";");
                bw.write(usuario.getUsername() + ";");
                bw.write(new Date() + ";");
                bw.write("\n");
            bw.flush();
            
        }catch(Exception e){
            
        }
        
        bw.close();
        fw.close();
    }
    
}
