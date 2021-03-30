package com.senati.eti;
import java .util.ArrayList;
import java.util.Scanner;


import com.senati.eti.model.Publicacion;

public class Caso_4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Generar el conjunto de datos de tipo obras
		ArrayList<Publicacion> arrPublic = new ArrayList<Publicacion>(5);
		
		Publicacion publica = null;
		
		String titu = "" , autor = "", pre = "SI";
		int tipo = 0, i = 0 ;
		
		while( pre.equals("SI")) {
		System.out.println("REGISTRO DE PUBLICACIONES "+(i + 1));
		System.out.println("=================");
		System.out.print("Título......: ");
		titu = sc.nextLine();
		System.out.print("Autor......: ");
		autor = sc.nextLine();
		System.out.print("Tipo.....[1/2]: ");
		tipo = sc.nextInt();
		sc.nextLine();
		System.out.print("¿Desea continuar con otro registro? [SI/NO]: ");
		pre =  sc.nextLine();
		pre = pre.toUpperCase();
		
		Publicacion alum3 = new Publicacion(titu,autor,tipo);
		 
		arrPublic.add(i,alum3);
		i++;
		}
		
		System.out.println("\nLISTA DE DATOS REGISTRADOS");
		System.out.println("============================");
        
		String patron = "%-4s %-20s %-10s %-15s";
        System.out.println(String.format(patron,"N","Título",
        		"Autor","Tipo"));		
        System.out.println(String.format(patron,"-","=====",
        		"=====","===="));	
        
        
        for ( int x = 0; x< arrPublic.size(); x++) { 
        	System.out.println(String.format(patron, ( x + 1) ,
        			arrPublic.get(x).NombreTitulo(), 
        			arrPublic.get(x).MostrarAutor(), 
        			arrPublic.get(x).MostrarTipo() )) ; 
        	
        }
	}
	}