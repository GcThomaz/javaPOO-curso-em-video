public class Caneta {
    public String marca;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    //Método status
    public void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Tampada? " + this.tampada);
  
    }

    //Método rabiscar
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Nao posso rabiscar com a caneta tampada.");
        } else {
            System.out.println("Posso rabiscar!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
