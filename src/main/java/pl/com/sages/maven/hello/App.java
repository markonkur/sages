package pl.com.sages.maven.hello;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.LinkedHashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person = new Person();
        person.age=18;

        String[] imiona = {"Jan","Piotr","Marek"};

        Person[] osoby = new Person[3];

        for (int x=0;x<3;x++) {
            osoby[x] = new Person();
            osoby[x].name = imiona[x];
        }
        for (Person x : osoby)
        {
            System.out.println(x.name);
        }



        Book[] wiersze = new Book[2];
        wiersze[0] = new Book();
        wiersze[0].title="Wiersze dla dzieci";
        wiersze[0].pageCount=50;
        wiersze[1] = new Book();
        wiersze[1].title="Wiersze dla dorosłych";
        wiersze[1].pageCount=25;

        int policzone=Book.policzStrony(wiersze);

        System.out.println(policzone);

        //test dla klasy Book2

        Book2 ksiazka = new Book2("Pan Tadeusz",300);
        System.out.println(ksiazka.getTitle());

        //testy klas dziedziczonych po Shape

       Shape test = new Shape();
       //test.draw();

       Triangle test2 = new Triangle();
       //test2.draw();

       Square test3 = new Square();
       //test3.draw();

        //testy klas abstrakcyjnych
        System.out.println("**********************************testy klas abstrakcyjnych");

        LaserPrinter drukarka = new LaserPrinter();
        drukarka.print();
        //drukarka.iloscKopi();


        try {
            drukarka.iloscKopi(5);
        }catch (MyException e){ System.out.println(e); }

        //InkPrinter drukarka2 = new InkPrinter();
        //drukarka2.print();
        //drukarka2.iloscKopi();


    }
}
