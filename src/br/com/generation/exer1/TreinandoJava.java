package br.com.generation.exer1;

import java.util.Scanner;

public class TreinandoJava 
{
//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	public static void main (String [] args) 
	{
		int ano, mes, dia, dias;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite quantos anos você tem: ");
		ano = leia.nextInt();
		System.out.println("Escreva quantos meses você tem: ");
		mes = leia.nextInt();
		System.out.println("Escreva quantos dias você tem: ");
		dia = leia.nextInt();
		dias = ano*360 + mes*30 + dia;
		System.out.println("Você tem " + dias + " dias");
	}
}
