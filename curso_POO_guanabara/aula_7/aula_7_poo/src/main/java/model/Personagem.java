package model;

public class Personagem {
    private String nome;
    private String tipo;
    private int idade;
    private  float altura;
    private float peso;
    private String categoria;
    private int wins;
    private int lose;
    private int empate;
    private float power;
    private float shild;
    private  int level;









    public Personagem() {
    }

    public Personagem(String nome, String tipo, int idade, float altura, float peso, String categoria, int wins, int lose, int empate, float power, float shild, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        setCategoria(categoria);
        this.wins = wins;
        this.lose = lose;
        this.empate = empate;
        this.power = power;
        this.shild = shild;
        this.level = level;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (peso <= 52){

        } else if (peso > 52 && peso <=  80) {

        } else if (peso > 80 && peso<= 99) {

        }else if (peso > 99 && peso <= 112){

        }else {

        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power * (1 + (level / 10));
    }

    public float getShild() {
        return shild;
    }

    public void setShild(float shild) {
        this.shild = shild * (1 + (level / 10));
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
