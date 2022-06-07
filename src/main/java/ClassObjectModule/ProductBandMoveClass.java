package ClassObjectModule;

import InterfaceModule.ISeries;
//Seri Uretim yapan cns tezgahinda urunlere bastigimiz bant numarasinin kodlandigi modulu yaziyoruz.
/*
* Dikkat edilirse TwoD cizim yapan sinifimizla ProductBand sinifimizin yaptigi isler tamamen farkli sonuclar dogurmaktadir.
* Iste birbirinden bagimsiz olarak farkli islevleri gerceklestirdigimiz (PolyMorphism) kavramini tam olarak hayata gecirdik.
* */
// ISeries`i impelement ederek tum methodlarini override ederek Band modulunu gelistiriyoruz.

//Ayrica TwoD_DrawClass sinifinda tanimlanmis olan getPrevious methodunu da bu module dahil edebilmek icin
//Miras alma yoluyla [Inheritance] TwoD sinifini inherit ettik.
public class ProductBandMoveClass extends TwoD_DrawClass implements ISeries {
    int productBandId;
    int currentBandVal;
    int prevBandVal;
    //Constructor
    public ProductBandMoveClass(){
        productBandId=0;
        currentBandVal=0;
        prevBandVal=-1;
    }

    @Override
    public int getNext() {
        currentBandVal+=1; // Urunin Band Id numarsini bir sonraki +1 band id sine ilerlet.
        return currentBandVal;
    }

    @Override
    public void reset() {
        currentBandVal=0; // Band id sini sifirla
    }

    @Override
    public void setStart(int x) {
    // Urunun Bant Idsini istedigimiz seri no ya set et.
        productBandId=x;
        currentBandVal=productBandId;
        prevBandVal=currentBandVal-1;
    }
    //TwoD_DrawClass ta tanimlanan ancak bu sinifimizda da kullanmak isteyecegimiz icin inherit ettigimiz sinifin methodu.
    @Override
    public int getPrevious() {
        //override ettigimiz methodu kendi ihtiyaclarimiz icin yeniden yazip.
        //Band id sini 1 arttirarak devam edildigini varsayarak methodu buna gore override ediyoruz.
        return prevBandVal;
    }
}
