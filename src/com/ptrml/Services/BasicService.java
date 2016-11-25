package com.ptrml.Services;

import com.ptrml.Nameable;
import com.ptrml.Prototype;

/**
 * Created by ptrml on 11/20/2016.
 */
public abstract class BasicService implements Nameable,Prototype<BasicService> {

    protected double service_price;

    /**
     * @return cena na uslugata
     */
    public double getService_price() {
        return service_price;
    }

    /**
     * Se implementira vo podklasite
     * @return ime na uslogata
     */
    public abstract String getName();

    /**
     * @return klon na BasicService ili podklasa
     * @throws CloneNotSupportedException ako kloniranjeto ne e poddrzano
     */
    public BasicService clone() throws CloneNotSupportedException
    {
        return (BasicService) super.clone();
    }
}
