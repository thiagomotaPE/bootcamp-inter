public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("volume atual : " + smartTV.volume);

        smartTV.mudarCanal(105);
        System.out.println("novo canal: " + smartTV.canal);

        System.out.println("TV ligada ?" + smartTV.ligada);
        System.out.println("canal atual :" + smartTV.canal);
        System.out.println("volume atual :" + smartTV.volume);

        smartTV.ligar();
        System.out.println("update - TV ligada ?" + smartTV.ligada);
        smartTV.desligar();
        System.out.println("update - TV ligada ?" + smartTV.ligada);

    }
}
