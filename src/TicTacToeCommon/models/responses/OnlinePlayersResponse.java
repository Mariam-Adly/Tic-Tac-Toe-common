package TicTacToeCommon.models.responses;

import TicTacToeCommon.models.PlayerModel;
import TicTacToeCommon.models.base.RemoteResponse;
import java.util.ArrayList;

public class OnlinePlayersResponse extends RemoteResponse<ArrayList<PlayerModel>> {

    public OnlinePlayersResponse() {
    }

    public OnlinePlayersResponse(boolean status) {
        super(status);
    }

    public OnlinePlayersResponse(boolean status, ArrayList<PlayerModel> data) {
        super(status, data);
    }

}
