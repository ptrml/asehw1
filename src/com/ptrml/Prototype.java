package com.ptrml;

/**
 * Created by ptrml on 11/23/2016.
 * Prototype interface
 * Ovozmozuva pravenje kopii na objekti
 */
public interface Prototype<T> extends Cloneable
{
    public T clone() throws CloneNotSupportedException;
}
