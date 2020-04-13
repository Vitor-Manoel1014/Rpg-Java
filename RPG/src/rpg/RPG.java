package rpg;

import javax.swing.JOptionPane;

public class RPG {

    public static void main(String[] args) {

        //Estanciando as classes //Parametros de personagem: nome, tipo, provocacao, arma, energiaMax, ataque, defesa, vida, poderDeRegeneracao, velocidade
        Personagem a = new Personagem("Kakashi", "Assassino", " - Lhe falta ódio.", "faca", 100, 40, 10, 60, 15, 70);
        Personagem b = new Personagem("Erick", "Beserker", " - Aaaaargh, você é fraco como uma moça.", "machado", 6, 90, 5, 135, 5, 5);
        Personagem e = new Personagem("Jon", "Escudeiro", " - Sua defesa está aberta inútil.", "escudo", 9, 50, 35, 120, 0, 15);
        Personagem g = new Personagem("Arghs", "Goblin", " - Aaarhrh aaahg aahgg.", "mão", 3, 5, 5, 35, 10, 90);
        Personagem m = new Personagem("Rasdalf", "Mago", " - Roubarei sua alma.", "feitiço", 12, 60, 20, 70, 15, 10);
        Personagem p = new Personagem("Jorge", "Paladino", " - Te falta fé.", "espada sagrada", 10, 55, 20, 90, 10, 20);
        Livro_Sagrado_das_Regras Livro = new Livro_Sagrado_das_Regras();
        Luta lut = new Luta();

        //Escolha e combinações de lutas
        int luta = 100;
        while (luta != 0) {
            luta = Integer.parseInt(JOptionPane.showInputDialog("Digite quem o player 1 irá controlar\n"
                    + "Nenhum        "
                    + " ------ 0\n"
                    + a.getTipo() + "      ------ " + "1\n"
                    + b.getTipo() + "        ------ " + "2\n"
                    + e.getTipo() + "      ------ " + "3\n"
                    + g.getTipo() + "             ------ " + "4\n"
                    + m.getTipo() + "              ------ " + "5\n"
                    + p.getTipo() + "        ------ " + "6"));
            switch (luta) {
                case 0:
                    JOptionPane.showMessageDialog(null, "GAME OVER");
                    break;
                case 1:
                    luta = Integer.parseInt(JOptionPane.showInputDialog("Digite quem o player 2 irá controlar\n"
                            + "Nenhum         ------ 0\n"
                            + a.getTipo() + "      ------ " + "1\n"
                            + b.getTipo() + "        ------ " + "2\n"
                            + e.getTipo() + "      ------ " + "3\n"
                            + g.getTipo() + "             ------ " + "4\n"
                            + m.getTipo() + "              ------ " + "5\n"
                            + p.getTipo() + "        ------ " + "6"));
                    switch (luta) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "GAME OVER");
                            break;
                        case 1:
                            lut.lutar(a, a);
                            break;
                        case 2:
                            lut.lutar(a, b);
                            break;
                        case 3:
                            lut.lutar(a, e);
                            break;
                        case 4:
                            lut.lutar(a, g);
                            break;
                        case 5:
                            lut.lutar(a, m);
                            break;
                        case 6:
                            lut.lutar(a, p);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Esse comando não existe");
                            continue;
                    }
                    break;
                case 2:
                    luta = Integer.parseInt(JOptionPane.showInputDialog("Digite quem o player 2 irá controlar\n"
                            + "Nenhum         ------ 0\n"
                            + a.getTipo() + "      ------ " + "1\n"
                            + b.getTipo() + "        ------ " + "2\n"
                            + e.getTipo() + "      ------ " + "3\n"
                            + g.getTipo() + "             ------ " + "4\n"
                            + m.getTipo() + "              ------ " + "5\n"
                            + p.getTipo() + "        ------ " + "6"));
                    switch (luta) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "GAME OVER");
                            break;
                        case 1:
                            lut.lutar(b, a);
                            break;
                        case 2:
                            lut.lutar(b, b);
                            break;
                        case 3:
                            lut.lutar(b, e);
                            break;
                        case 4:
                            lut.lutar(b, g);
                            break;
                        case 5:
                            lut.lutar(b, m);
                            break;
                        case 6:
                            lut.lutar(b, p);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Esse comando não existe");
                            continue;
                    }
                    break;
                case 3:
                    luta = Integer.parseInt(JOptionPane.showInputDialog("Digite quem o player 2 irá controlar\n"
                            + "Nenhum         ------ 0\n"
                            + a.getTipo() + "      ------ " + "1\n"
                            + b.getTipo() + "        ------ " + "2\n"
                            + e.getTipo() + "      ------ " + "3\n"
                            + g.getTipo() + "             ------ " + "4\n"
                            + m.getTipo() + "              ------ " + "5\n"
                            + p.getTipo() + "        ------ " + "6"));
                    switch (luta) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "GAME OVER");
                            break;
                        case 1:
                            lut.lutar(e, a);
                            break;
                        case 2:
                            lut.lutar(e, b);
                            break;
                        case 3:
                            lut.lutar(e, e);
                            break;
                        case 4:
                            lut.lutar(e, g);
                            break;
                        case 5:
                            lut.lutar(e, m);
                            break;
                        case 6:
                            lut.lutar(e, p);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Esse comando não existe");
                            continue;
                    }
                    break;
                case 4:
                    luta = Integer.parseInt(JOptionPane.showInputDialog("Digite quem o player 2 irá controlar\n"
                            + "Nenhum         ------ 0\n"
                            + a.getTipo() + "      ------ " + "1\n"
                            + b.getTipo() + "        ------ " + "2\n"
                            + e.getTipo() + "      ------ " + "3\n"
                            + g.getTipo() + "             ------ " + "4\n"
                            + m.getTipo() + "              ------ " + "5\n"
                            + p.getTipo() + "        ------ " + "6"));
                    switch (luta) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "GAME OVER");
                            break;
                        case 1:
                            lut.lutar(g, a);
                            break;
                        case 2:
                            lut.lutar(g, b);
                            break;
                        case 3:
                            lut.lutar(g, e);
                            break;
                        case 4:
                            lut.lutar(g, g);
                            break;
                        case 5:
                            lut.lutar(g, m);
                            break;
                        case 6:
                            lut.lutar(g, p);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Esse comando não existe");
                            continue;
                    }
                    break;
                case 5:
                    luta = Integer.parseInt(JOptionPane.showInputDialog("Digite quem o player 2 irá controlar\n"
                            + "Nenhum         ------ 0\n"
                            + a.getTipo() + "      ------ " + "1\n"
                            + b.getTipo() + "        ------ " + "2\n"
                            + e.getTipo() + "      ------ " + "3\n"
                            + g.getTipo() + "             ------ " + "4\n"
                            + m.getTipo() + "              ------ " + "5\n"
                            + p.getTipo() + "        ------ " + "6"));
                    switch (luta) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "GAME OVER");
                            break;
                        case 1:
                            lut.lutar(m, a);
                            break;
                        case 2:
                            lut.lutar(m, b);
                            break;
                        case 3:
                            lut.lutar(m, e);
                            break;
                        case 4:
                            lut.lutar(m, g);
                            break;
                        case 5:
                            lut.lutar(m, m);
                            break;
                        case 6:
                            lut.lutar(m, p);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Esse comando não existe");
                            continue;
                    }
                    break;
                case 6:
                    luta = Integer.parseInt(JOptionPane.showInputDialog("Digite quem o player 2 irá controlar\n"
                            + "Nenhum         ------ 0\n"
                            + a.getTipo() + "      ------ " + "1\n"
                            + b.getTipo() + "        ------ " + "2\n"
                            + e.getTipo() + "      ------ " + "3\n"
                            + g.getTipo() + "             ------ " + "4\n"
                            + m.getTipo() + "              ------ " + "5\n"
                            + p.getTipo() + "        ------ " + "6"));
                    switch (luta) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "GAME OVER");
                            break;
                        case 1:
                            lut.lutar(p, a);
                            break;
                        case 2:
                            lut.lutar(p, b);
                            break;
                        case 3:
                            lut.lutar(p, e);
                            break;
                        case 4:
                            lut.lutar(p, g);
                            break;
                        case 5:
                            lut.lutar(p, m);
                            break;
                        case 6:
                            lut.lutar(p, p);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Esse comando não existe");
                            continue;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esse comando não existe");
                    continue;
            }
        }
        //Agradecimentos
        Livro.pag0();
        Livro.fim();
    }
}
