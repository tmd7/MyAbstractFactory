public interface Sofa {

  void getOut();

  void sitOn();
}

class VictorianSofa implements Sofa {

  private final String FURNITURE = "VictorianSofa";
  private final String GET_OUT = "get out";
  private final String SIT_ON = "sit on";

  @Override
  public void getOut() {
    printAction(GET_OUT);
  }

  @Override
  public void sitOn() {
    printAction(SIT_ON);
  }

  private void printAction(String action) {
    System.out.println(action + " " + FURNITURE);
  }
}

class ModernSofa implements Sofa {

  private final String FURNITURE = "ModernSofa";
  private final String GET_OUT = "get out";
  private final String SIT_ON = "sit on";

  @Override
  public void getOut() {
    printAction(GET_OUT);
  }

  @Override
  public void sitOn() {
    printAction(SIT_ON);
  }

  private void printAction(String action) {
    System.out.println(action + " " + FURNITURE);
  }
}

class ArtDecoSofa implements Sofa {

  private final String FURNITURE = "ArtDecoSofa";
  private final String GET_OUT = "get out";
  private final String SIT_ON = "sit on";

  @Override
  public void getOut() {
    printAction(GET_OUT);
  }

  @Override
  public void sitOn() {
    printAction(SIT_ON);
  }

  private void printAction(String action) {
    System.out.println(action + " " + FURNITURE);
  }
}