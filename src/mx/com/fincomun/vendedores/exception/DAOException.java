package mx.com.fincomun.vendedores.exception;

public class DAOException extends Exception {

	/**
	 * @autor ErickRam
	 */
	private static final long serialVersionUID = 1L;

	public DAOException(){
		super();
	}
	
	public DAOException(Exception e){
		super(e);
	}
	
	public DAOException(Throwable t){
		super(t);
	}
	
	public DAOException(String mensaje){
		super(mensaje);
		
	}
}
