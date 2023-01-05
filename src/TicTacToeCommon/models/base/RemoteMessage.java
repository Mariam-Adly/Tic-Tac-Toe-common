/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeCommon.models.base;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 *
 * @author m-essam
 * @param <Message>
 */
public class RemoteMessage<Message extends RemoteSendable> implements RemoteSendable {

    private Message message;
    private Date sentAt;
    transient private Date receivedAt;
    
    public RemoteMessage() {}
    
    public RemoteMessage(Message data) {
        this.message = data;
    }

    public Message getMessage() {
        return message;
    }

    public Date getSentAt() {
        return sentAt;
    }
    
    public Date getReceivedAt() {
        return receivedAt;
    }
    
    public void setMessage(Message message) {
        this.message = message;
    }
    
    public <T extends RemoteSendable> T getMessage(Class<T> clazz) {
        if (clazz.isInstance(message)) {
            return (T) message;
        }
        return null;
    }

    public void writeInot(ObjectOutput output) throws IOException {
        this.sentAt = new Date();
        output.writeObject(this);
    }
    
    public static RemoteMessage<RemoteSendable> readFrom(ObjectInput input) throws IOException, ClassNotFoundException {
        RemoteMessage<RemoteSendable> object = (RemoteMessage<RemoteSendable>) input.readObject();
        object.receivedAt = new Date();
        return object;
    }
}
