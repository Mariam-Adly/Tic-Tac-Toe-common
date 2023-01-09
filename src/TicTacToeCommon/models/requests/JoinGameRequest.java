package TicTacToeCommon.models.requests;

import TicTacToeCommon.models.PlayerModel;
import TicTacToeCommon.models.base.RemoteRequest;

public class JoinGameRequest implements RemoteRequest {

    static final long serialVersionUID = 42L;
    private PlayerModel player;

    public JoinGameRequest() {
    }

    public JoinGameRequest(PlayerModel player) {
        this.player = player;
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public void setPlayer(PlayerModel player) {
        this.player = player;
    }

}
