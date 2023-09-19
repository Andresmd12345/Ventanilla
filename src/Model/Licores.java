package Model;
import Enum.TiposLicor;

public class Licores {
    private String nombre;
    private int porcentajeAlcohol;
    private int codigoSanidad;
    private TiposLicor tipoLicor;
    private double precioBase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(int porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public int getCodigoSanidad() {
        return codigoSanidad;
    }

    public void setCodigoSanidad(int codigoSanidad) {
        this.codigoSanidad = codigoSanidad;
    }

    public TiposLicor getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(TiposLicor tipoLicor) {
        this.tipoLicor = tipoLicor;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Licores() {
    }

    public Licores(String nombre, int porcentajeAlcohol, int codigoSanidad, TiposLicor tipoLicor, double precioBase) {
        this.nombre = nombre;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.codigoSanidad = codigoSanidad;
        this.tipoLicor = tipoLicor;
        this.precioBase = precioBase;
    }


    public String obtenerInformacionLicores() {
        return "Licores{" +
                "nombre='" + nombre + '\'' +
                ", porcentajeAlcohol=" + porcentajeAlcohol +
                ", codigoSanidad=" + codigoSanidad +
                ", tipoLicor='" + tipoLicor + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }

    public double calcularPromedioPrecios(double precio1, double precio2, double precio3, double precio4, double precio5,
                                          double precio6) {
        double promedioPrecios = 0;
        promedioPrecios = (precio1 + precio2 + precio3 + precio4 + precio5 + precio6) / 6;
        return promedioPrecios;
    }

    public double calcularPrecioMayor(double[] preciosBase) {
        double precioMayor = 0;
        for (int i = 1; i < preciosBase.length; i++) {
            if (preciosBase[i] > precioMayor) {
                precioMayor = preciosBase[i];
            }
        }
        return precioMayor;

    }
    public double calcularPrecioMenor(double[] preciosBase) {
        double precioMenor = 200.000;
        for (int i = 1; i < preciosBase.length; i++) {
            if (preciosBase[i] < precioMenor) {
                precioMenor = preciosBase[i];
            }
        }
        return precioMenor;

    }
    public int calcularPorcentajeMayor(int[] porcentajeAlcohol){
        int porcentajeMayor = 0;
        for (int i =1; i < porcentajeAlcohol.length; i++){
            if (porcentajeAlcohol[i] > porcentajeMayor){
                porcentajeMayor = porcentajeAlcohol[i];
            }
        }
        return porcentajeMayor;
    }
    public int calcularPorcentajeMenor(int[] porcentajeAlcohol){
        int porcentajeMenor = 100;
        for (int i =1; i < porcentajeAlcohol.length; i++){
            if (porcentajeAlcohol[i] < porcentajeMenor){
                porcentajeMenor = porcentajeAlcohol[i];
            }
        }
        return porcentajeMenor;
    }
}
