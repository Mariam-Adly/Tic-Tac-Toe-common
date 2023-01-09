package TicTacToeCommon.models.responses;

import TicTacToeCommon.models.base.RemoteResponse;

public class LoginResponse extends RemoteResponse<String> {

    static final long serialVersionUID = 42L;
    public LoginResponse() {
    }

    public LoginResponse(boolean status) {
        super(status);
    }

    public LoginResponse(boolean status, String data) {
        super(status, data);
    }

}
