import java.util.Random;

import javax.swing.JOptionPane;

import java.util.Scanner;

import java.util.Arrays;

import java.util.HashMap;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
            //1. Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.
              String input = JOptionPane.showInputDialog("Ingresa el primer número entero a operar");
              int num1 = double.parseDouble(input);
              String input2 = JOptionPane.showInputDialog("Ingresa el segundo número entero a operar");
              int num2 = double.parseDouble(input2);
              JOptionPane.showMessageDialog(num2);
              System.out.println("La suma es: "+(num1+num2));
              System.out.println("La resta es: "+(num1-num2));
              System.out.println("La multiplicación es: "+(num1*num2));
              System.out.println("La división es: "+(num1/num2));

            //2. Escribe un programa que pida al usuario un número entero y determine si es par o impar.
               String input3 = JOptionPane.showInputDialog("Ingresa un número entero para saber si es par o impar");
              int num3 = double.parseDouble(input3);
              JOptionPane.showMessageDialog(null, num3);
              String resultado = (num3%2==0) ? "el número es par" : "el número es impar";
              System.out.println(resultado);

            //3. Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.
              String input4 = JOptionPane.showInputDialog("Ingresa el radio del círculo ");
              double num4 =double.parseDouble(input4);
              JOptionPane.showMessageDialog(null, num4);
              double resultado2 = Math.PI*num4*num4;
              System.out.println("El área del círculo es: "+(resultado2));
              double resultado3 = Math.PI*2*num4;
              System.out.println("El perímetro del círculo es: "+(resultado3));

            //4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad
              String input5 = JOptionPane.showInputDialog("Ingresa edad en años para saber si es mayor o menor de edad");
              int num5 = double.parseDouble(input5);
              String resultado4 = (num5>=18) ? "es mayor de edad" : "es menor de edad";
              JOptionPane.showMessageDialog(null, num5);
              System.out.println(resultado4);    
        
            //5. Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
              String input6 = JOptionPane.showInputDialog("Ingresa el primer número entero");
              int num6 = double.parseDouble(input6);
              JOptionPane.showMessageDialog(null, num6);
              String input7 = JOptionPane.showInputDialog("Ingresa el segundo número entero");
              int num7 = double.parseDouble(input7);
              JOptionPane.showMessageDialog(null, num7);
              if(num6>num7){
                  System.out.println("el número mayor es: "+num6);
              }else if (num6<num7) {
                  System.out.println("el número mayor es: "+num7);
              } else {
                  System.out.println("Son números iguales! ");
              }
            //6. Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.
              String input8 = JOptionPane.showInputDialog("Ingresa el número para ver si es positivo, negativo o cero ");
              double num8 =double.parseDouble(input8);
              JOptionPane.showMessageDialog(null, num8);
              if(num8>0){
                  System.out.println("El número es positivo! ");
              }else if (num8<0) {
                  System.out.println("El número es negativo! ");
              } else {
                  System.out.println("El número es cero! ");
              }
        
            //7. Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.
              String input9 = JOptionPane.showInputDialog("Ingresa el número ");
              int num9 = double.parseDouble(input9);
              JOptionPane.showMessageDialog(null, num9);
              for(int x = 1; x < 11; x++ ){
                  System.out.println("El número: "+num9+" multiplicado por: "+x+" nos da como resultado: "+(num9*x));
              }
            //8. Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar
             int num10 = 0;
             int num11 = (int)Math.floor(Math.random() * (100-1) + 1); 
    	     while(num10 != num11){
                 String input10 = JOptionPane.showInputDialog("Ingresa el número entre 1 y 100: ");
                 num10 = double.parseDouble(input10);
                 if(num10<num11){
                     System.out.println("El número ingresado es menor!");
                     } else if (num10>num11){
                         System.out.println("El número ingresado es mayor!");
                    	 } else {
                             System.out.println("Ganaste!");
                             break;
                         } 
             }  
            //9. Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial. 
            int num12;
            double factorial = 1;
                do {String input11 = JOptionPane.showInputDialog("Ingresa el número que desea se calcule el factorial ");
                    num12 = double.parseDouble(input11);
                    } while(num12<0);
                for(int i=1;i<=num12;i++){
                            factorial = factorial*i;
                        }
                    System.out.println("El factorial de ese número es: "+factorial);

            //10. Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …    
                int fibonacci = 20, num13 = 0, num14 = 1, suma = 1;
                System.out.println("La suma de la serie es: "+(suma-1));
                for (int i=1;i<fibonacci;i++){
                    System.out.println("La suma de la serie es: "+suma);
                    suma = num13+num14;
                    num13 = num14;
                    num14 = suma;
                }

            //11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados
                double lado1, lado2, lado3, s, area; 
                String inputLado1 = JOptionPane.showInputDialog("Ingrese el lado 1 del triángulo ");
                lado1 = Double.parseDouble(inputLado1);
                String inputLado2 = JOptionPane.showInputDialog("Ingrese el lado 2 del triángulo ");
                lado2 = Double.parseDouble(inputLado2);
                String inputLado3 = JOptionPane.showInputDialog("Ingrese el lado 3 del triángulo ");
                lado3 = Double.parseDouble(inputLado3);
                s = (lado1+lado2+lado3)/2;
                area = Math.sqrt((s)*(s-lado1)*(s-lado2)*(s-lado3));
                System.out.println("El valor del área del triángulo es: "+area);

            //12. Realiza un programa que pida al usuario un número entero y determine si es un número primo o no
              int primo;
              boolean esPrimo = true;
              String inputPrimo = JOptionPane.showInputDialog("Ingrese el número que desea saber si es primo o no: ");
              primo = Integer.parseInt(inputPrimo);
              for(int i = 2; i<primo;i++){
                if(primo%i==0){
                    esPrimo = false;
                    System.out.println("el número: "+primo+" no es primo.");
                    break;
                }
              }
              if(esPrimo){
                System.out.println("el número: "+primo+" es primo.");
              }

            //13. Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales
                double numeroDecimal;
                int cantidadDecimales = 0;
                String inputNumeroDecimal = JOptionPane.showInputDialog("Ingrese el número que desea trabajar: ");
                numeroDecimal = Double.parseDouble(inputNumeroDecimal);
                String inputCantidadDecimales = JOptionPane.showInputDialog("Ingrese la cantidad de decimales. ");
                cantidadDecimales = Integer.parseInt(inputCantidadDecimales);
                String numeroRedondeado = String.format("%." + cantidadDecimales + "f", numeroDecimal);
                System.out.println("Número redondeado: " + numeroRedondeado);

            //14. Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.
                  int numeroPerfecto;
                  String inputNumeroPerfecto = JOptionPane.showInputDialog("Ingrese el número que desee saber si es perfecto o no: ");
                  numeroPerfecto = Integer.parseInt(inputNumeroPerfecto);
                  if(numeroPerfecto <= 0){
                    System.out.println("El número no es perfecto porque es negativo. ");
                  } else {
                        int sumaDivisores = 0;
                        for (int i = 1; i <= numeroPerfecto / 2; i++) {
                            if (numeroPerfecto % i == 0) {
                            sumaDivisores = sumaDivisores+i;
                            }
                        }
                        if(sumaDivisores == numeroPerfecto){
                        System.out.println("El número es perfecto. ");
                        } else {
                            System.out.println("El número no es perfecto. ");
                        }
                  }    
            
            //15. Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda
                  int numeroCapicua, numeroReves=0;
                  String inputNumeroCapicua = JOptionPane.showInputDialog("Ingrese el número que desee saber si es capicua o no: ");
                  numeroCapicua = Integer.parseInt(inputNumeroCapicua);
                  int numeroCo = numeroCapicua;
                  while(numeroCapicua != 0){
                    int digito = numeroCapicua%10;
                    numeroReves = numeroReves*10+digito;
                    numeroCapicua /=10;
                  }
                  if(numeroCo==numeroReves){
                    System.out.println("Es un número capicua "+numeroCo);
                  }else{
                    System.out.println("No es un número capicua "+numeroCo);
                  }
            //16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario.  
                String inputNumeroFi = JOptionPane.showInputDialog("Ingrese el número que desee tener la serie de Fibonacci ");
                int numeroFi = Integer.parseInt(inputNumeroFi);
                int numeroAnterior = 0;
                int numeroActual = 1;
                System.out.println("Serie de Fibonacci hasta "+numeroFi+" es:");
                System.out.println(numeroAnterior+ " ");
                while(numeroActual<=numeroFi){
                    System.out.println(numeroActual+ " ");
                    int numeroSiguiente = numeroAnterior + numeroActual;
                    numeroAnterior = numeroActual;
                    numeroActual = numeroSiguiente;
                }
            //17. Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.
                String inputNumeroIni = JOptionPane.showInputDialog("Ingrese el primer número entero ");
                int numeroIni = Integer.parseInt(inputNumeroIni);
                String inputNumeroFin = JOptionPane.showInputDialog("Ingrese el segundo número entero ");
                int numeroFin = Integer.parseInt(inputNumeroFin);
                System.out.println("Números primos en el rango " + numeroIni + ", " + numeroFin + ":");
                if (numeroIni > numeroFin) {
                    System.out.println("Error: El primer número debe ser menor o igual que el segundo número.");
                    return;
                }   for (int numeroCo = numeroIni; numeroCo <= numeroFin; numeroCo++) {
                        boolean esPrimo = true;
                        if (numeroCo <= 1) {
                            esPrimo = false;
                        }   else {  for (int i = 2; i <= Math.sqrt(numeroCo); i++) {
                                        if (numeroCo % i == 0) {
                                        esPrimo = false;
                                        break;
                                        }
                                    }
                            }   if (esPrimo) {
                                    System.out.print(numeroCo + " ");
                                }
                    }   
            //18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contrasena. 
            public static void main18(String[] args) {
                String contraseña = generarContraseña(8);
                System.out.println("Contraseña generada: " + contraseña);
            public static String generarContraseña(int longitud) {
                String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                StringBuilder contraseña = new StringBuilder();
                for (int i = 0; i < longitud; i++) {
                    int indice = (int) (Math.random() * caracteres.length());
                    contraseña.append(caracteres.charAt(indice));
                }        
                return contraseña.toString();
            }   
            
            //19. Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas
                public static void main19(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese su nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
                System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());
        
                scanner.close();
            }

            //20. Realiza un programa que solicite al usuario una cadena y luego invierta su orden
            public static void main20(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una cadena: ");
                String cadena = scanner.nextLine();
                String cadenaInvertida = invertirCadena(cadena);
                System.out.println("Cadena invertida: " + cadenaInvertida);
                scanner.close();
            }
            public static String invertirCadena(String cadena) {
                StringBuilder cadenaInvertida = new StringBuilder();
                for (int i = cadena.length() - 1; i >= 0; i--) {
                    cadenaInvertida.append(cadena.charAt(i));
                }
                return cadenaInvertida.toString();
            }
            //21. Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella
            public static void main21(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una cadena: ");
                String cadena = scanner.nextLine();
                System.out.print("Ingrese la letra a contar: ");
                char letra = scanner.next().charAt(0);
                int conteo = contarLetra(cadena, letra);
                System.out.println("La letra '" + letra + "' aparece " + conteo + " veces en la cadena.");
                scanner.close();
            }
            public static int contarLetra(String cadena, char letra) {
                int conteo = 0;
                for (int i = 0; i < cadena.length(); i++) {
                    if (cadena.charAt(i) == letra) {
                        conteo++;
                    }
                }
                return conteo;
            }

            //22. Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
            public static void main22(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una frase: ");
                String frase = scanner.nextLine();
                if (esPalindromo(frase)) {
                    System.out.println("La frase es un palíndromo.");
                } else {
                    System.out.println("La frase no es un palíndromo.");
                }
                scanner.close();
            }
            public static boolean esPalindromo(String frase) {
                String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();
                int longitud = fraseSinEspacios.length();
                for (int i = 0; i < longitud / 2; i++) {
                    if (fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(longitud - 1 - i)) {
                        return false;
                    }
                }
                return true;
            }

            //23. Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene
            public static void main23(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una oración: ");
                String oracion = scanner.nextLine();
                int cantidadPalabras = contarPalabras(oracion);
                System.out.println("La oración contiene " + cantidadPalabras + " palabra(s).");
                scanner.close();
            }
            public static int contarPalabras(String oracion) {
                String[] palabras = oracion.split("\\s+");
                return palabras.length;
            }

            //24. Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra
            public static void main24(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una cadena: ");
                String cadena = scanner.nextLine();
                System.out.print("Ingrese la letra a reemplazar: ");
                char letraAntigua = scanner.next().charAt(0);
                System.out.print("Ingrese la nueva letra: ");
                char letraNueva = scanner.next().charAt(0);
                String cadenaReemplazada = reemplazarLetra(cadena, letraAntigua, letraNueva);
                System.out.println("Cadena con reemplazo: " + cadenaReemplazada);
                scanner.close();
            }
            public static String reemplazarLetra(String cadena, char letraAntigua, char letraNueva) {
                return cadena.replace(letraAntigua, letraNueva);
            }

            //25. Pide al usuario una frase y muestra cada palabra por separado
            public static void main25(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una frase: ");
                String frase = scanner.nextLine();
                String[] palabras = frase.split("\\s+");
                System.out.println("Palabras en la frase:");
                for (String palabra : palabras) {
                    System.out.println(palabra);
                }
                scanner.close();
            }

            //26. Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco
            public static void main26(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una cadena: ");
                String cadena = scanner.nextLine();
                int cantidadCaracteresSinEspacios = contarCaracteresSinEspacios(cadena);
                System.out.println("La cadena tiene " + cantidadCaracteresSinEspacios + " caracter(es) sin contar espacios.");
                scanner.close();
            }
            public static int contarCaracteresSinEspacios(String cadena) {
                return cadena.replaceAll("\\s+", "").length();
            }

            //27. Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente
            public static void main27(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una frase: ");
                String frase = scanner.nextLine();
                String[] palabras = frase.split("\\s+");
                Arrays.sort(palabras);
                System.out.println("Palabras ordenadas alfabéticamente:");
                for (String palabra : palabras) {
                    System.out.println(palabra);
                }
                scanner.close();
            }

            //28. Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
            public static void main28(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                int cantidadElementos = scanner.nextInt();
                int[] arreglo = new int[cantidadElementos];
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                int suma = calcularSuma(arreglo);
                System.out.println("La suma de los elementos en el arreglo es: " + suma);
                scanner.close();
            }
            public static int calcularSuma(int[] arreglo) {
                int suma = 0;
                for (int elemento : arreglo) {
                    suma += elemento;
                }
                return suma;
            }

            //29. Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.
            public static void main29(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                int cantidadElementos = scanner.nextInt();
                int[] arreglo = new int[cantidadElementos];
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                int numeroMasGrande = encontrarNumeroMasGrande(arreglo);
                System.out.println("El número más grande en el arreglo es: " + numeroMasGrande);
                scanner.close();
            }
            public static int encontrarNumeroMasGrande(int[] arreglo) {
                int maximo = arreglo[0];
                for (int i = 1; i < arreglo.length; i++) {
                    if (arreglo[i] > maximo) {
                        maximo = arreglo[i];
                    }
                }
                return maximo;
            }

            //30. Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo     
            public static void main30(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                int cantidadElementos = scanner.nextInt();
                int[] arreglo = new int[cantidadElementos];
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                int[] arregloSinDuplicados = eliminarDuplicados(arreglo);
                System.out.println("Arreglo sin elementos duplicados:");
                System.out.println(Arrays.toString(arregloSinDuplicados));
                scanner.close();
            }
            public static int[] eliminarDuplicados(int[] arreglo) {
                ArrayList<Integer> listaSinDuplicados = new ArrayList<>();
                for (int elemento : arreglo) {
                    if (!listaSinDuplicados.contains(elemento)) {
                        listaSinDuplicados.add(elemento);
                    }
                }
                int[] arregloSinDuplicados = new int[listaSinDuplicados.size()];
                for (int i = 0; i < listaSinDuplicados.size(); i++) {
                    arregloSinDuplicados[i] = listaSinDuplicados.get(i);
                }
                return arregloSinDuplicados;
            }

            //31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.
            public static void main31(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                int cantidadElementos = scanner.nextInt();
                int[] arreglo = new int[cantidadElementos];
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                ordenarArregloBurbuja(arreglo);
                System.out.println("Arreglo ordenado de manera ascendente:");
                System.out.println(Arrays.toString(arreglo));
                scanner.close();
            }
            public static void ordenarArregloBurbuja(int[] arreglo) {
                int n = arreglo.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arreglo[j] > arreglo[j + 1]) {
                            int temp = arreglo[j];
                            arreglo[j] = arreglo[j + 1];
                            arreglo[j + 1] = temp;
                        }
                    }
                }
            }

            //32. Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).
            public static void main32(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                int cantidadElementos = scanner.nextInt();
                int[] arreglo = new int[cantidadElementos];
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                System.out.print("Ingrese el número a buscar: ");
                int numeroBuscado = scanner.nextInt();
                int indice = buscarNumero(arreglo, numeroBuscado);
                if (indice != -1) {
                    System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + indice);
                } else {
                    System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
                }
                scanner.close();
            }
            public static int buscarNumero(int[] arreglo, int numeroBuscado) {
                for (int i = 0; i < arreglo.length; i++) {
                    if (arreglo[i] == numeroBuscado) {
                        return i;
                    }
                }
                return -1;
            }

            //33. Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo
            public static void main33(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                int cantidadElementos = scanner.nextInt();
                int[] arreglo = new int[cantidadElementos];
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                Map<Integer, Integer> frecuenciaElementos = contarFrecuenciaElementos(arreglo);
                System.out.println("Frecuencia de elementos en el arreglo:");
                for (Map.Entry<Integer, Integer> entry : frecuenciaElementos.entrySet()) {
                    System.out.println("Elemento " + entry.getKey() + ": " + entry.getValue() + " veces");
                } 
                scanner.close();
            }
            public static Map<Integer, Integer> contarFrecuenciaElementos(int[] arreglo) {
                Map<Integer, Integer> frecuencia = new HashMap<>();  
                for (int elemento : arreglo) {
                    frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
                }  
                return frecuencia;
            }

            //34. Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
            public static void main34(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                int cantidadElementos = scanner.nextInt();
                int[] arreglo = new int[cantidadElementos];
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                System.out.print("Ingrese la cantidad de posiciones a rotar: ");
                int cantidadPosiciones = scanner.nextInt();
                System.out.print("Ingrese la dirección de rotación (izquierda/derecha): ");
                String direccion = scanner.next();
                int[] arregloRotado = rotarArreglo(arreglo, cantidadPosiciones, direccion);
                System.out.println("Arreglo rotado: " + Arrays.toString(arregloRotado));
                scanner.close();
            }
            public static int[] rotarArreglo(int[] arreglo, int cantidadPosiciones, String direccion) {
                int n = arreglo.length;
                int[] arregloRotado = new int[n];
                if ("derecha".equalsIgnoreCase(direccion)) {
                    for (int i = 0; i < n; i++) {
                        arregloRotado[(i + cantidadPosiciones) % n] = arreglo[i];
                    }
                } else if ("izquierda".equalsIgnoreCase(direccion)) {
                    for (int i = 0; i < n; i++) {
                        arregloRotado[(i - cantidadPosiciones + n) % n] = arreglo[i];
                    }
                } else {
                    throw new IllegalArgumentException("Dirección de rotación inválida.");
                }
                return arregloRotado;
            }
            //35. .Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al 10. Usa para esto una matriz
            public static void main35(String[] args) {
                int[][] tablasMultiplicar = new int[10][10];
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        tablasMultiplicar[i][j] = (i + 1) * (j + 1);
                    }
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
                    imprimirTablaMultiplicar(tablasMultiplicar[i]);
                    System.out.println();
                }
            }
            public static void imprimirTablaMultiplicar(int[] tabla) {
                for (int i = 0; i < 10; i++) {
                    System.out.println((i + 1) + " * " + (tabla[i] / (i + 1)) + " = " + tabla[i]);
                }
            }
    }
}    
