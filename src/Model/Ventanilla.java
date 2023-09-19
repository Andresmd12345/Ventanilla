package Model;

public class Ventanilla {
    private String nombre;
    private int horarioInicio;
    private int horarioFin;
    private String direccion;
    private Empleados empleado1;
    private Empleados empleado2;
    private Empleados empleado3;
    private Empleados empleado4;

    private Licores licor1;
    private Licores licor2;
    private Licores licor3;
    private Licores licor4;
    private Licores licor5;
    private Licores licor6;

    Licores licores = new Licores();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public int getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(int horarioFin) {
        this.horarioFin = horarioFin;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleados getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleados empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleados getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleados empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleados getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleados empleado3) {
        this.empleado3 = empleado3;
    }

    public Empleados getEmpleado4() {
        return empleado4;
    }

    public void setEmpleado4(Empleados empleado4) {
        this.empleado4 = empleado4;
    }

    public Licores getLicor1() {
        return licor1;
    }

    public void setLicor1(Licores licor1) {
        this.licor1 = licor1;
    }

    public Licores getLicor2() {
        return licor2;
    }

    public void setLicor2(Licores licor2) {
        this.licor2 = licor2;
    }

    public Licores getLicor3() {
        return licor3;
    }

    public void setLicor3(Licores licor3) {
        this.licor3 = licor3;
    }

    public Licores getLicor4() {
        return licor4;
    }

    public void setLicor4(Licores licor4) {
        this.licor4 = licor4;
    }

    public Licores getLicor5() {
        return licor5;
    }

    public void setLicor5(Licores licor5) {
        this.licor5 = licor5;
    }

    public Licores getLicor6() {
        return licor6;
    }

    public void setLicor6(Licores licor6) {
        this.licor6 = licor6;
    }

    public Ventanilla() {
    }

    public Ventanilla(String nombre, int horarioInicio, int horarioFin, String direccion) {
        this.nombre = nombre;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.direccion = direccion;
    }


    public String obtenerInformacionVentanilla() {
        return "Ventanilla{" +
                "nombre='" + nombre + '\'' +
                ", horarioInicio=" + horarioInicio +
                ", horarioFin=" + horarioFin +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void mostrarInformacionEmpleados() {
        String informacionEmpleado1 = getEmpleado1().obtenerInformacionEmpleados();
        String informacionEmpleado2 = getEmpleado2().obtenerInformacionEmpleados();
        String informacionEmpleado3 = getEmpleado3().obtenerInformacionEmpleados();
        String informacionEmpleado4 = getEmpleado4().obtenerInformacionEmpleados();
        System.out.println("La Informacion Del Empleado 1:  " + informacionEmpleado1);
        System.out.println("La Informacion Del Empleado 2:  " + informacionEmpleado2);
        System.out.println("La Informacion Del Empleado 3:  " + informacionEmpleado3);
        System.out.println("La Informacion Del Empleado 4:  " + informacionEmpleado4);

    }

    public void mostrarInformacionLicores() {
        String informacionLicor1 = getLicor1().obtenerInformacionLicores();
        String informacionLicor2 = getLicor2().obtenerInformacionLicores();
        String informacionLicor3 = getLicor3().obtenerInformacionLicores();
        String informacionLicor4 = getLicor4().obtenerInformacionLicores();
        String informacionLicor5 = getLicor5().obtenerInformacionLicores();
        String informacionLicor6 = getLicor6().obtenerInformacionLicores();
        System.out.println("La informacion Del Licor 1:  " + informacionLicor1);
        System.out.println("La informacion Del Licor 2:  " + informacionLicor2);
        System.out.println("La informacion Del Licor 3:  " + informacionLicor3);
        System.out.println("La informacion Del Licor 4:  " + informacionLicor4);
        System.out.println("La informacion Del Licor 5:  " + informacionLicor5);
        System.out.println("La informacion Del Licor 6:  " + informacionLicor6);
    }

    public void mostrarInformacionVentanilla() {
        String informacionVentanilla = obtenerInformacionVentanilla();
        System.out.println("la informacion de la Ventanilla es: " + informacionVentanilla);
    }

    public int obtenerEdadPromedio() {
        Empleados empleados = new Empleados();
        int edadPromedio = empleados.calcularEdadPromedio(getEmpleado1().getEdad(), getEmpleado2().getEdad(),
                getEmpleado3().getEdad(), getEmpleado4().getEdad());
        return edadPromedio;

    }
    public void mostrarEdadPromedio(){
        System.out.println("la edades promedio de los empleados son: "+obtenerEdadPromedio());
    }
    public double obtenerPreciosPromedio(){
        double preciosPromedio = licores.calcularPromedioPrecios(getLicor1().getPrecioBase(),getLicor2().getPrecioBase(),
                getLicor3().getPrecioBase(),getLicor4().getPrecioBase(),getLicor5().getPrecioBase(),getLicor6().getPrecioBase());
        return preciosPromedio;
    }
    public void mostrarPromedioPrecios(){
        System.out.println("El Promedio Del Precios De los Licores es: "+obtenerPreciosPromedio() );
    }
    public double obtenerPrecioMayor (double [] preciosBase){
        double precioMayor = licores.calcularPrecioMayor(preciosBase);
        return  precioMayor;
    }
    public void mostrarPrecioMayor (double preciosMayor){
        System.out.println("El precio Del licor con mas valor de la ventanilla es: "+preciosMayor);
    }
    public double obtenerPrecioMenor(double [] preciosBase){
        double precioMenor = licores.calcularPrecioMenor(preciosBase);
        return precioMenor;
    }
    public void mostrarPrecioMenor (double preciosMenor){
        System.out.println("El precio Del licor con menos valor de la ventanilla es: "+preciosMenor);
    }
    public int obtenerPorcentajeMayor(int [] porcentajeAlcohol){
        int porcentajeMayor =licores.calcularPorcentajeMayor(porcentajeAlcohol);
        return porcentajeMayor;
    }
    public void mostrarPorcentajeMayor(int porcentajeMayor){
        System.out.println("El porcentaje mas alto de alcohol entre los licores es: "+porcentajeMayor);
    }
    public int obtenerPorcentajeMenor(int [] porcentajeAlcohol){
        int porcentajeMenor = licores.calcularPorcentajeMenor(porcentajeAlcohol);
        return porcentajeMenor;
    }
    public void mostrarPorcentajeMenor(int porcentajeMenor){
        System.out.println("El porcentaje menor de alcohol entre los licores es: "+porcentajeMenor);
    }
}

