package oop_innerclass.src.com.itheima.a02innerclassdemo2;

public class Outer {
    String name;

    private class Inner{
         int a = 10;
    }
    public Inner getInstance(){

        return new Inner();
    }


}
