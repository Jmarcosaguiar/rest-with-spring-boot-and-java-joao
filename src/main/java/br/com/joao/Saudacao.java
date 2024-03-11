package br.com.joao;

public class Saudacao {
	private final long id;
	private final String content;
	
	public String getContent() {
		return content;
	}
	
	public long getId() {
		return id;
	}

	public Saudacao(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	
}
