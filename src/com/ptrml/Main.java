package com.ptrml;

import com.ptrml.ServicePackages.PackageFactory;
import com.ptrml.ServicePackages.ServicePackage;
import com.ptrml.Services.DataService;
import com.ptrml.Services.RoamService;
import com.ptrml.Services.SmsService;
import com.ptrml.Services.VoiceService;

public class Main {

    public static void main(String[] args) {

// podgotovka na prototipovi - paketi so kombinacija na servisi
        ServicePackage sp1 = new ServicePackage("post-paid");
        sp1.AddService(new VoiceService(500.0,500.0,30,3.9,0.0,0));
        sp1.AddService(new SmsService(0.0,50,4.9));
        sp1.AddService(new DataService(300.0,5,100*1024,4.0));
        sp1.AddService(new RoamService());
        ServicePackage sp2 = new ServicePackage("pre-paid");
        sp2.AddService(new VoiceService(0.0,0.0,60,6.9,6.9,60));
        sp2.AddService(new SmsService(0.0,0,5.0));
        ServicePackage sp3 = new ServicePackage("pre-paid-data+");


// dodavanje na paketite vo Prototype Manager
        PackageFactory.AddPrototype(sp1);
        PackageFactory.AddPrototype(sp2);
        PackageFactory.AddPrototype(sp3);
// kreiranje na kopii na paketite po potreba so koloniranje
        ServicePackage psp1 = PackageFactory.findAndClone("post-paid");
        ServicePackage psp2 = PackageFactory.findAndClone("pre-paid");
        ServicePackage psp3 = PackageFactory.findAndClone("pre-paid-data+");
// rabota so paketite, na pr.
        System.out.printf( " List of services & subscription prices in package: %s",psp1.getName());
        psp1.ListServices();
        System.out.printf( "Total: \t %s" ,psp1.PackagePrice());
        System.out.printf( " List of services & subscription prices in package: $s",psp2.getName());
        psp2.ListServices();
        System.out.printf( "Total: \t %s" ,psp2.PackagePrice());
        System.out.printf( " List of services & subscription prices in package: $s",psp3.getName());
        psp3.ListServices();
        System.out.printf( "Total: \t %s" ,psp3.PackagePrice());
    }
}
