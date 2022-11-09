package KodlamaIoDay4.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import KodlamaIoDay4.Kodlama.io.Devs.dataAccess.abstracts.IProgramingLanguageRepository;
import KodlamaIoDay4.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;


@Repository
public class InMemoryProgramingLanguageRepository implements IProgramingLanguageRepository{

	ArrayList<ProgramingLanguage> programingLanguage = new ArrayList<ProgramingLanguage>();
	
	public InMemoryProgramingLanguageRepository() {
		
		programingLanguage.add(new ProgramingLanguage(1,"Java"));
		programingLanguage.add(new ProgramingLanguage(2,"C#"));
		programingLanguage.add(new ProgramingLanguage(3,"JS"));
		programingLanguage.add(new ProgramingLanguage(4,"Angular"));
		
	}

	@Override
	public List<ProgramingLanguage> getAll() {
		
		return programingLanguage;
		
	}

	@Override
	public void add(ProgramingLanguage programingLanguage) {
		
		this.programingLanguage.add(programingLanguage);
		
	}

	@Override
	public void delete(int id) {
		
		ProgramingLanguage prgLanguage = getById(id);
		this.programingLanguage.remove(prgLanguage);
		
		
	}

	@Override
	public void update(ProgramingLanguage programingLanguage) {
		
		ProgramingLanguage prgLanguage = getById(programingLanguage.getId());
		prgLanguage.setLanguageName(programingLanguage.getLanguageName());
		
		
	}
	@Override
	public ProgramingLanguage getById(int id) {
		
		for(ProgramingLanguage prgLanguage : programingLanguage) {
			if(prgLanguage.getId()==id) {
				
				return prgLanguage;
				
			}
			else {
				System.out.println("istenen id de data yok ! ");
			}
		}
		return null;
		
		
	}

}
