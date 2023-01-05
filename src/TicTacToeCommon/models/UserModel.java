package TicTacToeCommon.models;

import java.io.Serializable;
import java.util.Date;

/**
 *  Represents a user.
 *  @author Karim
 *  @version 1.0
 *  @since 1.0
 */
public class UserModel implements Serializable {

    private int id;
    private String name;
    private byte[] image;
    private Date createdAt;

    /** Default constructor */
    public UserModel(){}

    /**
     * Creates a user with the specified id, name, image (if found), the exact date the account was created,
     * and a list of all previously played games.
     * @param id The user's ID.
     * @param name The user's name.
     * @param image The user's image.
     * @param createdAt The exact time this user instance was created in the database.
     */
    public UserModel(int id, String name, byte[] image, Date createdAt) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCreatedAt(Date createdAt){this.createdAt = createdAt;}
    public Date getCreatedAt() {
        return createdAt;
    }

}
