package KodlamaIoDay4.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import KodlamaIoDay4.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;

public interface IProgramingLanguageService {
	
	public List<ProgramingLanguage> getAll();
	void add(ProgramingLanguage programingLanguage);
	void delete(int id);
	void update(ProgramingLanguage programingLanguage);
	ProgramingLanguage getById(int id);

}
