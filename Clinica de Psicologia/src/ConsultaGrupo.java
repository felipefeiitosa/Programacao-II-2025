public class ConsultaGrupo extends Consulta {
    int numParticipantes;

    public ConsultaGrupo(String paciente, String psicologo, String dia, double valor, int numParticipantes) {
        super(paciente, psicologo, dia, valor);
        this.numParticipantes = numParticipantes;
    }
    public int getNumParticipantes() {
        return numParticipantes;
    }
    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de Participantes: " + numParticipantes);
    }
    public void mostrarDados(boolean detalharPorPessoa) {
        if(detalharPorPessoa) {
            mostrarDados();
            System.out.println("Valor por Pessoa: R$" + (getValor() / numParticipantes));
        }
        else {
            mostrarDados();
            System.out.println("Valor total da Consulta: R$" + getValor());
        }
    }
}