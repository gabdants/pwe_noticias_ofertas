package ifsp.noticias.beans;

public class NoticiaSuper {
	
	String titulo;
	String data;
	String desc;
	String tipo;
	
	public NoticiaSuper(String titulo, String data, String desc) {
		super();
		this.titulo = titulo;
		this.data = data;
		this.desc = desc;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
