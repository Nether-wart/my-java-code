package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class net {
    Socket s;

    public static byte[] try_connect = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public void setIP(String ip) throws IOException{
        this.s = new Socket(ip,25560);
    }

    public void connect() throws IOException{
        OutputStream outputStream =s.getOutputStream();
        outputStream.write(try_connect);

    }

}
