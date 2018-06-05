package Client;

public class Jugador {

    private String nombre;
    private Raza raza;

    public Jugador(String nombre, Nombre raza){

        this.nombre=nombre;
        this.raza=new Raza(raza);
    }

}
