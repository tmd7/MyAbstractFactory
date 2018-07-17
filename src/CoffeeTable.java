public interface CoffeeTable {

  void getOut();

  void sitOn();
}

class VictorianCoffeeTable implements CoffeeTable {

  private final String FURNITURE = "VictorianCoffeeTable";
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

class ModernCoffeeTable implements CoffeeTable {

  private final String FURNITURE = "ModernCoffeeTable";
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

class ArtDecoCoffeeTable implements CoffeeTable {

  private final String FURNITURE = "ArtDecoCoffeeTable";
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