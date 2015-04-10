package pe.chalk.hangul;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public abstract class Hangul {

    private char character;

    public Hangul(final int integer){
        this.setCharacter((char) integer);
    }
    public Hangul(final char character){
        this.setCharacter(character);
    }

    public char getCharacter(){
        return character;
    }

    public void setCharacter(final char character){
        if(this.isOutOfBounds(character)){
            throw new CharacterIndexOutOfBoundsException(character);
        }
        this.character = character;
    }

    public abstract boolean isOutOfBounds(final char character);

    @Override
    public boolean equals(final Object that){
        return this == that || (that != null && this.getClass() == that.getClass()) && this.getCharacter() == ((Hangul) that).getCharacter();
    }

    @Override
    public int hashCode(){
        return (int) character;
    }

    @Override
    public String toString(){
        return "[Hangul " + this.getCharacter() + "]";
    }
}