package ifsp.noticias.beans;

public class NoticiaSimples implements Noticia {

	public NoticiaSuper geraNoticia(String titulo, String data, String desc) {
		NoticiaSuper noticia = new NoticiaSuper(titulo, data, desc);
		return noticia;
	}
	
	public NoticiaSuper setTipoNoticia(NoticiaSuper noticia, String tipo) {
		noticia.setTipo(tipo);
		return noticia;
	}

}
