package service;

import model.Luta;
import model.Personagem;

import java.util.Random;

public class LutaServiceImpl implements LutaService{





    private Luta luta;


    private Personagem personagem1;
    private Personagem personagem2;

    private PersonagemService personagemService;

    public void marcarLuta(Personagem personagem1, Personagem personagem2) {



        if (personagem1.getCategoria().equals(personagem2.getCategoria()) && personagem1 != personagem2){
            this.luta.setAprovada(true);
            this.luta.setDesafiado(personagem1);
            this.luta.setDesafiado(personagem2);
        }
        this.luta.setAprovada(false);
        this.luta.setDesafiado(null);
        this.luta.setDesafiado(null);

    }

    public void luta() {
        if(luta.isAprovada() == false){
            System.out.println("Luta impossivel");
        }else {
                Random random = new Random();
                int vencedor = random.nextInt(3);

                switch (vencedor){
                    case 0:
                        System.out.println("Empate");

                        this.luta.getDesafiado();

                        break;
                    case 1:
                        break;
                    case 2:

                        break;
                }



        }

    }
}
