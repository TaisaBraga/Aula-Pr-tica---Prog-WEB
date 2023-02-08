package exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public String ResouceNotFoundMessage() {
		return "Não encontrado";
	}

}
