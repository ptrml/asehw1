package com.ptrml.Services;

import com.ptrml.Nameable;
import com.ptrml.Prototype;

/**
 * Created by ptrml on 11/20/2016.
 */
public abstract class BasicService implements Nameable,Prototype<BasicService> {

    protected double service_price;

    public double getService_price() {
        return service_price;
    }
    public abstract String getName();

    public BasicService clone() throws CloneNotSupportedException
    {
        return (BasicService) super.clone();
    }
}
