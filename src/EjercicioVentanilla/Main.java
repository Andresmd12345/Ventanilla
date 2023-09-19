package EjercicioVentanilla;

import Model.Empleados;
import Model.Ventanilla;
import Model.Licores;
import Enum.TiposLicor;
import Enum.TiposDeCargo;

public class Main {
    public static void main(String[] args) {
        Ventanilla ventanilla = new Ventanilla();
        ventanilla = inicializaDatosPrueba();

        ventanilla.mostrarInformacionVentanilla();
        ventanilla.mostrarInformacionEmpleados();
        ventanilla.mostrarInformacionLicores();
        ventanilla.mostrarEdadPromedio();
        ventanilla.mostrarPromedioPrecios();

        double [] preciosBase = {ventanilla.getLicor1().getPrecioBase(),ventanilla.getLicor2().getPrecioBase(),
        ventanilla.getLicor3().getPrecioBase(),ventanilla.getLicor4().getPrecioBase(),ventanilla.getLicor5().getPrecioBase(),
        ventanilla.getLicor6().getPrecioBase()};

        double precioMayor = ventanilla.obtenerPrecioMayor(preciosBase);
        ventanilla.mostrarPrecioMayor(precioMayor);

        double precioMenor = ventanilla.obtenerPrecioMenor(preciosBase);
        ventanilla.mostrarPrecioMenor(precioMenor);

        int [] porcentajesAlcohol ={ventanilla.getLicor1().getPorcentajeAlcohol(),ventanilla.getLicor2().getPorcentajeAlcohol(),
                ventanilla.getLicor3().getPorcentajeAlcohol(),ventanilla.getLicor4().getPorcentajeAlcohol(),
                ventanilla.getLicor5().getPorcentajeAlcohol(),ventanilla.getLicor6().getPorcentajeAlcohol()};

        int porcentajeMayor = ventanilla.obtenerPorcentajeMayor(porcentajesAlcohol);
        ventanilla.mostrarPorcentajeMayor(porcentajeMayor);

        int porcentajeMenor = ventanilla.obtenerPorcentajeMenor(porcentajesAlcohol);
        ventanilla.mostrarPrecioMenor(porcentajeMenor);

    }


    private static Ventanilla inicializaDatosPrueba() {

        Empleados empleado1 = crearEmpleadoPorConstructor(
                "Camila",
                "Moreno",
                25,
                1094952,
                TiposDeCargo.CAJERA
        );
        Empleados empleado2 = crearEmpleadoPorConstructor(
                "Andres",
                "Murillo",
                23,
                1094232,
                TiposDeCargo.CAJERO
        );
        Empleados empleado3 = crearEmpleadoPorConstructor(
                "Maria",
                "Duran",
                22,
                1094023,
                TiposDeCargo.DISTRIBUIDOR
        );
        Empleados empleado4 = crearEmpleadoPorConstructor(
                "Juan",
                "Morales",
                26,
                10945232,
                TiposDeCargo.VENDEDOR
        );
        Licores licor1 = crearLicoresPorConstructor(
                "corona",
                30,
                1932,
                TiposLicor.CERVEZA,
                23.000
        );

        Licores licor2 =crearLicoresPorConstructor(
                "caldas 50",
                70,
                20322,
                TiposLicor.RON,
                80.000
        );
        Licores licor3 =crearLicoresPorConstructor(
                "Antioqueno",
                89,
                23202,
                TiposLicor.AGUARDIENTE,
                120.000
        );
        Licores licor4 =crearLicoresPorConstructor(
                "Smirnoff",
                65,
                23244,
                TiposLicor.VOBKA,
                78.000
        );
        Licores licor5 =crearLicoresPorConstructor(
                "Olmeca",
                98,
                23242,
                TiposLicor.TEQUILA,
                145.000
        );
        Licores licor6 =crearLicoresPorConstructor(
                "Mojito",
                20,
                39322,
                TiposLicor.COPTEL,
                24.000
        );

        Ventanilla ventanilla = new Ventanilla(
                "Elcalvo",
                4,
                12,
                "carrera 44"
                );

        ventanilla.setEmpleado1(empleado1);
        ventanilla.setEmpleado2(empleado2);
        ventanilla.setEmpleado3(empleado3);
        ventanilla.setEmpleado4(empleado4);
        ventanilla.setLicor1(licor1);
        ventanilla.setLicor2(licor2);
        ventanilla.setLicor3(licor3);
        ventanilla.setLicor4(licor4);
        ventanilla.setLicor5(licor5);
        ventanilla.setLicor6(licor6);

        return ventanilla;
    }

    private static Empleados crearEmpleadoPorConstructor(String nombre, String apellido, int edad, int numeroIdentificacion
            , TiposDeCargo tipoEmpleado) {
        Empleados empleados = new Empleados(nombre, apellido, edad, numeroIdentificacion, tipoEmpleado);
        return empleados;
    }
    private static Licores crearLicoresPorConstructor(String nombre,int porcentajeAlcohol,int codigoSanidad,
                                                      TiposLicor tipoLicor,double precioBase){
        Licores licores = new Licores(nombre,porcentajeAlcohol,codigoSanidad,tipoLicor,precioBase);
        return  licores;
    }

}

