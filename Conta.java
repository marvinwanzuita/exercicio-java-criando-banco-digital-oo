package JavaDIO.BancoDigital_OO;

public abstract class Conta implements IConta{

  protected static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;
  protected int agencia;
  protected int numeroCC;
  protected double saldoCC;

  protected Cliente cliente;

  public Conta(Cliente cliente){
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numeroCC = SEQUENCIAL++;
    this.cliente = cliente;

  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumeroCC() {
    return numeroCC;
  }

  public double getSaldoCC() {
    return saldoCC;
  }

  @Override
  public void sacar(double valor) {
    this.saldoCC -= valor;
  }

  @Override
  public void depositar(double valor) {
    this.saldoCC += valor;
  }

  @Override
  public void tranferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  protected void imprimirInfosComuns(){
    System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numeroCC));
    System.out.println(String.format("Saldo: %.2f", this.saldoCC));
  }
}
