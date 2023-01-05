/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeCommon.models;

public class RecordModel {
    private String gameId;
    private String playerOneId;
    private String playerTwoId;

    public RecordModel() {
        gameId=null;
        playerOneId=null;
        playerTwoId=null;
    }
    
    

    public RecordModel(String gameId, String playerOneId, String playerTwoId) {
        this.gameId = gameId;
        this.playerOneId = playerOneId;
        this.playerTwoId = playerTwoId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setPlayerOneId(String playerOneId) {
        this.playerOneId = playerOneId;
    }

    public void setPlayerTwoId(String playerTwoId) {
        this.playerTwoId = playerTwoId;
    }

    public String getGameId() {
        return gameId;
    }

    public String getPlayerOneId() {
        return playerOneId;
    }

    public String getPlayerTwoId() {
        return playerTwoId;
    }
    
}
