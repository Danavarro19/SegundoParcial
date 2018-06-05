package Client;

public class Raza {

    private Nombre nombre;
    private int razaResistencia;
    private int razaFuerza;
    private int razaVelocidad;

    public Raza(Nombre nombre){

        switch (nombre){

            case RAZA1:
                this.razaFuerza=1;
                this.razaResistencia=1;
                this.razaVelocidad=1;
                break;
            case RAZA2:
                this.razaFuerza=2;
                this.razaResistencia=2;
                this.razaVelocidad=2;
                break;
            case RAZA3:
                this.razaFuerza=3;
                this.razaResistencia=3;
                this.razaVelocidad=3;
                break;
            default:
                break;
        }
    }
}
