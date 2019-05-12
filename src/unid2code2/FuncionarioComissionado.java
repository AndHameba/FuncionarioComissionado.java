package unid2code2;

public class FuncionarioComissionado extends Funcionario {
    private final double comissao; // A IDE modificou automaticamente
    private int quantidadeVendida;
    
    public FuncionarioComissionado(String nome, String sobrenome, double salario, double comissao){
        super.funcionario(nome, sobrenome, salario);
        this.comissao = comissao;
    }
    public double calcPagamento(){
        return(getSalario() + (comissao * this.quantidadeVendida));
    }
    public void vendeu(int qtdVendida){
        this.quantidadeVendida = this.quantidadeVendida + qtdVendida;
    }
    public void zeraVendas(){
        this.quantidadeVendida = 0;
    }
}
