public abstract class PoligonoA{
  //metodos abstractos
  public abstract double area();//no es necesario darles funcionalidad
  public abstract double perimetro();

  //metodos concretos
  @Override
  public String toString(){
    return "PoligonoA{}";
  }
}