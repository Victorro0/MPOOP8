public class Flauta extends InstrumentoViento{
  //podemos sogbreescribir y agregar algún método y agregar funcionalidad

  public Flauta(){}

  public void limpiar(){
    System.out.println("Limpiando la flauta");
  }

  @Override
  public String tipoInstrumento(){
    return "Flauta";
  }
  
  @Override 
  public String toString(){
    return "Flauta{}";
  }
}