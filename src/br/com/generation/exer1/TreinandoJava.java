package br.com.generation.exer1;

import java.util.Scanner;

public class TreinandoJava 
{
//Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	public static void main (String [] args) 
	{
		int ano, mes, dia, dias;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite quantos anos voc� tem: ");
		ano = leia.nextInt();
		System.out.println("Escreva quantos meses voc� tem: ");
		mes = leia.nextInt();
		System.out.println("Escreva quantos dias voc� tem: ");
		dia = leia.nextInt();
		dias = ano*360 + mes*30 + dia;
		System.out.println("Voc� tem " + dias + " dias");
	}
}
