package desafio2;

import java.util.Scanner;

// Classe base
abstract class Heroi {
    protected String nome;
    protected String poder;

    public Heroi(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public abstract void atacar();
}

// Subclasses
class Guerreiro extends Heroi {
    public Guerreiro() {
        super("Guerreiro", "Espada");
    }

    @Override
    public void atacar() {
        System.out.println(nome + ": Ataca com espada!");
    }
}

class Mago extends Heroi {
    public Mago() {
        super("Mago", "Magia");
    }

    @Override
    public void atacar() {
        System.out.println(nome + ": Lança bola de fogo!");
    }
}

class Arqueiro extends Heroi {
    public Arqueiro() {
        super("Arqueiro", "Arco e Flecha");
    }

    @Override
    public void atacar() {
        System.out.println(nome + ": Dispara uma flecha precisa!");
    }
}

// Programa principal
public class Arena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação dos heróis
        Heroi[] herois = {new Guerreiro(), new Mago(), new Arqueiro()};

        System.out.println("Escolha o primeiro herói (0=Guerreiro, 1=Mago, 2=Arqueiro): ");
        int escolha1 = sc.nextInt();

        System.out.println("Escolha o segundo herói (0=Guerreiro, 1=Mago, 2=Arqueiro): ");
        int escolha2 = sc.nextInt();

        Heroi h1 = herois[escolha1];
        Heroi h2 = herois[escolha2];

        System.out.println("\nHeróis escolhidos: " + h1.nome + " vs " + h2.nome);
        h1.atacar();
        h2.atacar();

        sc.close();
    }
}
