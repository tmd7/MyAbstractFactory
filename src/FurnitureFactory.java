public interface FurnitureFactory {

  Chair createChair();

  Sofa createSofa();

  CoffeeTable createCoffeeTable();
}

class VictorianFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new VictorianCoffeeTable();
  }
}

class ModernFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public Sofa createSofa() {
    return new ModernSofa();
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new ModernCoffeeTable();
  }
}

class ArtDecoFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new ArtDecoChair();
  }

  @Override
  public Sofa createSofa() {
    return new ArtDecoSofa();
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new ArtDecoCoffeeTable();
  }
}