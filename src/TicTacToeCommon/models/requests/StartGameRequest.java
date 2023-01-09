package TicTacToeCommon.models.requests;

import TicTacToeCommon.models.base.RemoteRequest;

public class StartGameRequest implements RemoteRequest {
   static final long serialVersionUID = 42L;
    private String playerId;

    public StartGameRequest() {
    }

    public StartGameRequest(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
