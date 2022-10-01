package pl.edu.wszib.lab1.Zad1;

public abstract class Koktail implements Jadalne, Pijalne{

    @Override
    public void jedz() {
        pij();
    }
}
