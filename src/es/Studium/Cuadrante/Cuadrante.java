package es.Studium.Cuadrante;

import java.util.Scanner;

public class Cuadrante {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double n1,n2;
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//Imprimimos por pantalla al cliente
		System.out.println("Introduzca el primer numero:");
		//pedimos un Caracter por teclado .CharAt (0)Nos permite cojer solo 1 caracter
		n1 = teclado.nextDouble();
		System.out.println("Introduzca el segundo numero:");
		//pedimos un Caracter por teclado .CharAt (0)Nos permite cojer solo 1 caracter
		n2 = teclado.nextDouble();
		teclado.close();
		if ((n1==0)&&(n2==0))
		{
			System.out.println( "Ambos numeros no pueden ser 0");
		}
		else
		{
			System.out.println("Estamos en el cuarante "+funCuadrante(n1,n2));
		}
	}
	private static int funCuadrante(double a, double b) 
	{
		// TODO Auto-generated method stub
		if ((a<=0) && (b>0))
		{
			return 2;
		}
		else if((a>=0) && (b>=0))
			{
			return 1;
			}
		else if ((a<0) && (b<0))
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}
}
