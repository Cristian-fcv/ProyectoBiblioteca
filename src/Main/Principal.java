package Main;

import java.util.Scanner;

import Dominio.Libros;

import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		String titulo;
		int anioPubli;
		String autor;
		int numPag, menuPrin, indice;
		float precio;
		
		Libros libro;
		
		LogicaMetodos imp = new LogicaMetodos();
		
		do {
			System.out.println("Menu Principal");
			System.out.println("1----Alta");
			System.out.println("2----Mostrar");
			System.out.println("3----Buscar");
			System.out.println("4----Editar");
			System.out.println("5----Eliminar");
			System.out.println("6----buscar por titulo");
			System.out.println("7----Buscar por autor");
			System.out.println("8----editar(precio) buscar por titulo");
			System.out.println("9----eliminar buscando por titutlo");
			System.out.println("10----Salir");
			
			
			
			
			
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			
			switch (menuPrin) {
			case 1:
				try {
					System.out.println("ingrese el titulo del libro");
					lectura = new Scanner(System.in);
					titulo = lectura.nextLine();
					
					System.out.println("ingrese el año de publicacion");
					lectura = new Scanner(System.in);
					anioPubli = lectura.nextInt();
					
					System.out.println("ingrese el autor");
					lectura = new Scanner(System.in);
					autor = lectura.nextLine();
					
					System.out.println("ingrese numero de paginas");
					lectura = new Scanner(System.in);
					numPag = lectura.nextInt();
					
					System.out.println("ingresa el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					
					// crear el objeto
					libro = new Libros(titulo, anioPubli, autor, numPag, precio);
					
					// agregar a lista
					imp.guardar(libro);
					
					
				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println("error al guardar" + e.getMessage());
					
				}
				
				break;
			case 2: 
				
				if (imp.mostrar().size() > 0) 
					System.out.println(imp.mostrar());
					
				else
					System.out.println("no hay registros");

				
				break;
			case 3:
				try {
					System.out.println("ingrese el indice del registro a buscar");
					lectura = new Scanner(System.in);
					indice=lectura.nextInt();
					
					//buscar
					libro = imp.buscar(indice);
					System.out.println("se encontro "+ libro);
					
					
				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println("ese indice no existe");
				}
				break;
			case 4:
				try {
					System.out.println("ingrese el indice del registro a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					// buscar
					libro = imp.buscar(indice);
					System.out.println("se encontro "+libro.getTitulo());
					
					//editar el autor
					System.out.println("ingresa el nuevo nombre del autor");
					lectura=new Scanner(System.in);
					autor = lectura.nextLine();
					
					//actualizar el objeto 
					libro.setAutor(autor);
					
					//actualizar a la lista
					imp.editar(indice, libro);
					System.out.println("se edit con exito");
					
					
				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println("ese indice del registro no existe");
				}
				break;
			case 5:
				try {
					System.out.println("ingrese el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//eliminacion
					imp.eliminar(indice);
					System.out.println("se elimino correctamente");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ese registro no existe");
				}
				break;
			case 6:
				// buscar por titulo
				
				try {
					System.out.println("ingrese el tot del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//eliminacion
					imp.eliminar(indice);
					System.out.println("se elimino correctamente");
					
					
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println("ese indice no existe");
				}
				
				
				break;
			case 7:
				
				//buscar por autor
				
				
				break;
			case 8:
				
				// editar precio buscando por titulo
				
				
				break;
			case 9:
				
				// eliminar buscando por titulo 
				
				break;
			case 10:
				
				break;
			
			
			}
			
			
			
		} while (menuPrin < 10);

	}

}
