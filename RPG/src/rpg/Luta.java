package rpg;

import javax.swing.JOptionPane;

public class Luta {

    public void lutar(Personagem p, Personagem b) {
        int op = 100;
        //Reiniciar os atributos caso haja duas lutas com o mesmo personagem
        p.setVida(p.getVidaS());
        p.setDefesaExtra(0);
        p.setVelocidadeExtra(0);
        p.setEnergia(p.getEnergiaMax());
        b.setVida(b.getVidaS());
        b.setDefesaExtra(0);
        b.setVelocidadeExtra(0);
        b.setEnergia(b.getEnergiaMax());
        //Escolha de lado
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Quem deseja começar?\n"
                + "1 --------------- " + b.getTipo() + "\n"
                + "2 --------------- " + p.getTipo()));
        while (op != 0) {
            if (lado % 2 == 0) {
                //Menu de opções
                op = Integer.parseInt(JOptionPane.showInputDialog(p.getNome() + " o " + p.getTipo() + "\n"
                        + "Estado:\n"
                        + "Vida: " + p.getVida() + "                         " + "Energia: " + p.getEnergia() + "\n"
                        + "Ataque: " + p.getAtaque() + "                    " + "Defesa: " + (p.getDefesa() + p.getDefesaExtra()) + "\n"
                        + "Regeneração: " + p.getPoderDeRegeneracao() + "        " + "Velocidade: " + (p.getVelocidade() + p.getVelocidadeExtra()) + "\n\n"
                        + b.getNome() + " o " + b.getTipo() + "\n"
                        + "Estado:\n"
                        + "Vida: " + b.getVida() + "                         " + "Energia: " + b.getEnergia() + "\n"
                        + "Ataque: " + b.getAtaque() + "                    " + "Defesa: " + (b.getDefesa() + b.getDefesaExtra()) + "\n"
                        + "Regeneração: " + b.getPoderDeRegeneracao() + "        " + "Velocidade: " + (b.getVelocidade() + b.getVelocidadeExtra()) + "\n\n"
                        + "Vez de " + p.getTipo() + "\n\n"
                        + "Digite:\n"
                        + "Sair             ---------------------- 0\n"
                        + "Atacar           ---------------------- 1\n"
                        + "Defender         ---------------------- 2\n"
                        + "Regenerar        ---------------------- 3\n"
                        + "Esquivar         ---------------------- 4\n"
                        + "Provocar         ---------------------- 5"));
                switch (op) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Game Over");
                        break;
                    case 1:
                        p.atacar(b);
                        break;
                    case 2:
                        p.defender();
                        break;
                    case 3:
                        p.regenerar();
                        break;
                    case 4:
                        p.esquivar();
                        break;
                    case 5:
                        p.provocar();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Esse comando não existe, perdeu a vez otário");
                }
            } else {
                //Menu de opções
                op = Integer.parseInt(JOptionPane.showInputDialog(p.getNome() + " o " + p.getTipo() + "\n"
                        + "Estado:\n"
                        + "Vida: " + p.getVida() + "                         " + "Energia: " + p.getEnergia() + "\n"
                        + "Ataque: " + p.getAtaque() + "                    " + "Defesa: " + (p.getDefesa() + p.getDefesaExtra()) + "\n"
                        + "Regeneração: " + p.getPoderDeRegeneracao() + "        " + "Velocidade: " + (p.getVelocidade() + p.getVelocidadeExtra()) + "\n\n"
                        + b.getNome() + " o " + b.getTipo() + "\n"
                        + "Estado:\n"
                        + "Vida: " + b.getVida() + "                         " + "Energia: " + b.getEnergia() + "\n"
                        + "Ataque: " + b.getAtaque() + "                    " + "Defesa: " + (b.getDefesa() + b.getDefesaExtra()) + "\n"
                        + "Regeneração: " + b.getPoderDeRegeneracao() + "        " + "Velocidade: " + (b.getVelocidade() + b.getVelocidadeExtra()) + "\n\n"
                        + "Vez de " + b.getTipo() + "\n\n"
                        + "Digite:\n"
                        + "Sair             ---------------------- 0\n"
                        + "Atacar           ---------------------- 1\n"
                        + "Defender         ---------------------- 2\n"
                        + "Regenerar        ---------------------- 3\n"
                        + "Esquivar         ---------------------- 4\n"
                        + "Provocar         ---------------------- 5"));
                switch (op) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Game Over");
                        break;
                    case 1:
                        b.atacar(p);
                        break;
                    case 2:
                        b.defender();
                        break;
                    case 3:
                        b.regenerar();
                        break;
                    case 4:
                        b.esquivar();
                        break;
                    case 5:
                        b.provocar();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Esse comando não existe, perdeu a vez otário");
                }
            }
            //Mudança de lado, reinicialização dos metodos esquivar e defender e energia ganha apos rodada.
            if (lado % 2 == 0) {
                lado++;
                b.setDefesaExtra(0);
                b.setVelocidadeExtra(0);
            } else {
                lado++;
                p.energiaPosRodada();
                b.energiaPosRodada();
                p.setDefesaExtra(0);
                p.setVelocidadeExtra(0);
            }
            //Derrota de alguem
            if (p.getVida() <= 0) {
                op = 0;
                JOptionPane.showMessageDialog(null, p.getTipo() + " foi derrotado");
                JOptionPane.showMessageDialog(null, "PARABENS " + b.getTipo() + " você é o vencedor");
                JOptionPane.showMessageDialog(null, "Obrigado por jogar meu mini jogo ;)");
            } else if (b.getVida() <= 0) {
                op = 0;
                JOptionPane.showMessageDialog(null, b.getTipo() + " foi derrotado");
                JOptionPane.showMessageDialog(null, "PARABENS " + p.getTipo() + " você é o vencedor");
                JOptionPane.showMessageDialog(null, "Obrigado por jogar meu mini jogo ;)");
            }
        }
    }
}
