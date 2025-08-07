interface Movimentavel {
    void mover();
}

interface Comunicavel {
    void comunicar();
}

abstract class Robo implements Movimentavel, Comunicavel {
    protected String nome;

    public Robo(String nome) {
        this.nome = nome;
    }
    public void mover() {
        System.out.println(nome + " está se movendo.");
    }

  
}

class RoboLimpeza extends Robo {
    public RoboLimpeza(String nome) {
        super(nome);
    }


    public void comunicar() {
        System.out.println(nome + " diz: Iniciando limpeza!");
    }
}

class RoboAssistente implements Movimentavel, Comunicavel {
    private String nome;

    public RoboAssistente(String nome) {
        this.nome = nome;
    }

   
    public void mover() {
        System.out.println(nome + " se move para ajudar.");
    }

  
    public void comunicar() {
        System.out.println(nome + " diz: Precisa de ajuda?");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        RoboLimpeza r1 = new RoboLimpeza("RoboLimp");
        r1.mover();
        r1.comunicar();

        RoboAssistente r2 = new RoboAssistente("RoboHelp");
        r2.mover();
        r2.comunicar();
    }
}
