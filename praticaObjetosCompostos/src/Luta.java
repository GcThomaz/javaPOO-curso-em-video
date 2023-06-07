import java.util.Random;

public class Luta {

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;

    // Metodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("###### DESAFIADO ######");
            this.desafiado.apresentar();
            System.out.println("###### DESAFIANTE ######");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0: //EMPATE
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                    break;
                case 1: //DESAFIADO VENCE
                System.out.println("Vencedor: " + this.desafiado.getNome() + "!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                    break;
                case 2: //DESAFIANDO VENCE
                System.out.println("Vencedor: " + this.desafiante.getNome() + "!");
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("A Luta nao pode acontecer!");
        }
    }
}
