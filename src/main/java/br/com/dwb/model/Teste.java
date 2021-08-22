package br.com.dwb.model;

import br.com.dwb.dao.ConexaoDAO;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        ConexaoDAO dao = new ConexaoDAO();
        Relleno_Planillas relleno_planillas = new Relleno_Planillas();

        relleno_planillas.setNombre("buenoDias");
        relleno_planillas.setTelefono("(19)989629708");
        relleno_planillas.setDireccion("Rua Fortunato,36,PraiaAzul");


        //relleno_planillas.setCiudad(Ciudad.todasCiudades());
//        for (Ciudad ciudad : Ciudad.values()) {
//            relleno_planillas.setCiudad(Ciudad.todasCiudades());
//        }

        //relleno_planillas.setCiudad(Ciudad.COSMOPOLIS);
        relleno_planillas.setCiudad(Ciudad.AVARE);
        relleno_planillas.setStatus("Teste");


        //dao.save(relleno_planillas);
        //System.out.println("Foi inserido o id: " +tabelaInserida.getId());
        //System.out.println(relleno_planillas.getCiudad().getAllCiudad());

        for (Ciudad ciudad : Ciudad.values()) {
            System.out.println(ciudad);
        }
    }
}
