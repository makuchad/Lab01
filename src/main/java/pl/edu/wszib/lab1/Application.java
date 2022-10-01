package pl.edu.wszib.lab1;

import pl.edu.wszib.lab1.mypackage.MySecondClass;

public class Application
{
    public static void main(String[] args) {
        MyFirstClass.myStaticField = "MyStatic";
        MyFirstClass mfc = new MyFirstClass();
        mfc.firstField2 = "Test";
        mfc.run1();

        MySecondClass msc = new MySecondClass();
        msc.run();
    }
}
