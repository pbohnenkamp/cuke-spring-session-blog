package com.bohnenkamptech.blog.cucumber;

/**
 * A simulated bar patron
 */
public class Drinker {


    public static final int SIP_OUNCES = 1;
    public static final int DRINK_OUNCES = 2;

    public void sip(Beverage beverage) {
        beverage.dispense(SIP_OUNCES);
    }

    public void drink(Beverage beverage) {
        beverage.dispense(DRINK_OUNCES);
    }

    public void slam(Beverage beverage) {
        int liquidRemaining = beverage.liquidCurrentlyHolding();
        beverage.dispense(liquidRemaining);
    }

}
