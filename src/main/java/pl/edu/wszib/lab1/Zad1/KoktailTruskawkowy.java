package pl.edu.wszib.lab1.Zad1;

public class KoktailTruskawkowy extends Koktail implements Smakowalny{


    @Override
    public void pij() {
        System.out.println("Jem i Pije");
    }

    @Override
    public void smak() {
        System.out.println("Truskawkowy");
    }
}
