package service;

import model.Personagem;

public class PersonagemServiceImpl implements PersonagemService{

    private PersonagemService personagemService;
    private Personagem personagem;


    public void status(String nome, String tipo, int idade, float altura, float peso, String categoria, int wins, int lose, int empate, float power, float shild, int level) {
        System.out.println(personagem.getNome());
        System.out.println(personagem.getIdade());
        System.out.println(personagem.getAltura());
        System.out.println(personagem.getPeso());
        System.out.println(personagem.getCategoria());
        System.out.println(personagem.getWins());
        System.out.println(personagem.getLose());
        System.out.println(personagem.getEmpate());
        System.out.println(personagem.getLevel());
    }

    public void apresentar() {
      System.out.println("E para o embate de hoje teremos o incrivel: " + this.personagem.getNome() + "!!!!!!!!!!!!!!!!");

    }

    public void ganahar() {

        this.personagem.setWins(personagem.getWins() + 1);

    }

    public void empatar() {
         this.personagem.setEmpate(personagem.getEmpate() + 1);
    }

    public void perderLuta() {
        this.personagem.setEmpate(personagem.getLose() + 1);

    }

    public void save(Personagem personagem) {
         Personagem personagem1 = new Personagem();
         personagemService.save(personagem1);
    }
}
