package pl.edu.wszib.lab1.myabstract;

public abstract class MyAbstractClass {
    protected String myProtectedField;

    public void myProtected(){
        System.out.println("My protected filed = " + myProtectedField);
    }

    protected abstract void myAbstract();

}
