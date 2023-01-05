
package TicTacToeCommon.models.responses;

import TicTacToeCommon.models.base.RemoteResponse;


public class StartGameResponse extends RemoteResponse<Boolean> {

    public StartGameResponse() {
    }

    public StartGameResponse(boolean status) {
        super(status);
    }

    public StartGameResponse(boolean status, Boolean data) {
        super(status, data);
    }
    
    
}
