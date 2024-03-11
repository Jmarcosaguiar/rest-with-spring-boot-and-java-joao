package br.com.joao;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {
	private static final String template = "Helloo, %s!";
	private static final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/saudar")
	public Saudacao saudacao(@RequestParam(value="name",defaultValue="world") String name) {
		return new Saudacao(counter.incrementAndGet(),String.format(template,name));
	}
}
