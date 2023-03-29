package que_dia_da_semana_e_meu_aniversario;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean repetir = true;

		while (repetir) {
			int dia, mes, ano;
			System.out.println(
					"Seja bem vindo ao programa que vai te dizer em que dia da semana seu aniversário cairá esse ano");
			System.out.println("Primeiro me diga qual dia do mês de seu aniversário");
			dia = input.nextInt();
			System.out.println("Agora me diga qual o mês de seu aniversário (númericamente)");
			mes = input.nextInt();
			System.out.println("E por fim o ano de seu nascimento");
			ano = input.nextInt();

			LocalDate aniversario = LocalDate.of(ano, mes, dia);
			LocalDate dataCalculo = LocalDate.of(LocalDate.now().getYear(), mes, dia);
			Period periodo = Period.between(aniversario, dataCalculo);

			System.out.printf("Seu aniversario no ano de %d, vai cair em %s e você completa %d anos.\n",
					dataCalculo.getYear(), converteDia(dataCalculo.getDayOfWeek().name()), periodo.getYears());

			repetir = repetir();
		}
		System.out.println("Programa encerrado!");

	}

	private static String converteDia(String ingles) {
		for (Dia dia : Dia.values()) {
			if (ingles.equalsIgnoreCase(dia.name())) {
				return dia.getBr();

			}
		}

		return ingles;

	}

	private static boolean repetir() {
		int decisao;
		System.out.println("Você gostaria de consultar outra data? \n[1] SIM \n[2] NÃO");
		decisao = input.nextInt();
		return (decisao == 1) ? true : false;
	}

}