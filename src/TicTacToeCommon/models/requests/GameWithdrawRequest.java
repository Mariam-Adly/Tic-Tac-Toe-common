package TicTacToeCommon.models.requests;

import TicTacToeCommon.models.base.RemoteRequest;

public class GameWithdrawRequest implements RemoteRequest {

    private String gameId;

    public GameWithdrawRequest() {

    }

    public GameWithdrawRequest(String gameId) {
        this.gameId = gameId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

}
