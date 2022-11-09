package KodlamaIoDay4.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIoDay4.Kodlama.io.Devs.business.abstracts.IProgramingLanguageService;
import KodlamaIoDay4.Kodlama.io.Devs.dataAccess.abstracts.IProgramingLanguageRepository;
import KodlamaIoDay4.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;

@Service
public class ProgramingLanguageManager implements IProgramingLanguageService{

	public IProgramingLanguageRepository programingLanguageRepository;
	
	
	@Autowired
	public ProgramingLanguageManager(IProgramingLanguageRepository programingLanguageRepository) {
		//super();
		this.programingLanguageRepository = programingLanguageRepository;
	}

	@Override
	public List<ProgramingLanguage> getAll() {
		
		return programingLanguageRepository.getAll();		
	}

	@Override
	public void add(ProgramingLanguage programingLanguage){
		
		if(!programingLanguage.getLanguageName().isEmpty()) {
			for(ProgramingLanguage prgLanguage: programingLanguageRepository.getAll()) {
				if(prgLanguage.getLanguageName().equalsIgnoreCase(programingLanguage.getLanguageName())) {
					System.out.println("Programlama isimleri ayni olamaz. ! ");
					
					break;
				}
			}
			programingLanguageRepository.add(programingLanguage);
		}
		else {
			System.out.println("Dil ismi bos gecilemez.");
			
		}
		
	}

	@Override
	public void delete(int id) {
		this.programingLanguageRepository.delete(id);
		
	}

	@Override
	public void update(ProgramingLanguage programingLanguage) {
		this.programingLanguageRepository.update(programingLanguage);
		
	}

	@Override
	public ProgramingLanguage getById(int id) {
		
		return this.programingLanguageRepository.getById(id);
		
		
	}
	
	

}
