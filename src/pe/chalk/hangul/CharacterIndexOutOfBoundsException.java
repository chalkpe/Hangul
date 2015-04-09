package pe.chalk.hangul;

public class CharacterIndexOutOfBoundsException extends RuntimeException {
	public CharacterIndexOutOfBoundsException(final char wrongCharacter){
		super("Character index out of range: " + wrongCharacter);
	}
}