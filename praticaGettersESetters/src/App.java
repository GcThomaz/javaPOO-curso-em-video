public class App {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta("BIC", "Amarela", 0.4f, true);
        c1.status();
        Caneta c2 = new Caneta("kkkk", "preto", 0.7f, false);
        c2.status();
    }
}
