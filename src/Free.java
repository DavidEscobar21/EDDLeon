import java.util.ArrayList;
import java.util.Random;

public class Free {

    static ArrayList<String> Participantes = new ArrayList<>(10);
    static Random random = new Random();


    public static void main(String[] args){

        Participantes.add("Descobar");
        Participantes.add("Daniellk");
        Participantes.add("YayoMc");
        Participantes.add("JJMc");
        Participantes.add("Style");
        Participantes.add("Jal");


        Random(Participantes);

    }

    public static void Random (ArrayList<String> A){

        for (int i = 0; i < A.size(); ) {

            if(A.size() >= 2){
                int Oponente1 = random.nextInt(Math.abs(A.size())-0);
                System.out.print(A.get(Oponente1)+" VS ");
                A.remove(Oponente1);
                int Oponente2 = random.nextInt(Math.abs(A.size())-0);
                System.out.print(A.get(Oponente2));
                A.remove(Oponente2);
            }
            if (A.size() == 1){
                System.out.println(" VS "+A.get(0));
                A.remove(0);
         }

            System.out.println("");

        }


    }


}
