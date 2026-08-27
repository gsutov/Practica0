import java.util.Scanner;

public class Promedio{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del estudiante; ");
        String nombre = se.nextLine();
        
        float[] calificaciones = new float[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            calificaciones[i] = sc.nextFloat();
        }
    }
}