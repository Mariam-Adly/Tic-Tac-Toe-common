
package TicTacToeCommon.models.requests;

import TicTacToeCommon.models.base.RemoteRequest;


public class StartRequest implements RemoteRequest  {
    private String playerId;

    public StartRequest(){
    }
    public StartRequest(String playerId) {
        this.playerId = playerId;
    }
    

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}

