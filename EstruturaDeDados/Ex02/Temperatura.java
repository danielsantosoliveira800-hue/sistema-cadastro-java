package EstruturaDeDados.Ex02;
import java.util.List;

public class Temperatura {

    public void apresentar(List<Double> temps){
        for (int i = 0; i < temps.size(); i++) {
            System.out.println(temps.get(i));
        }

        double maior = temps.get(0);
        for (Double t : temps){
            if (t > maior){
                maior = t;
            }
        }
        System.out.println("A maior temperatura é: C°"+maior);

        double menor = temps.get(0);
        for (double t: temps){
            if (t < menor){
                menor = t;
            }
        }

        double total = 0;
        for (double t: temps){
            total += t;
        }

        double media = total / temps.size();
        System.out.println("A media de temperatura é: C°");
    }
}
