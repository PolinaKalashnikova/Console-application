package bsu.rfe.java.group7.lab1.Kalashnikova.varA7;

public class Ice_Cream extends Food
{
    private String sirup;
    public Ice_Cream(String sirup) {
        super("Бургер");
        this.sirup = sirup;
    }
    public void consume() {
        System.out.println(name + " с сиропом '" + sirup.toUpperCase() + "' съеден!");
    }
}