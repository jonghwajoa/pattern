package pattern.proxy;

public class ReceivableProxy implements Receivable {

  private Receivable impl;

  public ReceivableProxy() {
    this.impl = new ReceivableImpl();
  }

  @Override
  public void receive(String data) {
    System.out.println("Call Receivable Proxy");
    if (impl != null) {
      impl.receive(data);
    }

    System.out.println("End Receivable Proxy");
  }
}
