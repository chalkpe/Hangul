package pe.chalk.hangul;

public class CharacterIndexOutOfBoundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CharacterIndexOutOfBoundsException(final char wrongChar){
		super(String.format("Illegal character %c - must be 0xAC00 <= x <= 0xD7AF", wrongChar));
	}
}