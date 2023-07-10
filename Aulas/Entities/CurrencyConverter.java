package Entities;

public class CurrencyConverter {

    public static final double IOF = 1.06;

    public static double calculeCambio(double dolarPrice, double amountBought){
        return dolarPrice * amountBought * IOF;

    }

    
}
