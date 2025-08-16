/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Models.VideoGame;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SELVYN
 */
public class VideoGameService {
    
    private List<VideoGame> videoGames;
    private final String filePath;

    public VideoGameService(String filePath) {
        this.videoGames = new ArrayList<>();
        this.filePath = filePath + File.separator + "list.si";
    }
    
    private void sabeInFile(){
        try (ObjectOutputStream objectOutputStream =
         new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutputStream.writeObject(this.videoGames);
        } catch(Exception e){
            System.out.println("No se puede guardar la lista. \n");
        }
    }
    
    /*private List<VideoGames> returnVideoGameList(Object object){
        if(!(object instanceof List<>)) return null;
    }*/
    
    /*private void loadData(){
        final File file = new File(filePath);
        if(file.exists()){
            try(ObjectInputStream objextInputStream = 
                    new ObjectOutputStream(new FileOutputStream(file))){
                final Ojbecet object = objeectInputStream.readObject()
                
            }catch(){
                
            }
        }
    }*/

}
