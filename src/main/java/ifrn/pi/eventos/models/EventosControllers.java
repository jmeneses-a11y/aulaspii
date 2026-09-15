package ifrn.pi.eventos.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.repositories.EventoRepository;

@Controller
public class EventosControllers {
	
	@Autowired
	private EventoRepository er;
	
	
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formEvento";
	}

	@GetMapping("/evento")
	public String adicionar1(String nome){
	    
	System.out.println("O nome:" +nome);
		return "index";
	}
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
 
		System.out.println(evento);
		er.save(evento);
		return "eventos/evento-adicionar";
	
	}
}
