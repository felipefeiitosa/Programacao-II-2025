public class ConsultaIndividual extends Consulta {
    private int duracao;

    public ConsultaIndividual(String paciente, String psicologo, String dia, double valor, int duracao) {
        super(paciente, psicologo, dia, valor);
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
        System.out.println("Duração da Consulta: " + duracao + " horas");

    }
    public void mostrarDados(boolean emMinutos) {
        if (emMinutos) {
            System.out.println("Duração da Consulta: " + (duracao * 60.0) + " minutos");
        }
        else {
            }
            System.out.println("Duração da Consulta: " + duracao + " horas");
        }
    }