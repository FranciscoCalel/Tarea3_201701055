/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuipc1;
import java.util.Scanner;//variables de tipo scanner
/**
 *
 * @author franc
 */
public class MenuIPC1 {
    public static String[] persona= new String [5];//cadena de caracteres
    

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){//definicion de clase
            Scanner scan = new Scanner(System.in);//objeto asociado
            int opcion;// variable
            do{//bucle
                System.out.println("1. Usuario");//formato de opciones  del menu
                System.out.println("2. Contador de Digitos");
                System.out.println("3. Tres numero mayor a menor");
                System.out.println("4. Calcular Promedio");
                System.out.println("5. Salir");
                System.out.println("Selecciona un numero");
                opcion = scan.nextInt();//formato de numero entero
                
                switch(opcion){//condicional de seleccion
                    case 1:// decision
                        usuarios();
                    break;// rompe iteracion del bucle
                    
                    case 2:
                        contadordedigitos();
                    break;
                    case 3:
                        numerosdemayoramenor();
                    break;
                    case 4:
                        promedio();
                        break;
                    case 5:
                        salir();
                        
                }
                
            }while(opcion >=1 && opcion <=4); //termina el bucle
            
        }
        
        public static void usuarios(){
            Scanner scan = new Scanner(System.in);
            int opcion1;
            do{
                System.out.println("1. Ingresar usuario");//impresion del submenu
                System.out.println("2. Mostrar usuario ascendente");
                System.out.println("3. Mostrar usuario descendente");
                System.out.println("4. Menu principal");
                System.out.println("Selecciona un numero");
                opcion1 = scan.nextInt();//formato de numero entero
                
                switch(opcion1){
                    case 1:
                        ingresarusuarios();
                        break;
                    case 2:
                        System.out.println("orden ascendente");
                        for( int i=4; i>=0 ; i--) {//ciclo for ejecuta sentencia
                        System.out.println("[" + persona[i]+ "]");// imprime sentencia
                        }
                    break;
                    case 3:
                        System.out.println("Arreglo sin orden:");
                    for( int i=0; i < persona.length ; i++) {//ciclo for ejecuta sentencia
                        System.out.println("[" + persona[i]+ "]");
                    }
                    break;
                    case 4:
                        regresar();//regresara al menu principal
                    break;
                    default://volver a tomar decision sin salir del submenu
                        System.out.println("opcion invalida");
                    break;
                }
            }while(opcion1 >=1 && opcion1 <=3);//cambia la condicion para volver al menu princial
        }
            
        public static void ingresarusuarios(){
            Scanner scan = new Scanner(System.in);
            
            
            
            System.out.println("Ingrese 5 nombres");
        for (int i = 0; i < persona.length; i++){//se ejecuta sentencia
            System.out.println("Ingrese usuario" +i+":");
            persona[i]= scan.nextLine();//lee la cadena de texto hasta el fin de la linea
            for (int j = 0; j < i; j++){//instrucciones en caso no se cumple la condicion
                if(i>=1&&persona[j].equals(persona[i])){
                    System.out.println("usuario repetido" +j+":");
                    persona[j]= scan.nextLine();//lee la cadena de texto hasta el fin de la linea
                }
                    
                }
            }
                    
        
            
        }
        
        public static void regresar(){// regresa al menu princial
        System.out.println("Regresar al menu principal");
        
    }
        
        public static void contadordedigitos(){//submenu 2
        Scanner scan = new Scanner(System.in);
        
        int opcion2;//declaracion de variables
        int numero=0;
        int cantidad=0;
        
        
        do{//se crea el bucle
            System.out.println("1. Ingresar numero");
            System.out.println("2. mostrar numero de digitos");
            System.out.println("3. Menu principal");
            System.out.println("Selecciona un numero");
            opcion2 = scan.nextInt();
            
            
            switch(opcion2){
                case 1:
                    
                    
                    System.out.println("ingrese un numero");
                    numero= scan.nextInt();
                    
                    if(numero>0 && numero< 100000){//se crea instruccion
                    System.out.println("numero guardado");
                    }else{//se da otra isntruccion en caso no se cumpla
                        System.out.println("numero fuera de rango");
                    }
                    
                break;
                    
                case 2:
                    int digito=numero;
                    while(digito>0){//se da una condicion
                        digito=digito/10;//se opera para calcular numero de digitos
                        cantidad++;// numero de digitos
                    }
                    System.out.println("el numero tiene "+cantidad+" digitos");
                    
                break;
                case 3:
                    regresar();
                    
                break;
                default:
                    System.out.println("opcion invalida");
                break;
                
                    }
                        }while(opcion2 >=1 && opcion2 <=2);
            
        }
        
        public static void numerosdemayoramenor(){
        Scanner scan = new Scanner(System.in);
        int opcion3;//declaracion de variables
        int num1=0;
        int num2=0;
        int num3=0;
        int menor;
        int mayor;
        int medio;
        
        
        do{
            System.out.println("1. Ingresar numeros");//se crea submenu
            System.out.println("2. Mostrar ordenados");
            System.out.println("3. Menu principal");
            System.out.println("Selecciona un numero");
            opcion3 = scan.nextInt();
            
            switch(opcion3){
                case 1:
                    
                    System.out.println("2. Ingrese el primer numero");
                    num1 = scan.nextInt();
                    System.out.println("2. Ingrese el segundo numero numero");
                    num2 = scan.nextInt();
                    System.out.println("2. Ingrese el tercer numero");
                    num3 = scan.nextInt();
                break;
                
                case 2:    
                    if(num1 > num2 && num2 > num3){//se da instruccion
                        System.out.println("mayor a menor: "+num1+","+num2+","+num3+"");
                    }else if(num1 > num3 && num3 > num2){////se da otra isntruccion en caso no se cumpla
                        System.out.println("mayor a menor: "+num1+","+num3+","+num2+"");
                    }else if(num2 > num1 && num1 > num3){
                        System.out.println("mayor a menor: "+num2+","+num1+","+num3+"");
                    }else if(num2 > num3 && num3 > num1){
                        System.out.println("mayor a menor: "+num2+","+num3+","+num1+"");
                    }else if(num3 > num1 && num1 > num2){
                        System.out.println("mayor a menor: "+num3+","+num1+","+num2+"");
                    }else if(num3 > num2 && num2 > num1){
                        System.out.println("mayor a menor: "+num3+","+num2+","+num1+"");
                    }
                    
                break;
                
                case 3:
                break;
                case 4:
                    regresar();
                break;
                default:
                    System.out.println("opcion invalida");
                break;
                
            }
        }while(opcion3 >=1 && opcion3 <=2);
        
        }
        
        
        public static void promedio(){
        Scanner scan = new Scanner(System.in);
        
            int opcion1;
            do{
                System.out.println("1. Ingresar ID");
                System.out.println("2. ingresar nota");
                System.out.println("3. Mostrar promedios");
                System.out.println("4. Menu principal");
                System.out.println("Selecciona un numero");
                opcion1 = scan.nextInt();
                
                switch(opcion1){
                    case 1:
                        ingreasarid();
                        
                        break;
                    case 2:
                        ingreasarnota1();
                        ingreasarnota2();
                    break;
                    case 3:
                        
                    break;
                    case 4:
                        regresar();
                    break;
                    default:
                        System.out.println("opcion invalida");
                    break;
                }
            }while(opcion1 >=1 && opcion1 <=3);
            
        }
        
        
        public static void ingreasarid(){//submenu ingresar id
            Scanner scan = new Scanner(System.in);
            String[] id= new String [6];//se crea un vector de tamaño 6
            
            System.out.println("Ingrese 5 ID");
            for (int a = 0; a < id.length; a++){//ciclo para ejecutar la sentencia 1
            System.out.println("Ingrese ID" +a+":");
            id[a]= scan.nextLine();
            for (int j = 0; j < a; j++){//ciclo para ejecutar la sentencia 2
                if(a>=1&&id[j].equals(id[a])){
                    System.out.println("ID repetido" +j+":");
                    id[j]= scan.nextLine();
                }
                    
                }
            }
        }
        //ingreso de notas por alumno
        public static void ingreasarnota1(){//ingreso de notas por alumno1
            Scanner scan = new Scanner(System.in);
           
            int notas;// se declra variable
            System.out.println("ingrese numero de notas");
            notas= scan.nextInt();
            
            double c=1.0,prom=0.0,suma=0.0;//numero real
            while(c>=1 && c<=notas){
                double not;
                System.out.println("ingrese las notas");
                not=scan.nextDouble();//formato de un numero real
                suma=suma+not;
                c++;//aumento
            }
            prom=suma/notas;//operacion
            System.out.println("promedio es"+prom);
            
        }
        
        
        public static void ingreasarnota2(){
            Scanner scan = new Scanner(System.in);
           
            int notas;
            System.out.println("ingrese numero de notas");
            notas= scan.nextInt();
            
            double d=1.0,prom1=0.0,suma=0.0;
            while(d>=1 && d<=notas){
                double not;
                System.out.println("ingrese las notas");
                not=scan.nextDouble();
                suma=suma+not;
                d++;
            }
            prom1=suma/notas;
            System.out.println("promedio es"+prom1);
            
            
            
            
        }
        
        public static void ingreasarnota3(){
            Scanner scan = new Scanner(System.in);
           
            int notas;
            System.out.println("ingrese numero de notas");
            notas= scan.nextInt();
            
            double e=1.0,prom2=0.0,suma=0.0;
            while(e>=1 && e<=notas){
                double not;
                System.out.println("ingrese las notas");
                not=scan.nextDouble();
                suma=suma+not;
                e++;
            }
            prom2=suma/notas;
            System.out.println("promedio es"+prom2);
            
            
            
            
        }
        
        public static void ingreasarnota4(){
            Scanner scan = new Scanner(System.in);
           
            int notas;
            System.out.println("ingrese numero de notas");
            notas= scan.nextInt();
            
            double f=1.0,prom3=0.0,suma=0.0;
            while(f>=1 && f<=notas){
                double not;
                System.out.println("ingrese las notas");
                not=scan.nextDouble();
                suma=suma+not;
                f++;
            }
            prom3=suma/notas;
            System.out.println("promedio es"+prom3);
            
            
            
            
        }
        
        public static void ingreasarnota5(){
            Scanner scan = new Scanner(System.in);
           
            int notas;
            System.out.println("ingrese numero de notas");
            notas= scan.nextInt();
            
            double g=1.0,prom4=0.0,suma=0.0;
            while(g>=1 && g<=notas){
                double not;
                System.out.println("ingrese las notas");
                not=scan.nextDouble();
                suma=suma+not;
                g++;
            }
            prom4=suma/notas;
            System.out.println("promedio es"+prom4);
            
            
            
            
        }
        
        public static void ingreasarnota6(){
            Scanner scan = new Scanner(System.in);
           
            int notas;
            System.out.println("ingrese numero de notas");
            notas= scan.nextInt();
            
            double h=1.0,prom5=0.0,suma=0.0;
            while(h>=1 && h<=notas){
                double not;
                System.out.println("ingrese las notas");
                not=scan.nextDouble();
                suma=suma+not;
                h++;
            }
            prom5=suma/notas;
            System.out.println("promedio es"+prom5);
            
            
            
            
        }
        //no pude realizar la matriz
        public static void prueba(){
            int matriz [] [] = new int [5][5];
            int alumno1[] = {0};
            int alumno2[] = {0};
            int alumno3[] = {0};
            int alumno4[] = {0};
            int alumno5[] = {5,20,36,50,30};
            int fila;
            int columna;
            int contador = 1;

            for(fila = 0; fila<matriz.length; fila++){
                for(columna = 0; columna<matriz.length; columna++){
                    if(fila==0){
                    matriz[fila][columna]=alumno1[columna];
                    }else if(fila==1){
                    matriz[fila][columna]=alumno2[columna];
                    }else if(fila==2){
                    matriz[fila][columna]=alumno3[columna];
                    }else if(fila ==3){
                    matriz[fila][columna]=alumno4[columna];
                    }else if(fila ==4){
                    matriz[fila][columna]=alumno5[columna];
                    }
                }   
            }
            for(fila = 0; fila<matriz.length; fila++){
                for(columna = 0; columna<matriz.length; columna++){
                    System.out.print("\t"+matriz[fila][columna]+" ");
                }
                System.out.println("");
            }
        }//no pude realizar la matriz
        
        public static void salir(){
        System.out.println("Gracias por usar el programa");
        
    }
}
        
