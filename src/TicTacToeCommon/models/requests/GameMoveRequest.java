package TicTacToeCommon.models.requests;

public class GameMoveRequest extends GameRequest {

    static final long serialVersionUID = 42L;
    private Byte move;

    public GameMoveRequest() {

    }

    public GameMoveRequest(String gameId, Byte move) {
        super(gameId);
        this.move = move;
    }

    public Byte getMove() {
        return move;
    }

    public void setMove(Byte move) {
        this.move = move;
    }

}
