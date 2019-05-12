package unid2code2;
public class Unid2code2 {
    public static void main(String[] args) {
        FuncionarioComissionado f = new FuncionarioComissionado("José", "Maria", 1234.54, 2);
        f.vendeu(5);
        System.out.println("Nome: " + f.getNome());
        System.out.println("Sobrenome: " + f.getSobrenome());
        System.out.println("Salário Base: " + f.getSalario());
        System.out.println("Total (Sal + Com): " + f.calcPagamento());
    }
    
}
