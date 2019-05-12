package unid2code2;
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public void funcionario(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    
}


