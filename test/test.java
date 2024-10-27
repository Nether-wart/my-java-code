package test;

import Tool.Log;
import Tool.MyTool;

import java.io.IOException;

public class test {
    public static void main(String[] args){
        try {Log l = new Log("test");
            for (int i =20;i>0;i--) {
            l.logINFO("test");
        }
        } catch (IOException e) {

        }
    }
}
