package TicTacToeCommon.models.requests;

public class GameMoveRequest extends GameRequest {

    static final long serialVersionUID = 42L;
    private Object move;

    public GameMoveRequest() {

    }

    public GameMoveRequest(String gameId, Object move) {
        super(gameId);
        this.move = move;
    }

    public Object getMove() {
        return move;
    }

    public void setMove(Object move) {
        this.move = move;
    }

}
