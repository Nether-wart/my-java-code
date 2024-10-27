package net;

import java.io.IOException;
import java.net.ServerSocket;

public class ListenerThread implements Runnable {
    public void run(){
        try {
            boolean b_正在对局 =false;
            ServerSocket s =new ServerSocket(25560);
            while (true){
                net_答复线程 n =new net_答复线程();
                n.setSocket(s.accept());
                n.run();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
