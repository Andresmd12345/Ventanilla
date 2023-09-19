package Model;
import Enum.TiposDeCargo;

public class Empleados {
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroIdentificacion;
    private TiposDeCargo tipoEmpleado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public TiposDeCargo getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TiposDeCargo tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, int edad, int numeroIdentificacion, TiposDeCargo tipoEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoEmpleado = tipoEmpleado;
    }


    public String obtenerInformacionEmpleados() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", numeroIdentificacion=" + numeroIdentificacion +
                ", tipoEmpleado='" + tipoEmpleado + '\'' +
                '}';
    }
    public int calcularEdadPromedio(int edad1 , int edad2 , int edad3,int edad4){
        int promedioedades = 0;
        promedioedades = (edad1 + edad2 + edad3 + edad4) / 4;
                return promedioedades;
    }
}
