package pattern.proxy;

public class ReceivableImpl implements Receivable {

  @Override
  public void receive(String data) {
    System.out.println("Receive data: " + data);
  }
}
