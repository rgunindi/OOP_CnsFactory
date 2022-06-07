package ClassObjectModule;

import AbstractModule.PressBrandAbstract;

//AbstractClassi implement ettigimiz icin Abstract method olarak tanimladigimiz setBrand i burada override edip govdesini yazmaliyiz.
public class PressServices extends PressBrandAbstract {
    public PressServices(String brand) {
        super(brand);
    }

    @Override
    public void setBrandDetail(Object ... desc) {
        //Hangi urun siparis alacagimizi bilmedigimiz icin Abstract olarak belittigimiz urune ozellestirilmis detay ekliyoruz.
        //Bu detay cesiti urenden urene degistigi icin istenilen sayida detay girilebilecek kod ile govdemizi yaziyoruz.
        //Elektriğin yoğun olarak kullanıldığı yerlerden uzak tutunuz!/n Statik elektrikten etkilenmektedir.
        StringBuilder description= new StringBuilder();
        for (Object data : desc) {
            description.append("\n".concat(data.toString()));
        }
        brandDetails= description.toString();
    }
}
