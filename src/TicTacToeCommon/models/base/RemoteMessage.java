/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeCommon.models.base;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/**
 *
 * @author m-essam
 */
public class RemoteMessage<Data extends Serializable> implements Serializable {
    private Data data;
    
    public RemoteMessage(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }
    
    public void setData(Data data) {
        this.data = data;
    }
}
