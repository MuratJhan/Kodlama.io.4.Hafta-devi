package KodlamaIoDay4.Kodlama.io.Devs.entites.concretes;



import nonapi.io.github.classgraph.json.Id;

public class ProgramingLanguage {
	
	@Id
	private int id;
	private String languageName;

	
	public ProgramingLanguage(int id, String languageName) {
		super();
		this.id = id;
		this.languageName = languageName;

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}



	
}
