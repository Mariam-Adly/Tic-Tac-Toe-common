
package TicTacToeCommon.models.responses;

import TicTacToeCommon.models.base.RemoteResponse;


public class StartResponse extends RemoteResponse<Boolean> {

    public StartResponse() {
    }

    public StartResponse(boolean status) {
        super(status);
    }

    public StartResponse(boolean status, Boolean data) {
        super(status, data);
    }
    
    
}
