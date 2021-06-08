public class HelloWorld {
    public static void main(String[] args) throws Exception {
    System.out.println ("Empezamos el programa");
    System.out.println ("Por favor introduzca el numero de notas:");
    int Suma=0, Promedio=0;

    int totalNotas = 0;
    int nota = 0;
    Scanner entradaScanner = new Scanner(System.in);
    totalNotas = entradaScanner.nextInt();

    if(totalNotas == 0){
        System.out.println ("Debe ingresar numero mayor que 0 ");
        main(args);
    } else {
    for(int i=1;i<=totalNotas;i++){
        System.out.println ("Por favor introduzca la nota " + i);
        nota = entradaScanner.nextInt();
        Suma = Suma + nota;
    }

    Promedio = Suma/totalNotas;

    System.out.println("El promedio es " + Promedio);
    }
    }
}
