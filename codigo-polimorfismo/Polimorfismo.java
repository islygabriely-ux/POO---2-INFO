 class Instrumento {
    public void tocar() {
        System.out.println("O instrumento está tocando");
    }
}
class Violao extends Instrumento {
    public void tocar() {
        System.out.println("Tocando violão...");
    }
}
class Bateria extends Instrumento {
    public void tocar() {
        System.out.println("Tocando bateria...");
    }
}
class Flauta extends Instrumento {
    public void tocar() {
        System.out.println("Tocando flauta...");
    }
}
public class Concerto {
    public static void main(String[] args) {
        Instrumento i1 = new Violao();
        Instrumento i2 = new Bateria();
        Instrumento i3 = new Flauta();

        i1.tocar();
        i2.tocar();
        i3.tocar();
    }
}
  
