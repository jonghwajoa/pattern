package pattern.facade;

public class Facade {

  private SampleOne sampleOne;
  private SampleTwo sampleTwo;
  private SampleThree sampleThree;

  public Facade() {
    this.sampleOne = new SampleOne();
    this.sampleTwo = new SampleTwo();
    this.sampleThree = new SampleThree();
  }

  public void getup() {

    sampleThree.walk();
    sampleOne.go();
    sampleTwo.work();

  }

}
