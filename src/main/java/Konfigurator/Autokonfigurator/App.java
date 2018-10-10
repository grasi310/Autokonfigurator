package Konfigurator.Autokonfigurator;

public class App {



    public Datenbank datenbank = new Datenbank();
    public Plattform plattform = new Plattform();


    public App()
    {
        startMenue();
    }

    public static void main(String[]args)
    {
        new App();
    }

    public void startMenue ()
    {
        System.out.println("Willkommen auf der Seite VW oesterreich.");
        System.out.println("");

        plattform.menue();
    }
}

