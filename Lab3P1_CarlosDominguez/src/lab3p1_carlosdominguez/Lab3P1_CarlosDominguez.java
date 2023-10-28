
package lab3p1_carlosdominguez;
import java.util.Scanner;
public class Lab3P1_CarlosDominguez {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("***********Menu*************");
        System.out.println("1. Suceciones y mas sucesiones! ");
        System.out.println("2. Pocket Monsters ");
        System.out.println("3. Atersico en Casa! ");
        System.out.println("Ingrese una opcion");
        int opcion = leer.nextInt();
        char resp = 's';
        while (resp == 's' || resp == 'S'){
            switch (opcion){
                case 1 -> {
                    
                    System.out.println("Ingrese la diferencia ");
                    int diferencia = leer.nextInt();
                    System.out.println("Ingrese un numero inicial ");
                    int numinicial = leer.nextInt();
                    System.out.println("Ingrese la cantidad de numero que desea visualizar");
                    int cantnum = leer.nextInt();
                    System.out.println("Diferencia: " + diferencia);
                    System.out.println("Inicial : " +  numinicial);
                    System.out.println("Cantidad : " + cantnum);
                    int contador1 = 0;
                    for (int i = 1; i <= cantnum ; i++){
                        System.out.print("" + numinicial);
                        numinicial = numinicial + diferencia + contador1;
                        contador1 ++;
                        if (i < cantnum){
                            System.out.print(", ");
                        }
                    }
                    System.out.println("");
                    System.out.println("Que numero desea ver mas adelante en la sucesion?");
                    int prediccion = leer.nextInt();
                    for (int j = 1; j <= prediccion-cantnum-1 ; j++){
                        numinicial = numinicial + diferencia + contador1;
                        contador1 ++;
                    }
                    System.out.println("El numero seria : " + numinicial);
                    
                    System.out.println("");
                }// final de case 1
                case 2 -> {
                    
                    System.out.println("Ingrese el modo de pelea pokemon desea: ");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- Por rondas ");
                    int tipop = leer.nextInt();
                    switch (tipop){
                        case 1 -> {
                            System.out.println("Estadisticas de los Pokemones");
                            System.out.println("Sylveon Vida:280 Ataque:80  Defensa 15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa 10%");
                            System.out.println("Giratina Vida:300 Ataque:70 Defensa 25%");
                            System.out.println("Dragonite Vida 250 Ataque:75 Defensa 20%");
                            System.out.println("");
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon vrs Dragonite");
                            System.out.println("2.- Gyarados vrs Giratina");
                            System.out.println("3.- Dragonite vrs Giratina");
                            System.out.println("4.- Giratina vrs Sylveon");
                            int pelea = leer.nextInt();
                            switch (pelea){
                                case 1 ->  {
                                    double pokemon1 = 280.00;
                                    double pokemon2 = 250.00;
                                    int controndas = 1;
                                    while (pokemon1 > 0 && pokemon2 > 0){
                                        System.out.println("**********Ronda" +controndas +"**********");
                                        controndas = controndas + 1;
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        double daño1 = 80.00;
                                        daño1 = daño1 - 80.00*.20;
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        double daño2 = 75.00;
                                        daño2 = daño2 - 75.00*.15;
                                        pokemon1 = pokemon1-daño2;
                                        pokemon2 = pokemon2-daño1;
                                        if (pokemon1 <0){
                                            pokemon1 = 0.0;
                                        }
                                        if (pokemon2 <0){
                                            pokemon2 = 0.0;
                                        }
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                       
                                    }
                                    System.out.println("**********Termino la batalla**********");
                                    if (pokemon1==0){
                                        System.out.println("El ganador es el Pokemon 2");
                                    }else{
                                        System.out.println("El ganador es el Pokemon 1");
                                    }
                                    System.out.println("");
                                break;    
                                }
                                case 2 ->  {
                                    double pokemon1 = 300.00;
                                    double pokemon2 = 300.00;
                                    int controndas = 1;
                                    while (pokemon1 > 0 && pokemon2 > 0){
                                        System.out.println("**********Ronda" +controndas +"**********");
                                        controndas = controndas + 1;
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        double daño1 = 50.00;
                                        daño1 = daño1 - 50.00*.25;
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        double daño2 = 70.00;
                                        daño2 = daño2 - 70.00*.10;
                                        pokemon1 = pokemon1-daño2;
                                        pokemon2 = pokemon2-daño1;
                                        if (pokemon1 <0){
                                            pokemon1 = 0.0;
                                        }
                                        if (pokemon2 <0){
                                            pokemon2 = 0.0;
                                        }
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                       
                                    }
                                    System.out.println("**********Termino la batalla**********");
                                    if (pokemon1==0){
                                        System.out.println("El ganador es el Pokemon 2");
                                    }else{
                                        System.out.println("El ganador es el Pokemon 1");
                                    }
                                    System.out.println("");
                                break;    
                                }
                                case 3 ->  {
                                    double pokemon1 = 250.00;
                                    double pokemon2 = 300.00;
                                    int controndas = 1;
                                    while (pokemon1 > 0 && pokemon2 > 0){
                                        System.out.println("**********Ronda" +controndas +"**********");
                                        controndas = controndas + 1;
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        double daño1 = 75.00;
                                        daño1 = daño1 - 75.00*.25;
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        double daño2 = 70.00;
                                        daño2 = daño2 - 70.00*.20;
                                        pokemon1 = pokemon1-daño2;
                                        pokemon2 = pokemon2-daño1;
                                        if (pokemon1 <0){
                                            pokemon1 = 0.0;
                                        }
                                        if (pokemon2 <0){
                                            pokemon2 = 0.0;
                                        }
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                       
                                    }
                                    System.out.println("**********Termino la batalla**********");
                                    if (pokemon1==0){
                                        System.out.println("El ganador es el Pokemon 2");
                                    }else{
                                        System.out.println("El ganador es el Pokemon 1");
                                    }
                                    System.out.println("");
                                break;    
                                }
                                case 4 ->  {
                                    double pokemon1 = 300.00;
                                    double pokemon2 = 280.00;
                                    int controndas = 1;
                                    while (pokemon1 > 0 && pokemon2 > 0){
                                        System.out.println("**********Ronda" +controndas +"**********");
                                        controndas = controndas + 1;
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        double daño1 = 70.00;
                                        daño1 = daño1 - 70.00*.15;
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        double daño2 = 80.00;
                                        daño2 = daño2 - 80.00*.25;
                                        pokemon1 = pokemon1-daño2;
                                        pokemon2 = pokemon2-daño1;
                                        if (pokemon1 <0){
                                            pokemon1 = 0.0;
                                        }
                                        if (pokemon2 <0){
                                            pokemon2 = 0.0;
                                        }
                                        System.out.println("Vida del pokemon 1 :" + pokemon1);
                                        System.out.println("Vida del pokemon 2 :" + pokemon2);
                                       
                                    }
                                    System.out.println("**********Termino la batalla**********");
                                    if (pokemon1==0){
                                        System.out.println("El ganador es el Pokemon 2");
                                    }else{
                                        System.out.println("El ganador es el Pokemon 1");
                                    }
                                    System.out.println("");
                                break;
                                }
                                default -> {
                                    System.out.println("Ingrese una pelea definida");
                                break;
                                }
                            }
                        break;    
                        }
                        case 2 -> {
                            System.out.println("Cuantas rondas desea hacer?");
                            int rondas = leer.nextInt();
                            if (rondas>0 && rondas<=10){
                                System.out.println("Ingrese una pelea determinada");
                                System.out.println("1.- Sylveon vrs Dragonite");
                                System.out.println("2.- Gyarados vrs Giratina");
                                System.out.println("3.- Dragonite vrs Giratina");
                                System.out.println("4.- Giratina vrs Sylveon");
                                int pelea = leer.nextInt();
                                switch (pelea){
                                    case 1 ->  {
                                        double pokemon1 = 280.00;
                                        double pokemon2 = 250.00;
                                        int controndas = 1;
                                        while (controndas <= rondas){
                                            System.out.println("**********Ronda" +controndas +"**********");
                                            controndas = controndas + 1;
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            double daño1 = 80.00;
                                            daño1 = daño1 - 80.00*.20;
                                            System.out.println("Pokemon 2 Ha atacado!");
                                            double daño2 = 75.00;
                                            daño2 = daño2 - 75.00*.15;
                                            pokemon1 = pokemon1-daño2;
                                            pokemon2 = pokemon2-daño1;
                                            if (pokemon1 <0){
                                                pokemon1 = 0.0;
                                            }
                                            if (pokemon2 <0){
                                                pokemon2 = 0.0;
                                            }
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);

                                        }
                                        System.out.println("**********Termino la batalla**********");
                                        if (pokemon2>pokemon1){
                                            System.out.println("El ganador es el Pokemon 2");
                                        }else{
                                            System.out.println("El ganador es el Pokemon 1");
                                        }
                                        System.out.println("");
                                    break;
                                    }
                                    case 2 ->  {
                                        double pokemon1 = 300.00;
                                        double pokemon2 = 300.00;
                                        int controndas = 1;
                                        while (controndas <= rondas){
                                            System.out.println("**********Ronda" +controndas +"**********");
                                            controndas = controndas + 1;
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            double daño1 = 50.00;
                                            daño1 = daño1 - 50.00*.25;
                                            System.out.println("Pokemon 2 Ha atacado!");
                                            double daño2 = 70.00;
                                            daño2 = daño2 - 70.00*.10;
                                            pokemon1 = pokemon1-daño2;
                                            pokemon2 = pokemon2-daño1;
                                            if (pokemon1 <0){
                                                pokemon1 = 0.0;
                                            }
                                            if (pokemon2 <0){
                                                pokemon2 = 0.0;
                                            }
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);
                                        }
                                        System.out.println("**********Termino la batalla**********");
                                        if (pokemon2>pokemon1){
                                            System.out.println("El ganador es el Pokemon 2");
                                        }else{
                                            System.out.println("El ganador es el Pokemon 1");
                                        }
                                        System.out.println("");
                                    break;
                                    }
                                    case 3 ->  {
                                        double pokemon1 = 250.00;
                                        double pokemon2 = 300.00;
                                        int controndas = 1;
                                        while (controndas <= rondas){
                                            System.out.println("**********Ronda" +controndas +"**********");
                                            controndas = controndas + 1;
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            double daño1 = 75.00;
                                            daño1 = daño1 - 75.00*.25;
                                            System.out.println("Pokemon 2 Ha atacado!");
                                            double daño2 = 70.00;
                                            daño2 = daño2 - 70.00*.20;
                                            pokemon1 = pokemon1-daño2;
                                            pokemon2 = pokemon2-daño1;
                                            if (pokemon1 <0){
                                                pokemon1 = 0.0;
                                            }
                                            if (pokemon2 <0){
                                                pokemon2 = 0.0;
                                            }
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);

                                        }
                                        System.out.println("**********Termino la batalla**********");
                                        if (pokemon1==0){
                                            System.out.println("El ganador es el Pokemon 2");
                                        }else{
                                            System.out.println("El ganador es el Pokemon 1");
                                        }
                                        System.out.println("");   
                                    break;
                                    }
                                    case 4 ->  {
                                        double pokemon1 = 300.00;
                                        double pokemon2 = 280.00;
                                        int controndas = 1;
                                        while (controndas <= rondas){
                                            System.out.println("**********Ronda" +controndas +"**********");
                                            controndas = controndas + 1;
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            double daño1 = 70.00;
                                            daño1 = daño1 - 70.00*.15;
                                            System.out.println("Pokemon 2 Ha atacado!");
                                            double daño2 = 80.00;
                                            daño2 = daño2 - 80.00*.25;
                                            pokemon1 = pokemon1-daño2;
                                            pokemon2 = pokemon2-daño1;
                                            if (pokemon1 <0){
                                                pokemon1 = 0.0;
                                            }
                                            if (pokemon2 <0){
                                                pokemon2 = 0.0;
                                            }
                                            System.out.println("Vida del pokemon 1 :" + pokemon1);
                                            System.out.println("Vida del pokemon 2 :" + pokemon2);
                                            System.out.println("**********Termino la batalla**********");
                                            if (pokemon1==0){
                                                System.out.println("El ganador es el Pokemon 2");
                                            }else{
                                                System.out.println("El ganador es el Pokemon 1");
                                            }
                                            System.out.println("");
                                        }
                                    break;
                                    }
                                        
                                    default -> {
                                        System.out.println("Ingrese una pelea definida");
                                    break;
                                    }
                                }    
                            }else{
                                System.out.println("No se puede llegar a la ronda deseada");
                            }
                        break;    
                        }
    
                    }
                break;    
                }  
                case 3 -> {
                    System.out.println("Asteriscos en Casa!");
                    System.out.println("Ingrese un numero impar,mayor o igual a 7 ");
                    int numero = leer.nextInt();
                    int parimpar = numero % 2;
                    boolean par ;
                    par = parimpar == 0;
                    if (numero>=7 && par == false){
                        for (int i = 1; i <= numero; i++){
                            int contcolumna = 0;
                            for (int j = 1; j <= numero; j++){
                                contcolumna = 1 + contcolumna;
                                if(i==1 || i == numero|| j==1 || j==numero){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                                if (i == j+1 || i+j==numero+1){
                                    System.out.print(">");
                                }else{
                                    System.out.print(" ");
                                }
                                if (contcolumna + 1 == numero%2){
                                    System.out.print("|");
                                }
                            }//for interno
                            System.out.println("");
                        }
                    }else{
                        System.out.println("Ingrese porfavor un numero impar y mayor que 7");
                    }
                break;    
                }//final de case 3
                default -> {
                    System.out.println("Ingrese un 1,2,3 ");
                } 
            }// final de switch
            System.out.println("Desea continuar (s/n) : ");
            resp = leer.next().charAt(0);
            System.out.println("***********Menu*************");
            System.out.println("1. Suceciones y mas sucesiones! ");
            System.out.println("2. Pocket Monsters ");
            System.out.println("3. Atersico en Casa!  ");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();
        }   
        
    }
    
}
