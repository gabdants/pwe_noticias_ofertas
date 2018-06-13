package ifsp.noticias.beans;

public abstract class NoticiaDecorator implements Noticia{

	protected Noticia noticiaDecorator;
	
	public NoticiaDecorator(Noticia noticiaDecorator) {
		this.noticiaDecorator = noticiaDecorator;
	}
	
	public NoticiaSuper geraNoticia(String titulo, String data, String desc) {
		return noticiaDecorator.geraNoticia(titulo, data, desc);
	}	
}
