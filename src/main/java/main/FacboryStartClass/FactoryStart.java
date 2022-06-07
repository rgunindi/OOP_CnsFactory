package main.FacboryStartClass;

import ClassObjectModule.PressServices;
import ClassObjectModule.ProductBandMoveClass;
import ClassObjectModule.TwoD_DrawClass;

public class FactoryStart {
    public static void main(String[] args) {
        System.out.println("2D ÇIZIMLER BASLATILIYOR!\n");
        Draw();
        System.out.println("\nBAND SISTEMI CALISTIRILIYOR!\n");
        NextBand();
        System.out.println("\nMARKA PRESS ISLEMLERI GERCEKLESTIRILIYOR!\n");
        Press();
    }

    static void Draw() {
        TwoD_DrawClass ob = new TwoD_DrawClass();
        for (int i = 0; i < 5; i++)
            System.out.println("Next draw point is " + ob.getNext());

        System.out.println("Reset Point");
        ob.reset();

        System.out.println("Starting point 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++)
            System.out.println("Next draw point is " + ob.getNext());
    }

    static void NextBand() {
        ProductBandMoveClass ob = new ProductBandMoveClass();
        for (int i = 0; i < 5; i++)
            System.out.println("Next band id " + ob.getNext());

        System.out.println("Reset Band");
        ob.reset();

        System.out.println("Starting band id");
        ob.setStart(100);
        for (int i = 0; i < 5; i++)
            System.out.println("Next band id: " + ob.getNext());
    }

    static void Press() {
        PressServices ob = new PressServices("Çelik Eller Lti.");
        Object[] details = new Object[]{"Çocuklardan uzak tutunuz!", "Elektriğin yoğun olarak kullanıldığı yerlerden uzak tutunuz!",
                "Statik elektrikten etkilenmektedir."};

        // setBranda istersek Object dizisi gonderebiliriz ek detay girilebilir.
        ob.setBrandDetail(details);
        System.out.println(ob); //Dogrudan toString cagrilir. toStringi override ettigimiz icin.
    }
}
