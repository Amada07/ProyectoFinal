/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeventas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amada
 */
public class CRUDdb {
    
    public boolean escrituraDb(String nombreDb, String contenido)
    {        
            boolean estadoEscritura= false;
            String carpetaProyecto = "Base de Datos";
            String nombreArchivo = nombreDb + "txt";
            File carpeta = new File(carpetaProyecto);
            File f = new File(carpeta,nombreArchivo);
            
             try {
                        FileWriter fw = new FileWriter(f, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido+"\n");
                        bw.close();
                        estadoEscritura= true;
                    } catch (IOException ex) {
                        System.out.println("Error:" +ex);
                        
                    }
        
            
            return estadoEscritura;
            
   }
}

