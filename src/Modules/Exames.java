package Modules;

import java.util.HashMap;
import java.util.Map;

public class Exames {
    private final Map<String, Double> mapClienteComPlano = new HashMap<>();
    private final Map<String, Double> mapClienteSemPlano = new HashMap<>();

    public Double getExameComPlano(String nomeExame) {
        return mapClienteComPlano.get(nomeExame);
    }

    public Double getExameSemPlano(String nomeExame) {
        return mapClienteSemPlano.get(nomeExame);
    }

    public void setExame(String nomeExame, double comPlano, double semPlano) {
        mapClienteComPlano.put(nomeExame, comPlano);
        mapClienteSemPlano.put(nomeExame, semPlano);
    }

    @Override
    public String toString() {
        return "Exames{" +
                "mapClienteComPlano=" + mapClienteComPlano +
                ", mapClienteSemPlano=" + mapClienteSemPlano +
                '}';
    }
}
