package que_dia_da_semana_e_meu_aniversario;

public enum Dia {
	SUNDAY("domingo"), MONDAY("segunda-feira"), TUESDAY("terça-feira"), WEDNESDAY("quarta-feira"),
	THURSDAY("quinta-feira"), FRIDAY("sexta-feira"), SATURDAY("sabado");

	private final String br;

	Dia(String br) {
		this.br = br;
	}

	public String getBr() {
		return this.br;
	}

}
