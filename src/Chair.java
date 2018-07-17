public interface Chair {

  void getOut();

  void sitOn();
}

class VictorianChair implements Chair {

  private final String FURNITURE = "VictorianChair";
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

class ModernChair implements Chair {

  private final String FURNITURE = "ModernChair";
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

class ArtDecoChair implements Chair {

  private final String FURNITURE = "ArtDecoChair";
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
