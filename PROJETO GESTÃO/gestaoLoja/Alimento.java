package gestaoLoja;

public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Data de Validade: " + dataValidade);
    }
    public void mostrarDados(boolean verValidade) {
        if(verValidade) {
            int anoAtual = 2025;
            int mesAtual = 10;
            int diaAtual = 06;
            int diasRestantes = 30;
            String[] partesData = dataValidade.split("/");
            int diaValidade = Integer.parseInt(partesData[0]);
            int mesValidade = Integer.parseInt(partesData[1]);
            int anoValidade = Integer.parseInt(partesData[2]);
            if (anoValidade > anoAtual || (anoValidade == anoAtual && mesValidade > mesAtual) ||
                (anoValidade == anoAtual && mesValidade == mesAtual && diaValidade >= diaAtual)) {
                int mesesRestantes = (anoValidade - anoAtual) * 12 + (mesValidade - mesAtual);
                if (diaValidade < diaAtual) {
                    mesesRestantes--;
                    diasRestantes += 30; // Aproximação
                    } 
                diasRestantes += diaValidade - diaAtual;
                System.out.println("O alimento está dentro da validade. Restam " + mesesRestantes + " meses e " + diasRestantes + " dias.");
            } 
            else {
                System.out.println("O alimento está fora da validade.");
            }
        }
        else {
            mostrarDados();
        }
    }
}
