package KodlamaIoDay4.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIoDay4.Kodlama.io.Devs.business.abstracts.IProgramingLanguageService;
import KodlamaIoDay4.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;

@RestController
@RequestMapping("/api/programingLanguages")
public class ProgramingLanguageController {
	
	IProgramingLanguageService programingLanguageService;

	@Autowired
	public ProgramingLanguageController(IProgramingLanguageService programingLanguageService) {
		super();
		this.programingLanguageService = programingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgramingLanguage> getAll(){
		
		return programingLanguageService.getAll();		
	}
	@PostMapping("/add")
	public void add(@RequestBody ProgramingLanguage programingLanguage) {
		
		programingLanguageService.add(programingLanguage);
		
	}
	@PostMapping("/update")
	public void update(@RequestBody ProgramingLanguage programingLanguage) {
		programingLanguageService.update(programingLanguage);
		
	}
	@PostMapping("/delete")
	public void delete(@PathVariable int id) {
		
		programingLanguageService.delete(id);
		
	}
	@GetMapping("/getById/{id}")
	public void getById(@PathVariable int id) {
		
		programingLanguageService.getById(id);
		
		
	}
	
	
	

	
	

}
