package model;

public class Database {

	private final String[] DATABASE = {
		"ALGOZ", "AFETO", "AQUEM", "AUDAZ", "ASSIM", "ANEXO", "AMIGO", "AINDA", "ATRAS", "AFAGO",
		"BANAL", "BRAVO", "BURRO", "BREGA", "BEATA", "BRISA", "BREVE", "BANDO", "BRAVA", "BATER",
		"CERNE", "CORJA", "CAUSA", "CRIVO", "CEDER", "COMUM", "CULTO", "CENSO", "COISA", "CRISE",
		"DESDE", "DENGO", "DETEM", "DIZER", "DIGNO", "DEVER", "DENSO", "DOGMA", "DESSE", "DETER",
		"ETNIA", "EXPOR", "ESTAR", "ENFIM", "EXATO", "ENTRE", "EXAME", "EXIJO", "ELITE", "EXTRA",
		"FAZER", "FUTIL", "FORTE", "FELIZ", "FLUIR", "FALAR", "FORMA", "FLUXO", "FAVOR", "FACIL",
		"GENRO", "GERAR", "GRATO", "GENIO", "GENTE", "GESTO", "GERIR", "GRUPO", "GRAVE", "GERAL",
		"HONRA", "HAVER", "HABIL", "HEROI", "HAVIA", "HUMOR", "HIATO", "HOUVE", "HOTEL", "HINDU",
		"INATO", "IDEIA", "IMPOR", "IMUNE", "IGUAL", "IDEAL", "IDOSO", "IRADO", "ILESO", "IDADE",
		"JUSTO", "JEITO", "JUIZO", "JOVEM", "JUNTO", "JUDEU", "JEJUM", "JOGAR", "JUSTA", "JUNTA",
		"LAPSO", "LOUCO", "LIMBO", "LAICO", "LEVAR", "LEGAL", "LABEL", "LEIGO", "LEITO", "LINDA",
		"MEXER", "MUTUA", "MORAL", "MUITO", "MUNDO", "MANSO", "MEIGA", "MESMO", "MAGOA", "MORTE",
		"NEGRO", "NOBRE", "NENEM", "NICHO", "NOITE", "NOSSA", "NUNCA", "NORMA", "NIVEL", "NAVIO",
		"ORDEM", "ONTEM", "OBTER", "OLHAR", "OUVIR", "OUTRO", "OASIS", "OPACO", "OPTAR", "ODIAR",
		"PLENA", "POREM", "PODER", "PESAR", "POSSE", "PROLE", "PAUTA", "PUDOR", "PEDIR", "PRESA",
		"QUASE", "QUEDA", "QUAIS", "QUILO", "QUINA", "QUITE", "QUATI",
		"RAZAO", "REVES", "REGRA", "RITMO", "RETER", "ROGAR", "REVER", "RELVA", "RIGOR", "RAIVA",
		"SAGAZ", "SUTIL", "SANAR", "SOBRE", "SONHO", "SABER", "SENDO", "SAUDE", "SABIO", "SERIO",
		"TERMO", "TENUE", "TORPE", "TEMPO", "TEMOR", "TEMER", "TEDIO", "TOMAR", "TODOS", "TENDO",
		"USURA", "UNIAO", "USUAL", "URUBU", "USADO", "USINA", "UNIDO", "URRAR", "UIVAR", "UNIDA",
		"VIGOR", "VICIO", "VULGO", "VIRIL", "VENDO", "VALOR", "VITAL", "VIVER", "VELHO", "VACUO",
		"XUCRO", "XAMPU", "XIITA", "XEROX", "XEREM",
		"ZELAR", "ZUMBI", "ZEBRA", "ZIPER", "ZONZO", "ZEROS", "ZERAR", "ZINCO", "ZORRO", "ZELOU"
	};
	
	public String getWord(int index) {
		return DATABASE[index];
	}
	
	public int size() {
		return DATABASE.length;
	}
}
