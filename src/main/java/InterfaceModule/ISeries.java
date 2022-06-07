package InterfaceModule;

//Ne yapar ? sorusuna eylem belirtmeden cevap verebiliyorsaniz Interface Kullanmalisiniz.

//Polymorphism : Interface Birden fazla Class veya Method kullaniminin tam anlamiyla uygulanmasi ile polymorphismi tam temsil eder.
//Geleneksel olarak intertace isimlendirmeleri I ile baslar. ex: ICar , IBook
//Interface uyerleri statik olarak deklare edilemezler.
//Uyeleri varsayilan olarak Publuc erisim belirleyici ile isaretlenmistir.

//Bir fabrikada kullanilan CNS makinasinin farkli cizim kombinasyonlari icin bir interface yazalim.

public interface ISeries {
int getNext(); // seri icinde ki bir sonraki sayiyi dondurur
void reset(); // yeniden baslatir.
void setStart(int x); // baslangic degerini ayarla

}
