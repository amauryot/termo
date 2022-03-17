package view.subpanel.keyboard;

public enum Key {

	Q(0, "Q"), W(1, "W"), E(2, "E"), R(3, "R"), T(4, "T"), Y(5, "Y"), U(6, "U"), I(7, "I"), O(8, "O"), P(9, "P"),
	A(10, "A"), S(11, "S"), D(12, "D"), F(13, "F"), G(14, "G"), H(15, "H"), J(16, "J"), K(17, "K"), L(18, "L"),
	Z(19, "Z"), X(20, "X"), C(21, "C"), V(22, "V"), B(23, "B"), N(24, "N"), M(25, "M");
	
	private int index;
	private String title;
	
	private Key(int index, String title) {
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
