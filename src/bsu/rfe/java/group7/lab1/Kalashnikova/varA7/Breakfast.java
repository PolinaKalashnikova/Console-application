package bsu.rfe.java.group7.lab1.Kalashnikova.varA7;

public class Breakfast {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for (String arg1 : args) {
            String[] part = arg1.split("/");
            if (part[0].equals("Ice_Cream")) {
                Ice_Cream i_c = new Ice_Cream(part[1]);
                i_c.consume();
                sum++;}
            else if (part[0].equals("Cheese")){
                Cheese cheese = new Cheese();
                cheese.consume();
                sum++;}
            else if (part[0].equals("Apple")){
                Apple apple = new Apple(part[1]);
                apple.consume();
                sum++;}
            i++;
        }
        System.out.println("Количество съеденных продуктов:  " + sum);
    }
}
