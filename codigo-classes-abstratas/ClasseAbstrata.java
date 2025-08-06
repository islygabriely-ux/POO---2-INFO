Classe abstrata
abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public abstract double calcularBonus();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salario);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("-------------------------");
    }
}
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    public double calcularBonus() {
        return salario * 0.20;
    }
}
class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    public double calcularBonus() {
        return salario * 0.10;
    }
}
public class ClasseAbstrata {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Carlos", 5000);
        Funcionario f2 = new Desenvolvedor("Ana", 4000);

        f1.exibirInformacoes();
        f2.exibirInformacoes();
    }
}
