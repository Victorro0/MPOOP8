public class InstrumentoViento implements InstrumentoMusical{
  //Por defecto todos los metodos de la interfaz son publicos x lo tanto asi deben ser implementados
  public InstrumentoViento(){}

  @Override
  public void tocar(){
    System.out.println("Tocando instrumento de viento");
  }

  @Override
  public void afinar(){
    System.out.println("Afinando instrumento de viento");
  }

  @Override
  public String tipoInstrumento(){
    return "Instrumento de viento";
  }

  @Override
  public String toString(){
    return "InstrumentoViento{}";
  }
}