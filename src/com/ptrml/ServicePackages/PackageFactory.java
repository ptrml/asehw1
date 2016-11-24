package com.ptrml.ServicePackages;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ptrml on 11/20/2016.
 * Prototype manager klasa
 *
 */
public class PackageFactory {
    protected static List<ServicePackage> prototypesList;

    /**
     * @param _sp asd
     */
    public static void AddPrototype(ServicePackage _sp)
    {
        checkServicePackageList();
        PackageFactory.prototypesList.add(_sp);
    }

    public static ServicePackage findAndClone(String _input) throws CloneNotSupportedException, NoSuchObjectException {
        checkServicePackageList();
        for(ServicePackage sp : PackageFactory.prototypesList)
        {
            if(sp != null && sp.getName().equals(_input))
            {
                return sp.clone();
            }
        }

        throw new NoSuchObjectException(_input);
    }

    /**
     * Inicijalizacija na listata so prototipi
     */
    protected static void initServicePackageList() {
        PackageFactory.prototypesList = new ArrayList<>();
    }

    /**
     * Bidejki metodite se staticki zadolzitelno e da se proveri dali listata e inicijalizirana.
     * Ja inicijalizira listata pri prvoto koristenje
     */
    protected static void checkServicePackageList() {
        if(PackageFactory.prototypesList == null)
            initServicePackageList();
    }
}
