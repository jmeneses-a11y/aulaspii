package ifrn.pi.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventoRepository;

@Controller
@RequestMapping("/eventos")
public class EventosControllers {
	
	@Autowired
	private EventoRepository er;
	
	
	
	@GetMapping("//form")
	public String form() {
		return "eventos/formEvento";
	}

	@GetMapping("/evento")
	public String adicionar1(String nome){
	    
	System.out.println("O nome:" +nome);
		return "index";
	}
	@PostMapping
	public String adicionar(Evento evento) {
 
		System.out.println(evento);
		er.save(evento);
		return "eventos/evento-adicionar";
	
	}
	@GetMapping 
	public ModelAndView listar() {
		
		List<Evento> eventos = er.findAll();
		ModelAndView mv = new ModelAndView("eventos/lista");
		mv.addObject("eventos",eventos );
		return mv;
		
		
}
}
