
package TicTacToeCommon.models;


public class Game {
    private String gameId;
    private String player1Id;
    private String player2Id;
   
   
     public Game() {
    }
     
    public Game(String gameId, String player1Id, String player2Id) {
        this. gameId= gameId;
        this.player1Id= player1Id;
        this.player2Id= player2Id;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setPlayer1Id(String player1Id) {
        this.player1Id = player1Id;
    }

    public void setPlayer2Id(String player2Id) {
        this.player2Id = player2Id;
    }

    public String getGameId() {
        return gameId;
    }

    public String getPlayer1Id() {
        return player1Id;
    }

    public String getPlayer2Id() {
        return player2Id;
    }
    
 

    
  
}
