package model;

public class Luta {
    private Personagem desafiado;
    private Personagem desafiante;
    private int raunds;
    private boolean aprovada;

    public Luta() {
    }

    public Luta(Personagem desafiado, Personagem desafiante, int raunds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.raunds = raunds;
        this.aprovada = aprovada;
    }

    public Personagem getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Personagem desafiado) {
        this.desafiado = desafiado;
    }

    public Personagem getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Personagem desafiante) {
        this.desafiante = desafiante;
    }

    public int getRaunds() {
        return raunds;
    }

    public void setRaunds(int raunds) {
        this.raunds = raunds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
