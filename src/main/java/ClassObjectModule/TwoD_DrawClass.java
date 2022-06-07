package ClassObjectModule;

import InterfaceModule.ISeries;
//TwoD_DrawClass` imizda cns makinemizle 2d cizim yapmamizi saglayan bir Class yaziyoruz.
// ISeries`i impelement ederek tum methodlarini override ederek TwoDraw modulunu gelistiriyoruz.

public class TwoD_DrawClass implements ISeries {
    int start;
    int val;
    int prev;
    //Constructor
    public TwoD_DrawClass(){
        start=0;
        val=0;
        prev=-2;
    }

    @Override
    public int getNext() {
        val+=2; // cizimi 2 deger artirarak devam ettir.
        return val;
    }

    @Override
    public void reset() {
     val=0; // cizim noktasini sifirla.
    }

    @Override
    public void setStart(int x) {
        //Cizime baslanacak noktayi set et.
     start=x;
     val=start;
     prev=val-2;
    }
    //ISeries tarafindan belirtilmeyen bir metot
    public  int getPrevious(){
        return prev;
    }
}
