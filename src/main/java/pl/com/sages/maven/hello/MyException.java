package pl.com.sages.maven.hello;

public class MyException extends Exception {

    public MyException(String msg)
    {
        super("MyException: " + msg);
    }
}
