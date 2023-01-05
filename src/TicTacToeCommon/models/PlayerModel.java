/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeCommon.models;

public class PlayerModel {
    private String name;
    private String id;

    public PlayerModel() {
        name=null;
        id=null;
    }

    public PlayerModel(String name, String id) {
        this.name = name;
        this.id=id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id=id;
    }
    
    public String getId() {
        return id;
    }  
}
