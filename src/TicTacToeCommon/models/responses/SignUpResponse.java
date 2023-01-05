package TicTacToeCommon.models.responses;

import TicTacToeCommon.models.User;
import TicTacToeCommon.models.base.RemoteResponse;


/**
 * Represents a sign-up response to the client.
 * @author Karim
 * @version 1.0
 * @since 1.0
 * */
public class SignUpResponse extends RemoteResponse<User> {

    /** Default Constructor */
    public SignUpResponse(){}

    /*
        TODO
         This constructor redundant but was only added for clarity.
         If the response is rejected the no-arg constructor should be used.
         If the response is accepted the 2-args constructor should be used.
         May remove this constructor later on.
    *  */
    /**
     * Creates a sign-up response to the client with the specified status of the response.
     * @param status The status of the response stating the acceptance or the rejection of the response.
     * */
    public SignUpResponse(boolean status){
        super(status);
    }

    /**
     * Creates a sign-up response to the client wrapping the status and the user.
     * @param status The status of the response stating the acceptance or the rejection of the response.
     * @param user The user object that's supposed to be sent to the client.
     * */
    public SignUpResponse(boolean status, User user){
        super(status,user);
    }
}
