package EstruturaDeDados.Ex01;

public class Tempertura {

    public void apresentar1(double[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println("C°"+temp[i]+", ");
        }

        double maior = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > maior){
                maior = temp[i];
            }
        }
        System.out.println("Maior temperatura: C°"+ maior);

        double menor = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == 0 || temp[i] < menor){
                menor = temp[i];
            }
        }
        System.out.println("Menor temperatura: C°"+ menor);

        double total = 0;
        for (int i = 0; i < temp.length; i++) {
            total += temp[i];
        }

        double media = total / temp.length;
        System.out.println("A média de temperatura é: C°"+media);
    }
}
