package ru.eit.ps_java.eugenBorisov.lesson6.dev;

public class Develop {


    public static void main(String[] args) {
        Builder builder;
        try{
            builder = new Builder(ShapeStoreSingletone.getInstance().suply());
            builder.build();
        } catch (Exception exception) {
            System.out.println(exception.toString().split(" ",2)[1]);
        }
    }

}
