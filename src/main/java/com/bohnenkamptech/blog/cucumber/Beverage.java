package com.bohnenkamptech.blog.cucumber;

/**
 * Interface for a container that holds liquid
 */
public interface Beverage {

    /**
     * Dispense an amount of liquid from the beverage
     *
     * @param ounces - number of ounces to dispense
     * @return - the number of ounces dispensed. This should equal ounces passed in except
     *         where the beverage does not hold enough ounces to dispense the full amount.
     *         Then the actual amount dispensed is returned.
     */
    public int dispense(int ounces);

    /**
     * Returns the number of ounces held in the beverage
     *
     * @return ounces the beverage currently holding
     */
    public int liquidCurrentlyHolding();


    /**
     * Fill the beverage with an amount of liquid
     *
     * @param ounces - number of ounces to fill into beverage. If the beverage can not
     *               hold the amount specified, it will only fill to the beverage's
     *               capacity.
     * @return the number of ounces actually filled into the beverage
     */
    public int fill(int ounces);


    /**
     * Fill the beverage to it's capacity
     *
     * @return the number of ounces actually filled into the beverage
     */
    public int fillFull();
}
