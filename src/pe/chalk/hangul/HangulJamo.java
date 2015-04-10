package pe.chalk.hangul;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public abstract class HangulJamo extends Hangul { //Hangul Compatibility Jamo, 3130—318F
    public static final char MIN_VALUE = 0x3131; //ㄱ
    public static final char MAX_VALUE = 0x3163; //ㅣ
    public static final char NONE = 0x0000; //Uses when the syllable doesn't have final

    public HangulJamo(final int integer){
        this((char) integer);
    }
    public HangulJamo(final char character){
        super(character);

        if(this.getIndex() < 0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean isOutOfBounds(final char character){
        return character != NONE && (character < HangulJamo.MIN_VALUE || HangulJamo.MAX_VALUE < character);
    }

    @Override
    public String toString(){
        return "[HangulJamo " + this.getCharacter() + "]";
    }

    public abstract int getIndex();
}