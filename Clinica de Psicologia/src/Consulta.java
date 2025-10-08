public class Consulta {
    protected String paciente;
    protected String psicologo;
    protected double valor;
    protected String dia;

    public Consulta(String paciente, String psicologo, String dia, double valor) {
    this.paciente = paciente;
        this.psicologo = psicologo;
        this.dia = dia;
        this.valor = valor;
    }
    public String getPaciente() {
        return paciente;
    }
    public String getPsicologo() {
        return psicologo;
    }
    public String getDia() {
        return dia;
    }
    public double getValor() {
        return valor;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public void setPsicologo(String psicologo) {
        this.psicologo = psicologo;
    }
    public void setDia(String dia){
        this.dia = dia;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void mostrarDados() {
        System.out.println("Paciente: " + paciente);
        System.out.println("Psicólogo: " + psicologo);
        System.out.println("Dia: " + dia);
        System.out.println("Valor da Consulta: R$" + valor);
    }
    public void mostrarDados(double desconto) {
        System.out.println("Paciente: " + paciente);
        System.out.println("Psicólogo: " + psicologo);
        System.out.println("Valor da Consulta com Desconto: R$" + (valor - desconto));
    }
}