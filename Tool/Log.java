package Tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface log{
    int INFO =0;
    int Warning =1;
    int ERR =2;
    String info ="[INFO]";
    String warning ="[Warning]";
    String err ="[ERR]";
}

public class Log {
    private static final File logFile =new File("logs/latest.log");
    FileOutputStream out;
    String name;

    public Log(String name) throws IOException {
        logFile.createNewFile();
        out =new FileOutputStream(logFile,true);
        this.name=name;
    }

    private static String getTime() {
        DateFormat df = new SimpleDateFormat("HH-mm-ss.SSS");
        return "["+df.format(new Date())+"]";
    }

    private static String format(int a,String name,String s){
        return switch (a) {
            case log.INFO -> getTime() + log.info + "[" + name + "]" + s + "\n";
            case log.Warning -> getTime() + log.warning + "[" + name + "]" + s + "\n";
            case log.ERR -> getTime() + log.err + "[" + name + "]" + s + "\n";
            default -> null;
        };
    }

    public void logINFO(String s){
        String log =format(0,name,s);
        System.out.print(log);
        try {
            if (log != null) {
                out.write(log.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            System.err.println(format(1,"Log",e.getMessage()));
        }
    }
    public void logWarning(String s) {
        String log = format(1, name, s);
        System.out.print(log);
        try {
            if (log != null) {
                out.write(log.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            System.err.println(format(1,"Log",e.getMessage()));
        }
    }

    
}
