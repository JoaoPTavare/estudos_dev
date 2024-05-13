public class Main {
    public static void main(String[] args) {



        Caneta c1 = new Caneta();
        c1.setCor("Verde");
        c1.setCarga(25);
        c1.setPonta(1f);
        c1.setModelo("Bic");
        c1.statusCaneta();
        c1.tamparCaneta();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.desenhar();



        Caneta c2 = new Caneta();
        c2.setCarga(80);
        c2.setCor("preto");
        c2.setPonta(0.5f);
        c2.setModelo("Sem marca");


    }
}