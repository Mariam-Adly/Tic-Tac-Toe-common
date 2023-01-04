/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeCommon;

import TicTacToeCommon.models.base.RemoteMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;


public class TicTacToeCommon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        deserialize();
    }

    private static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("remotemessage.bin"));
        RemoteMessage message;
        while ((message = (RemoteMessage) oin.readObject()) != null) {
            if (message.getData() instanceof OurData) {
                System.out.println("got data " + ((OurData)message.getData()).i);
            }
        }
    }

    private static void serialize() throws IOException {
        RemoteMessage<OurData> message = new RemoteMessage<>(new OurData(1024));
        ObjectOutputStream oout = new ObjectOutputStream(new PrintStream("remotemessage.bin"));
        oout.writeObject(message);
        oout.flush();
        oout.close();
    }
    
    static class OurData implements Serializable {
        static final long serialVersionUID = 40L;
        
        private int i;
        
        public OurData() {}
        
        public OurData(int i) {
            this.i = i;
        } 
    }
}
