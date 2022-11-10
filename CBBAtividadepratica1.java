//package banco;
public abstract class Conta {
    private int numero;
    private String nome_Titular;
    protected double saldo;

  public abstract boolean sacar(double valor);
  }
