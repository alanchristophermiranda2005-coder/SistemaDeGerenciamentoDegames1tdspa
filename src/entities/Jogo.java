package entities;

public class Jogo extends Conteudo {
    public String plataforma; // campos com apenas atribuição eles sao public
    private double mediaAvaliacoes = calcularAvaliacoes(); // campos calculados sao privados

  public double calcularAvaliacoes() {
      if(avaliacoes.isEmpty()) return 0;
      int soma = 0;  // <-- esse classifica a soma += logo abaixo
              for(var avaliacao : avaliacoes)
                  soma += avaliacao.nota;

              return (double) soma / avaliacoes.size();
    }

    public void recalcularMediaAvaliacoes(){
      mediaAvaliacoes = calcularAvaliacoes();
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "plataforma='" + plataforma + '\'' +
                ", nome='" + nome + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", nota=" + calcularAvaliacoes()+
                '}';
    }
}

