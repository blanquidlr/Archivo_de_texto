package clase_13_java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


    public class Escribir_y_Leer_Texto{
    
    public static void main(String []args){
        
        String saludo="Archivos de texto";
        
        try{
            
            File archivo=new File("texto.txt");
            
            try (FileWriter escribir = new FileWriter(archivo,true)) {
                escribir.write(saludo);
            }
        
        }
        
        catch(IOException e)
            
        {
            
            System.out.println("Error");
        }
        
    }
 }
