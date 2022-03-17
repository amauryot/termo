package view.subpanel.buttons;

public enum Button {

	CHECK(0, "Verificar"),
	CLEAR(1, "Limpar");
	
	private int index;
	private String title;
	
	private Button(int index, String title) {
		this.index = index;
		this.title = title;
	}
	
	public int index() {
		return index;
	}
	
	public String title() {
		return title;
	}
}
