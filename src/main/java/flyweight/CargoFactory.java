package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CargoFactory {

    private static Map<String, Cargo> cargos = new HashMap<>();

    public static Cargo getCargo(String titulo, String departamento) {
        Cargo cargo = cargos.get(titulo);
        if (cargo == null) {
            cargo = new Cargo(titulo, departamento);
            cargos.put(titulo, cargo);
        }
        return cargo;
    }

    public static int getTotalCargos() {
        return cargos.size();
    }
}