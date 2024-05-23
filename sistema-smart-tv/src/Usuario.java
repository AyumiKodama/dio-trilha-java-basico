public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        
        System.out.println("Volume atual?" + smartTv.volume);
        System.out.println("Tv ligada?" + smartTv.ligada);

        smartTv.trocarCanal(54);
        System.out.println("Canal atual depois de trocado " + smartTv.canal);
    }
}
