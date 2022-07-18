package pattern.proxy;

public class Main {

  public static void main(String[] args) {

    final Receivable receivable = new ReceivableProxy();
    receivable.receive("new Data");
  }
}
