/**
 * ici les objet issus de ces classes sont deja connu ..
 * 
 * @author ADIDO Médis
 * 
 */
public enum COUNTRIES {
	Nigeria("Nigeria", 234, 3, 9),
	Benin("Benin", 229, 3, 8),
	Togo("Togo", 228, 3, 8),
	France("France", 33, 2, 9);

	private String name = "";
	private int code = 0;
	private int codelength = 0;
	private int numlength = 0;

	// Constructor
	COUNTRIES(String name, int code, int colen, int nulen) {
		this.setName(name);
		this.setCode(code);
		this.setCodelength(colen);
		this.setNumlength(nulen);
	}

	public int getNumlength() {
		return numlength;
	}

	public void setNumlength(int numlength) {
		this.numlength = numlength;
	}

	public int getCodelength() {
		return codelength;
	}

	public void setCodelength(int codelength) {
		this.codelength = codelength;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
