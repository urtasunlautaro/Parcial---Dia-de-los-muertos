package DiaDeLosMuertos;

import java.io.IOException;
import java.util.*;
import java.io.Writer;
import java.io.FileWriter;

public class Legion {
    private Ninio lider;
    private List<Ninio> miembrosDeLegion;
    private Map<Adulto, Boolean> registroDeSustos = new HashMap<>();

    Legion(List<Ninio> miembros) {
        miembrosDeLegion = miembros;
        lider = elegirLider();
    }

    private Ninio elegirLider() {
        this.lider = maximoAsustador();
        return lider;
    }

    private Ninio maximoAsustador() {
        return Collections.max(miembrosDeLegion, Comparator.comparing(Ninio::capacidadDeSusto));
    }

    public int capacidadDeSusto() {
        return miembrosDeLegion .stream()
                                .mapToInt(Ninio::capacidadDeSusto)
                                .sum();
    }

    void intentarAsustar(Adulto adulto) {
        if (adulto.recibirSusto(capacidadDeSusto()) == 0) {
            System.out.println("El adulto no se asustó");
            registrarSusto(adulto, false);
        } else {
            lider.recibirCaramelos(adulto.recibirSusto(capacidadDeSusto()));
            registrarSusto(adulto, true);
        }
    }

    private void registrarSusto(Adulto adulto, Boolean fueAsustado) {
        registroDeSustos.put(adulto, fueAsustado);
    }

    public int sustosTotalesDados() {
        return registroDeSustos.size();
    }

    public Map<Adulto, Boolean> getRegistroDeSustos() {
        return registroDeSustos;
    }

    public Ninio getLider() {
        return lider;
    }

    void reportar() throws IOException {
        Writer wr = new FileWriter("reporte.txt", true);
        try {
            for(Ninio miembro : miembrosDeLegion) {
                wr.append("Nombre: " + miembro.getNombre() +
                          ", Poder de susto: " + miembro.getPoderDeSusto() + "\n");
            }
        }catch(IOException e) {
                e.printStackTrace();
        }
    }


}
