package com.cursoJava.ejercicioServicios.services;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmpleadoServiceTest {

    EmpleadoService empleadoService = new EmpleadoService();

    @Test
    public void esContratadoIngeniero1() {
        boolean actual = empleadoService.esContratado(30,5,"ingeniero");
        Assert.assertTrue(actual);
    }
    @Test
    public void esContratadoAdministrativo1() {
        boolean actual = empleadoService.esContratado(30,9,"administrativo");
        Assert.assertTrue(actual);
    }
    @Test
    public void esContratadoAdministrativo2() {
        boolean actual = empleadoService.esContratado(30,8,"administrativo");
        Assert.assertFalse(actual);
    }
    @Test
    public void esContratadoAdministrativo3() {
        boolean actual = empleadoService.esContratado(20,12,"administrativo");
        Assert.assertTrue(actual);
    }
    @Test
    public void esContratadoDesarrollador1() {
        boolean actual = empleadoService.esContratado(22,2,"desarrollador");
        Assert.assertFalse(actual);
    }
    @Test
    public void esContratadoDesarrollador2() {
        boolean actual = empleadoService.esContratado(30,5,"desarrollador");
        Assert.assertTrue(actual);
    }

    @Test
    public void salarioIngeniero1() {
        float actual = empleadoService.salario(30,10,"ingeniero");
        Assert.assertEquals(40000,actual,0);
    }

    @Test
    public void salarioDesarrollador1() {
        float actual = empleadoService.salario(30,12,"desarrollador");
        Assert.assertEquals(33000,actual,0);
    }

    @Test
    public void telefonoValido1() {
        boolean actual = empleadoService.telefonoValido("11","61323787");
        Assert.assertTrue(actual);
    }
    @Test
    public void telefonoValido2() {
        boolean actual = empleadoService.telefonoValido("1234","5555");
        Assert.assertFalse(actual);
    }
    @Test
    public void telefonoValido3() {
        boolean actual = empleadoService.telefonoValido("1234","567899");
        Assert.assertTrue(actual);
    }
    @Test
    public void telefonoValido4() {
        boolean actual = empleadoService.telefonoValido("11","1522335566");
        Assert.assertTrue(actual);
    }

}