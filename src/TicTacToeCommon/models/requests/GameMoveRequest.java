package TicTacToeCommon.models.requests;

import TicTacToeCommon.models.base.RemoteRequest;

// TODO change Object to MoveModel

public class GameMoveRequest implements RemoteRequest {

    static final long serialVersionUID = 42L;
    private String gameId;
    private Object move;

    public GameMoveRequest() {

    }

    public GameMoveRequest(String gameId, Object move) {
        this.gameId = gameId;
        this.move = move;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Object getMove() {
        return move;
    }

    public void setMove(Object move) {
        this.move = move;
    }

}
