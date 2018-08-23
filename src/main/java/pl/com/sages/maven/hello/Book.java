package pl.com.sages.maven.hello;

public class Book {
     String title;
     int pageCount;

    static int policzStrony(Book[] tab)
    {
        int licznik=0;


        for(int i=0;i<tab.length;i++)
        {
            licznik+=tab[i].pageCount;
        }

        return licznik;
    }

}
