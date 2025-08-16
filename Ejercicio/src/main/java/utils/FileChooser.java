/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JFileChooser;

/**
 *
 * @author SELVYN
 */
public class FileChooser {
    
    private final static JFileChooser fileChooser = new JFileChooser();
    
    static {
        fileChooser.setFileSelectionMode(0);
        fileChooser.setDialogTitle("Selecciona una carpeta");
    }
    
    
    public static String selectPath(){
        
        return null;
        
    }
            
}
