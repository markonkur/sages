package pl.com.sages.maven.hello;

public abstract class Printer extends Device{

    public abstract void print();

    public void iloscKopi( int y) throws MyException
    {
        if (y < 10)
        {
            throw new MyException("Zaczyna brakować papieru");
        }
        System.out.println("Wydruk ilosci kopi");
    }
}
