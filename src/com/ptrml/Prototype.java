package com.ptrml;

/**
 * Prototype interface
 * Ovozmozuva pravenje kopii na objekti
 */
public interface Prototype<T> extends Cloneable
{
    public T clone() throws CloneNotSupportedException;
}
