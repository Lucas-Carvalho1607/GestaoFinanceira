package Classes;

import Enum.Tipo;

public class Estoque extends Produtos{
    
    int quantidade;


    public Estoque(String nome, Tipo tipo, int quantidade) {
        super(nome, tipo, quantidade);
    }
    
}

