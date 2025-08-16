/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author SELVYN
 */
public class VideoGame {
    
    @Getter
    @Setter
    //@EqualsAndHashCode(of = "id")
    
    private final UUID id;
    private String Title;
    private int hoursPlayed;
    private boolean completed;

    public VideoGame(UUID id, String Title, int hoursPlayed, boolean completed) {
        this.id = id;
        this.Title = Title;
        this.hoursPlayed = hoursPlayed;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "VideoGame{" + "id=" + id + " completed=" + completed + '}';
    }
    
    
}
