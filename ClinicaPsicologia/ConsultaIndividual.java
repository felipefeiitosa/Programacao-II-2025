public class ConsultaIndividual extends Consulta {
    private int duracao;

    public ConsultaIndividual(String paciente, String psicologo, double valor, int duracao) {
        super(paciente, psicologo, valor);
        this.duracao = duracao;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Duração da Consulta: " + duracao + " minutos");
    }
    public void mostrarDados(boolean emHoras) {
        if (emHoras) {
            System.out.println("Duração da Consulta: " + (duracao / 60.0) + " horas");
        }
        else {
            System.out.println("Duração da Consulta: " + duracao + " minutos");}
        }
    }