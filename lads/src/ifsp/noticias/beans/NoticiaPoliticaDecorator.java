package ifsp.noticias.beans;

public class NoticiaPoliticaDecorator  extends NoticiaDecorator{
	public NoticiaPoliticaDecorator(Noticia noticiaDecorator) {
		super(noticiaDecorator);
	}
		
	@Override
	public NoticiaSuper geraNoticia(String titulo, String data, String desc) {	
		return setTipoNoticia(noticiaDecorator.geraNoticia(titulo, data, desc), "Politica");
	}
	
	public NoticiaSuper setTipoNoticia(NoticiaSuper noticia, String tipo) {
		noticia.setTipo(tipo);
		return noticia;
	}
}
