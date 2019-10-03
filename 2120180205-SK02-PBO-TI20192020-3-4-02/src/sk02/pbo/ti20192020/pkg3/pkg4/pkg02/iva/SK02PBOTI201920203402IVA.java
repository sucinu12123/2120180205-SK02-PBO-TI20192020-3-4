package sk02.pbo.ti20192020.pkg3.pkg4.pkg02.iva;
public class SK02PBOTI201920203402IVA {

    public static void main(String[] args) {
        handphone handphone = new handphone();
        handphone.sms=100;                
        handphone.telefon=25;        
        System.out.println(handphone.nama);
        System.out.println("Chat anda sekarang "+handphone.sms);
        System.out.println("Anda tidak menjawab "+handphone.telefon);
        handphone.mengirimGambar();
        handphone.mengirimPesan();
    }
    
}
