public class ConsultaCasal extends Consulta {
    private String conflitoPrincipal;

    public ConsultaCasal(String paciente, String psicologo, String dia, double valor, String conflitoPrincipal) {
        super(paciente, psicologo, dia, valor);
        this.conflitoPrincipal = conflitoPrincipal;
    }
    public String getConflitoPrincipal() {
        return conflitoPrincipal;
    }
    public void setConflitoPrincipal(String conflitoPrincipal) {
        this.conflitoPrincipal = conflitoPrincipal;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Conflito Principal: " + conflitoPrincipal);
    }
    public void mostrarDados(boolean confidencial) {
        if(confidencial) {
            mostrarDados();
            System.out.println("Informações confidenciais não serão exibidas.");
        }
        else {
            mostrarDados();
            System.out.println("Conflito Principal: " + conflitoPrincipal);
        }
    }
}