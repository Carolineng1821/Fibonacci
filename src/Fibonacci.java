import java.util.List;
import java.util.ArrayList;

public class Fibonacci {

    public List<Long> generarLimite(long limite){
        List<Long> lista = new ArrayList<>();
        long anterior = 0;
        long actual = 1;
        long siguiente;

        if (limite == 1) {
            lista.add(anterior);
        }
        else if (limite >= 2) {
            lista.add(anterior);
            lista.add(actual);
            for (int i = 3; i <= limite; i++) {
                siguiente = anterior + actual;
                lista.add(siguiente);
                anterior = actual;
                actual = siguiente;
            }
        }
        return lista;
    }

}
