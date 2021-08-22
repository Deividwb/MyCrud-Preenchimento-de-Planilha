package br.com.dwb.model;

public enum CiudadCopia {
    AVARE("Avare"),
    AMPARO("Amparo"),
    COSMOPOLIS("Cosmopolis"),
    PAULINIA("Paulinia"),
    NOVA_ODESSA("Nova Odessa");

    public String allCiudad;

    CiudadCopia(String allCiudad){
        this.allCiudad = allCiudad;
    }

    public String getAllCiudad() {
        return allCiudad;
    }

    public void setAllCiudad(String allCiudad) {
        this.allCiudad = allCiudad;
    }
    public static CiudadCopia todasCiudades(){
        for (CiudadCopia ciudad : CiudadCopia.values()) {

            //System.out.println(Ciudad.values());
            //System.out.println(ciudad.getAllCiudad());
         return ciudad;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "allCiudad='" + allCiudad + '\'' +
                '}';
    }
}
