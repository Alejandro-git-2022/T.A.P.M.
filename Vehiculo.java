public class Vehiculo {
   public void encender() {
      System.out.println("El vehículo está encendido.");
   }

   public void apagar() {
      System.out.println("El vehículo está apagado.");
   }
   
   public static void main(String[] args) {
      Vehiculo vehiculo = new Vehiculo();
      vehiculo.encender();
      vehiculo.apagar();
   }
}
