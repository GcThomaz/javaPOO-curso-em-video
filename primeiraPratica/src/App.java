public class App {
    public static void main(String[] args) throws Exception {

        Conta dono1 = new Conta(5555, "cp", "Jubileu", 300, false);
        Conta dono2 = new Conta(6666, "cc", "Creusa", 500, false);

        
        dono1.abrirConta("cp");
        dono1.depositar(100);
        dono1.fecharConta();
        dono1.status();
        
        dono2.abrirConta("cc");
        dono2.depositar(500);
        dono2.status();

        
        
        
    }
}
