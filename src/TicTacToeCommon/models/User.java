package TicTacToeCommon.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *  Represents a user.
 *  @author Karim
 *  @version 1.0
 *  @since 1.0
 */
public class User implements Serializable {

    private int id;
    private String name;
    private byte[] image;
    private final Date createdAt = new Date();
    private ArrayList<Object> gamesPlayed; //TODO change Type parameter Object to Game

    /** Default constructor */
    public User(){}

    /**
     * Creates a user with the specified id, name, image (if found), the exact date the account was created,
     * and a list of all previously played games.
     * @param id The user's ID.
     * @param name The user's name.
     * @param image The user's image.
     * @param gamesPlayed A list of the user's previously played games.
     */
    public User(int id, String name, byte[] image, ArrayList<Object> gamesPlayed) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public ArrayList<Object> getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(ArrayList<Object> gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
}
