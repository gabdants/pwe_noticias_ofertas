package ifsp.noticias.beans;

public interface Noticia {
	public NoticiaSuper geraNoticia(String titulo, String data, String desc);
	public NoticiaSuper setTipoNoticia(NoticiaSuper noticia, String tipo);
}
