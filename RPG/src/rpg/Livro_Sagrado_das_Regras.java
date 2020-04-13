package rpg;

import javax.swing.JOptionPane;

public class Livro_Sagrado_das_Regras {

    public void pag0() {
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar o meu código.\nAss: Vitor Manoel");
    }

    public void pag1() {
        JOptionPane.showMessageDialog(null, "PÁGINA 01\n\n\n\n"
                + "                                                                                                                                                    Comandos da luta \n\n\n\n"
                + "Sair: Você simplesmente sai do jogo\n\n"
                + "Atacar: /Gasta 3 de energia/ Seus pontos de ataque são subratraidos pela defesa extra (proporcionada pelo metodo defender) e pela defesa (padrão), após isso esse número vai\n para a variavel dano e subtrai a vida do adversário\n\n"
                + "Defender: /Gasta 2 de energia/ Ao defender seu personagem irá dobrar a defesa, fazendo com que o atributo defesaExtra receba a defesa e se junte na hora de subtrair o ataque.\nObs: Esse método sempre é anulado no final de uma rodada\n\n"
                + "Regenerar: /Ganha 1 de energia/ Ao regenerar seu personagem ganha uma pequena quantidade de vida e ao contrário dos outros métodos ele ganha energia ao invés de perde-la\n\n"
                + "Esquivar: /Ganha 1 de energia/ Nesse método você dobra sua velocidade do mesmo modo do defender, mas agora com a variavel velocidadeExtra.\nObs: Como o defender ele também é anulado ao final da rodada\n\n"
                + "Provocar: Método mais inútil do jogo, você apenas irrita seu adversário, sem nenhum efeito. Obs: Metodo não recomendado.");
    }

    public void pag2() {
        JOptionPane.showMessageDialog(null, "PÁGINA 02\n\n\n\n"
                + "                                                                                                                                                    Explicação da velocidade \n\n\n\n"
                + "Basicamente a velocidade de cada personagem determina a sua chance de se esquivar de um ataque inimigo, ao seu personagem realizar um ataque o inimigo gera um número aleatório de 1 a 100,\n"
                + "esse número é comparado a velocidade do próprio, caso seja menor, ele se esquiva de seu ataque, caso seja maior, nada acontece e seu personagem realiza o ataque normalmente.\n"
                + "Obs: É proibido sua velocidade ficar maior que 90, pois assim seria impossivel ou quase impossivel te atingir e o jogo não teria graça, existe um while dentro do metodo esquivar controlando isso.\n\n"
                + "                                                                                                                                                    Método Lutar \n\n\n\n"
                + "A vez da rodada é feita por conta da variavel lado, que se for impar vai para um personagem e se for par vai para outro, sempre somando si mesma com um ao final de cada rodada\n"
                + "Para perder a vida de um personagem tem que ficar menor ou igual a 0\n"
                + "Ao digitar um comando não existente, você simplesmente perde sua vez, diferente de outros jogos (decidi por não usar o continue no default do switch)");
    }

    public void fim() {
        JOptionPane.showMessageDialog(null, "FIM");
    }
}
