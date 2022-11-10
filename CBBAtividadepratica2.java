public class ContaEspecial extends Conta {
  private double limite;
@Override
  public boolean sacar(double valor) {
    if (valor <=this.limite = this.saldo){
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }
}
