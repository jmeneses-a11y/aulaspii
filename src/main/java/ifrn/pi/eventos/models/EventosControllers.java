package ifrn.pi.eventos.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosControllers {
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@GetMapping("/evento")
	public String adicionar1(String nome){
	    
	System.out.println("O nome:" +nome);
		return "index";
	}
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
 
		System.out.println(evento);
		
		return "evento-adicionar";
	
	}
}
