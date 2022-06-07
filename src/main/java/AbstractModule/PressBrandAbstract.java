package AbstractModule;

//Interface & Absract Farki
// Ne yapar sorusuna cevabimiz Interface tarafindan verilebilmektedir.
// Ancak az da olsa uygulamanin nasil yapacagi konusunda bilgi icerecek ise o zaman Abstract classlar kullanilmalidir.

//Urunlerimize marka basan clasimizi yazalim. Ancak hangi markalarin basilacagi konusunu bilmedigimizi unutmayin!
//hangi markalarin urunumuzu satin alip uretim isteyecegini bilmedigimiz icin markayi basan methodu abstract olarak yazacagiz.

import java.time.LocalTime;

public abstract class PressBrandAbstract {
    String ownerCompany; // Bizim sirketimizin tutuldugu degisken
    String brandName;   // Urun gelistirilmesi icin siparis veren marka
    LocalTime productDate;   //Urun gelistirilme tarihi
    public String brandDetails;
    //Eger urunumuz icin bir marka degeri yoksa Made in Turkey varsayilan olarak marka yerine basilacaktir.
    public PressBrandAbstract(){this("Made in Turkey ");}

    public PressBrandAbstract(String brand){
        ownerCompany="By Gül CNS LTD.STI.";
        brandName=brand;
        productDate= LocalTime.now();
        brandDetails="";
    }

    //marka degerlerinin disinda ozel tasarim eklentileri olabileceginden Abstract sinifimizi implement eden Sinif tarafindan
    // abstract methodumuzun govdesi yazilacaktir.
    public abstract void setBrandDetail(Object ... desc);
    String getDetails(){return brandDetails;}
    @Override
    public String toString() {
        //Press degerlerini toString methodunu override ederek basim icin gonderiyoruz.
        return ownerCompany.concat(brandName).concat(productDate.toString()).concat(getDetails());
    }
}
