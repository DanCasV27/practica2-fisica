import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        System.out.println("----Bienvenido profesor a los ejercicios programados de la practica #2----");

        do{
            System.out.println("----Seleccione el problema que desee revisar----");
            System.out.println("----1.Impulso Nervioso----");
            System.out.println("----2.Corte de cabello----");
            System.out.println("----3.Carritos----");
            System.out.println("----Nota: estos numeros son las opciones del menu y no hacen referencia a los numeros en la practica----");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    problema1();
                    break;
                case 2:
                    problema2();
                    break;
                case 3:
                    problema3();

                    break;
                case 4:
                    System.out.println("Cerrando practica#2");
                    break;
            }
        }while(opcion!=4);





    }
    public static void problema1(){
        double estatura;
        System.out.println("Ingrese su estatura en Metros");
        estatura=sc.nextDouble();
        System.out.println("El tiempo en que el impulso nervioso viajaria hacia su cerebro equivale a "+estatura/100+ "s");
    }
    public static void problema2(){
        double longitudFinal;
        int popcion;
        double tiempo;
        double distancia;
        System.out.println("Un universitario se corta el cabello para dejarlo de un largo de 1.5cm. Dicho cabello crece aproximadamente 2cm/mes.");
        System.out.println("Para realizar el calculo de cuando volvera a ir al peluquero, ingrese la longitud final deseada en cm");
        longitudFinal=sc.nextDouble();
        System.out.println("Seleccione la unidad de tiempo en la que desea saber el proximo viaje al peluquero");
        System.out.println("1.dias");
        System.out.println("2.meses");
        System.out.println("3.semanas");
        popcion=sc.nextInt();
        distancia=longitudFinal-1.5;

        switch (popcion) {
            case 1:
                tiempo=(distancia/2)*30;
                System.out.println("El siguiente viaje al peluquero sera en aproximadamente "+tiempo+" dias");
                break;
            case 2:
                tiempo=distancia/2;
                System.out.println("El siguiente viaje al peluquero sera en aproximadamente "+tiempo+" meses");

                break;
            case 3:
                tiempo=(distancia/2)*4.34;
                System.out.println("El siguiente viaje al peluquero sera en aproximadamente "+tiempo+" semanas");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
    }
    public static void problema3(){
        double a1,a2,distancia,xcarrito1,xcarrito2;

        System.out.println("Procederemos a calcular los incizos 1 y 2 del problema # 4 de la práctica....");
        System.out.println("Ingrese la separación entre carritos (distancia) en metros");
        distancia=sc.nextDouble();
        System.out.println("Ingrese la aceleraciòn constante del carrito 1 en m/s^2");
        a1=sc.nextDouble();
        System.out.println("Ingrese la aceleraciòn constante del carrito 2 en m/s^2");
        a2=sc.nextDouble();
        xcarrito1=0.5*a1* Math.pow(3,2);
        xcarrito2=distancia-0.5*a2*Math.pow(3,2);
        double separacion = Math.abs(xcarrito2 - xcarrito1);
        double encuentro= Math.sqrt((2*distancia)/(a1+a2));
        System.out.println("La separación entre ambos carros es de "+separacion+"m en 3 segundos");
        System.out.println("El tiempo de encuentro entre ambos carros es :"+encuentro+" s");
    }


}