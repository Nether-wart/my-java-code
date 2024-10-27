package net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class net_答复线程 implements Runnable{
    Socket s =new Socket();

    public net_答复线程() throws IOException {
    }

    public void setSocket(Socket s) {
        this.s = s;
    }

    @Override
    public void run(){
    while (true){
        try {
            if (!(s.getInputStream().readNBytes(16)==net.try_connect)) {

                break;
            }
            Thread.sleep(100);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    }
}
