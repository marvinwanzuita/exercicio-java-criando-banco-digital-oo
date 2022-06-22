package JavaDIO.BancoDigital_OO;

public class Main {
  public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
    cliente1.setNomeCliente("Marvin");

    Conta cliente1cc = new ContaCorrente(cliente1);
    Conta cliente1cp = new ContaPoupanca(cliente1);

    cliente1cc.depositar(100);
    cliente1cc.tranferir(100, cliente1cp);

    System.out.println();
    cliente1cc.imprimirInfosComuns();
    System.out.println();
    cliente1cp.imprimirInfosComuns();
  }
}
