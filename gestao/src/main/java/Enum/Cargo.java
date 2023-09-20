package Enum;

public enum Cargo {
    GERENTE(8000.00), SUPERVISOR(4000.00), ATENDENTE(1350.00);

    private double salario;
    
    private Cargo(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }



    
}
