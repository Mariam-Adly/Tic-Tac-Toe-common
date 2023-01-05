/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeCommon.models.base;

/**
 *
 * @author m-essam
 * @param <Data>
 */
public abstract class RemoteResponse<Data extends RemoteSendable> implements RemoteSendable {
    protected boolean status;
    protected Data data;
    
    protected RemoteResponse() {
        this(false);
    }
    
    protected RemoteResponse(boolean status) {
        this(status, null);
    }
    
    protected RemoteResponse(boolean status, Data data) {
        this.status = status;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
