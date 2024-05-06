public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("A Tv está ligada?" + smartTv.ligada);
        System.out.println("O canal é: "+ smartTv.canal);
        System.out.println("O volume atual é: " + smartTv.volume);
    
        smartTv.ligar ();

        System.out.println("A Tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("O novo volume é: " + smartTv.volume);


        smartTv.mudarCanal(13);
            System.out.println("O Canal foi mudado para o Canal " + smartTv.canal);

    }
}
