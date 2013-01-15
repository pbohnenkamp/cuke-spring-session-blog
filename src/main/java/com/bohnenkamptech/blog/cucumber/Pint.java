package com.bohnenkamptech.blog.cucumber;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Implementation of a <code>Beverage</code> that behaves like a pint of beer
 */
public class Pint implements Beverage {

    public static final int MAX_OUNCES = 16;

    int ounces;

    /**
     * Default constructor
     */
    public Pint() {

    }

    /**
     * Constructor that fills the pint with ounces in
     *
     * @param ounces - ounces to fill the pint with on initialization. If ounces is over
     *               <code>MAX_OUNCES</code> will only result in <code>MAX_OUNCES</code>
     *               filling the <code>Pint</code>
     */
    public Pint(int ounces) {
        if (ounces <= MAX_OUNCES)
            this.ounces = ounces;
        else
            this.ounces = MAX_OUNCES;
    }

    public int dispense(int ounces) {
        int ouncesDispensed = 0;

        if (this.ounces >= ounces) {
            this.ounces = this.ounces - ounces;
            ouncesDispensed = ounces;
        } else {
            ouncesDispensed = this.ounces;
            this.ounces = 0;
        }
        return ouncesDispensed;
    }

    public int liquidCurrentlyHolding() {
        return this.ounces;
    }

    public int fill(int ounces) {
        int ouncesFilled = 0;
        if (MAX_OUNCES - this.ounces >= ounces) {
            this.ounces += ounces;
            ouncesFilled = ounces;
        } else {
            ouncesFilled = fillFull();
        }
        return ouncesFilled;
    }

    public int fillFull() {
        int ouncesFilled = MAX_OUNCES - this.ounces;
        this.ounces = MAX_OUNCES;
        return ouncesFilled;
    }
}
