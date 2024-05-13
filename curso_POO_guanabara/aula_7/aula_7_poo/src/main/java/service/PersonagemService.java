package service;

import model.Personagem;

public interface PersonagemService {
    public void status(String nome, String tipo, int idade, float altura, float peso, String categoria, int wins, int lose, int empate, float power, float shild, int level);
    public void apresentar();
    public void ganahar();
    public void empatar();
    public void  perderLuta();
    public void save(Personagem personagem);
}
