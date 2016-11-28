package com.ptrml.ServicePackages;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;

/**
 * Prototype manager klasa
 *
 */
public class PackageFactory {
    protected static List<ServicePackage> prototypesList = new ArrayList<>();

    /**
     * Dodava paket prototip vo listata so prototipi
     * @param _sp asd
     */
    public static void AddPrototype(ServicePackage _sp)
    {
        PackageFactory.prototypesList.add(_sp);
    }

    /**
     * @param _input Imeto na paketot koj treba da se klonira
     * @return ServicePackage clone
     * @throws CloneNotSupportedException ne e poddrzano kloiniranje na objektot. zadolzitelno za clonable
     * @throws NoSuchObjectException Listata ne sodrzi prototip so vnesenoto ime
     */
    public static ServicePackage findAndClone(String _input) throws CloneNotSupportedException, NoSuchObjectException {
        for(ServicePackage sp : PackageFactory.prototypesList)
        {
            if(sp != null && sp.getName().equals(_input))
            {
                return sp.clone();
            }
        }

        throw new NoSuchObjectException(_input);
    }

}
