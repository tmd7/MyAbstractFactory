public class App {

  public static void main(String[] args) {
    System.out.println("What furniture do you want to sit on?");
    sitOn(3);
  }

  private static void sitOn(int i) {
    FurnitureFactory factory;
    Chair c;
    Sofa s;
    CoffeeTable ct;

    switch (i) {
      case 1:
        factory = new ModernFurnitureFactory();
        c = factory.createChair();
        c.sitOn();
        break;

      case 2:
        factory = new VictorianFurnitureFactory();
        s = factory.createSofa();
        s.sitOn();
        break;

      case 3:
        factory = new ArtDecoFurnitureFactory();
        ct = factory.createCoffeeTable();
        ct.sitOn();
        break;

      default:
        System.out.println("We don't have any furniture");
    }
  }
}