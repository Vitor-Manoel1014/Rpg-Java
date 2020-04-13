package rpg;

import javax.swing.JOptionPane;

public class Personagem {

    //Atributos
    protected String nome;
    protected String tipo;
    protected String provocacao;
    protected String arma;
    protected int energia;
    protected int energiaMax;
    protected int ataque;
    protected int defesa;
    protected int defesaExtra;
    protected int vida;
    protected int vidaS;
    protected int poderDeRegeneracao;
    protected int velocidade;
    protected int velocidadeExtra;

    public Personagem(String nome, String tipo, String provocacao, String arma, int energiaMax, int ataque, int defesa, int vida, int poderDeRegeneracao, int velocidade) {//Construtor
        this.nome = nome;
        this.tipo = tipo;
        this.provocacao = provocacao;
        this.arma = arma;
        this.energia = this.energiaMax;
        this.energiaMax = energiaMax;
        this.ataque = ataque;
        this.defesa = defesa;
        this.defesaExtra = 0;
        this.vida = vida;
        this.vidaS = this.vida;
        this.poderDeRegeneracao = poderDeRegeneracao;
        this.velocidade = velocidade;
        this.velocidadeExtra = 0;
    }

    //Metodos personalizados
    public void provocar() {
        JOptionPane.showMessageDialog(null, getNome() + " o " + getTipo() + " " + getProvocacao());
    }

    public void atacar(Personagem inimigo) {
        double numAle = 1 + Math.random() * (100 - 1);
        if (numAle > (inimigo.getVelocidade() + inimigo.getVelocidadeExtra())) {
            if (getEnergia() >= 4) {
                setEnergia(getEnergia() - 4);
                int dano = getAtaque() - (inimigo.getDefesa() + inimigo.getDefesaExtra());
                if (dano > 0) {
                    inimigo.setVida(inimigo.getVida() - dano);
                    JOptionPane.showMessageDialog(null, getNome() + " tirou " + dano + " de vida de seu adversário com sua " + getArma());
                } else {
                    JOptionPane.showMessageDialog(null, getNome() + " não tirou dano do inimigo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem energia pra isso");
            }
        } else {
            if (getEnergia() >= 4) {
                setEnergia(getEnergia() - 4);
                JOptionPane.showMessageDialog(null, inimigo.getTipo() + " se esquivou de seu ataque");
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem energia pra isso");
            }
        }
    }

    public void defender() {
        if (getEnergia() >= 2) {
            setEnergia(getEnergia() - 2);
            setDefesaExtra(getDefesaExtra() + getDefesa());
            JOptionPane.showMessageDialog(null, "Você aumentou sua defesa para " + (getDefesa() + getDefesaExtra()));
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem energia pra isso");
        }
    }

    public void regenerar() {
        setEnergia(getEnergia() + 1);
        if (getEnergia() > getEnergiaMax()) {
            setEnergia(getEnergiaMax());
        }
        setVida(getVida() + getPoderDeRegeneracao());
        JOptionPane.showMessageDialog(null, getTipo() + " regenerou " + getPoderDeRegeneracao() + " de vida");
    }

    public void energiaPosRodada() {
        setEnergia(getEnergia() + 2);
        if (getEnergia() > getEnergiaMax()) {
            setEnergia(getEnergiaMax());
        }
    }

    public void esquivar() {
        if (getEnergia() >= 1) {
            setEnergia(getEnergia() - 1);
            setVelocidadeExtra(getVelocidadeExtra() + getVelocidade());
            while ((getVelocidade() + getVelocidadeExtra()) > 90) {
                setVelocidadeExtra(getVelocidadeExtra() - 1);
            }
            JOptionPane.showMessageDialog(null, "Você aumentou sua velocidade para " + (getVelocidade() + getVelocidadeExtra()));
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem energia pra isso");
        }
    }

    //Metodos acessores e mutantes
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

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesaExtra() {
        return defesaExtra;
    }

    public void setDefesaExtra(int defesaExtra) {
        this.defesaExtra = defesaExtra;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoderDeRegeneracao() {
        return poderDeRegeneracao;
    }

    public void setPoderDeRegeneracao(int poderDeRegeneracao) {
        this.poderDeRegeneracao = poderDeRegeneracao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getEnergiaMax() {
        return energiaMax;
    }

    public void setEnergiaMax(int energiaMax) {
        this.energiaMax = energiaMax;
    }

    public int getVelocidadeExtra() {
        return velocidadeExtra;
    }

    public void setVelocidadeExtra(int velocidadeExtra) {
        this.velocidadeExtra = velocidadeExtra;
    }

    public int getVidaS() {
        return vidaS;
    }

    public void setVidaS(int vidaS) {
        this.vidaS = vidaS;
    }

    public String getProvocacao() {
        return provocacao;
    }

    public void setProvocacao(String provocacao) {
        this.provocacao = provocacao;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

}
