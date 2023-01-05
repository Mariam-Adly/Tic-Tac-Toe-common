package TicTacToeCommon.models.responses;

import TicTacToeCommon.models.base.RemoteResponse;

// TODO change Boolean to MoveModel

public class GameMoveResponse extends RemoteResponse<Boolean> {
    
    public GameMoveResponse() {
    }

    public GameMoveResponse(boolean status) {
        super(status);
    }

    /**
     * @param status    wether the request was successful
     * @param data      the move that was successful
     */
    public GameMoveResponse(boolean status, Boolean data) {
        super(status, data);
    }

}
