public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado da TV: " + smartTv.ligada + "\nCanal atual: " + smartTv.canal + "\nVolume atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(15);

        System.out.println("Estado da TV: " + smartTv.ligada + "\nCanal atual: " + smartTv.canal + "\nVolume atual: " + smartTv.volume);
    }
}