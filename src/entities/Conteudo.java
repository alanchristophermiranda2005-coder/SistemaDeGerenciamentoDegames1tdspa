package entities;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Conteudo {
    public String nome;
    public LocalDate dataLancamento;
    public ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

}
