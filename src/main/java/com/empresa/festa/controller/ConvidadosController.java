package com.empresa.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.empresa.festa.model.Convidado;
import com.empresa.festa.repository.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;

	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject(new Convidado());
		mv.addObject("convidados", convidados.findAll());
		return mv;
	}
	
	@PostMapping("/convidados")
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
	
}
