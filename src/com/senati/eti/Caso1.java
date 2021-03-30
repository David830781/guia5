package com.senati.eti;
import java.util.Scanner;
import com.senati.eti.model.Calculadora1;
public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        Calculadora1 cal = new Calculadora1();
        
        float n1 = 0,n2 = 0;
        
        System.out.print("Numero 1: ");
        n1 = sc.nextFloat();
        
        System.out.print("Numero 2: ");
        n2 = sc.nextFloat();
        
        cal.setNumero1(n1);
        cal.setNumero2(n2);
        
        System.out.println("\n ** NUMEROS INGRESADOS **");
        System.out.println("-----------------------------");
        System.out.println("Primer numero: "+cal.getNumero1());
        System.out.println("Segundo numero: "+cal.getNumero2());
        
        
        System.out.println("Resultados");
        System.out.println("===============");
        
        System.out.println("1.Suma:..... "+cal.Suma());
        System.out.println("2.Resta:..... "+cal.Resta());
	}

}
