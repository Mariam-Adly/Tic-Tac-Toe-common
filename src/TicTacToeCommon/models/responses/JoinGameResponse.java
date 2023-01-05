package TicTacToeCommon.models.responses;

import TicTacToeCommon.models.base.RemoteResponse;

public class JoinGameResponse extends RemoteResponse<Boolean> {

    public JoinGameResponse() {
    }

    public JoinGameResponse(boolean status) {
        super(status);
    }

    public JoinGameResponse(boolean status, Boolean data) {
        super(status, data);
    }

}
