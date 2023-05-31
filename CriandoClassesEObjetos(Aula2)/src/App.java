public class App {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta();
        c1.marca = "BIC";
        c1.cor = "azul";
        //c1.ponta = 0.5f; (Atributo privado)
        c1.carga = 90;

        c1.destampar();
        c1.status();
        c1.rabiscar();


        Caneta c2 = new Caneta();
        c2.marca = "FaberCastell";
        c2.cor = "Vermelha";
        //c2.ponta = 1f; (Atributo privado)
        c2.carga = 50;

        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
