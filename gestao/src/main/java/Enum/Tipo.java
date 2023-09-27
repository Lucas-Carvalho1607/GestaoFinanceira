package Enum;

public enum Tipo {
    COXINHA(5.00), ENROLADINHO_QUEIJO_PRESUNTO(5.00), CROQUETE(5.00), CARNE_OVO(5.00),BRIOCHE(7.00),
    RISSOLE(5.00), KIBE(5.00), BOLINHA_QUEIJO(5.00), PASTEL(5.00), CIGARRETE(7.00), HAMBURGER(7.00);

    
   private double valor;

public double getValor(double valor) {
    return valor;
}

private Tipo(double valor) {
    this.valor = valor;
}



}
