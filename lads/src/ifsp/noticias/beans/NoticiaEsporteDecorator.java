package ifsp.noticias.beans;

public class NoticiaEsporteDecorator extends NoticiaDecorator{

	public NoticiaEsporteDecorator(Noticia noticiaDecorator) {
		super(noticiaDecorator);
	}
		
	@Override
	public NoticiaSuper geraNoticia(String titulo, String data, String desc) {	
		return setTipoNoticia(noticiaDecorator.geraNoticia(titulo, data, desc), "Esportes");
	}
	
	public NoticiaSuper setTipoNoticia(NoticiaSuper noticia, String tipo) {
		noticia.setTipo(tipo);
		return noticia;
	}
}
