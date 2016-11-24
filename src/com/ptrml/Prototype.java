package com.ptrml;

/**
 * Created by ptrml on 11/23/2016.
 */
public interface Prototype<T> extends Cloneable
{
    public T clone() throws CloneNotSupportedException;
}