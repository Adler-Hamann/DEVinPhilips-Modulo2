import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private double peso;
    private double altura;
    private double idade;

    public Cliente(double peso, double altura) {
           this.peso = peso;
           this.altura = altura;
    }

    public Cliente(double peso, double altura, String nome, double idade) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getIdade() {
        return idade;
    }
}