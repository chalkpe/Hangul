package pe.chalk.hangul;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public abstract class Hangul {
    public static final ArrayList<HangulJamo> INITIALS = new ArrayList<>(Arrays.asList( //19
            new HangulJamo(0x3131, HangulJamo.Type.INITIAL), //ㄱ
            new HangulJamo(0x3132, HangulJamo.Type.INITIAL), //ㄲ
            new HangulJamo(0x3134, HangulJamo.Type.INITIAL), //ㄴ
            new HangulJamo(0x3137, HangulJamo.Type.INITIAL), //ㄷ
            new HangulJamo(0x3138, HangulJamo.Type.INITIAL), //ㄸ
            new HangulJamo(0x3139, HangulJamo.Type.INITIAL), //ㄹ
            new HangulJamo(0x3141, HangulJamo.Type.INITIAL), //ㅁ
            new HangulJamo(0x3142, HangulJamo.Type.INITIAL), //ㅂ
            new HangulJamo(0x3143, HangulJamo.Type.INITIAL), //ㅃ
            new HangulJamo(0x3145, HangulJamo.Type.INITIAL), //ㅅ

            new HangulJamo(0x3146, HangulJamo.Type.INITIAL), //ㅆ
            new HangulJamo(0x3147, HangulJamo.Type.INITIAL), //ㅇ
            new HangulJamo(0x3148, HangulJamo.Type.INITIAL), //ㅈ
            new HangulJamo(0x3149, HangulJamo.Type.INITIAL), //ㅉ
            new HangulJamo(0x314a, HangulJamo.Type.INITIAL), //ㅊ
            new HangulJamo(0x314b, HangulJamo.Type.INITIAL), //ㅋ
            new HangulJamo(0x314c, HangulJamo.Type.INITIAL), //ㅌ
            new HangulJamo(0x314d, HangulJamo.Type.INITIAL), //ㅍ
            new HangulJamo(0x314e, HangulJamo.Type.INITIAL)  //ㅎ
    ));
    public static final ArrayList<HangulJamo> MEDIALS = new ArrayList<>(Arrays.asList( //21
            new HangulJamo(0x314f, HangulJamo.Type.MEDIAL), //ㅏ
            new HangulJamo(0x3150, HangulJamo.Type.MEDIAL), //ㅐ
            new HangulJamo(0x3151, HangulJamo.Type.MEDIAL), //ㅑ
            new HangulJamo(0x3152, HangulJamo.Type.MEDIAL), //ㅒ
            new HangulJamo(0x3153, HangulJamo.Type.MEDIAL), //ㅓ
            new HangulJamo(0x3154, HangulJamo.Type.MEDIAL), //ㅔ
            new HangulJamo(0x3155, HangulJamo.Type.MEDIAL), //ㅕ
            new HangulJamo(0x3156, HangulJamo.Type.MEDIAL), //ㅖ
            new HangulJamo(0x3157, HangulJamo.Type.MEDIAL), //ㅗ
            new HangulJamo(0x3158, HangulJamo.Type.MEDIAL), //ㅘ

            new HangulJamo(0x3159, HangulJamo.Type.MEDIAL), //ㅙ
            new HangulJamo(0x315a, HangulJamo.Type.MEDIAL), //ㅚ
            new HangulJamo(0x315b, HangulJamo.Type.MEDIAL), //ㅛ
            new HangulJamo(0x315c, HangulJamo.Type.MEDIAL), //ㅜ
            new HangulJamo(0x315d, HangulJamo.Type.MEDIAL), //ㅝ
            new HangulJamo(0x315e, HangulJamo.Type.MEDIAL), //ㅞ
            new HangulJamo(0x315f, HangulJamo.Type.MEDIAL), //ㅟ
            new HangulJamo(0x3160, HangulJamo.Type.MEDIAL), //ㅠ
            new HangulJamo(0x3161, HangulJamo.Type.MEDIAL), //ㅡ
            new HangulJamo(0x3162, HangulJamo.Type.MEDIAL), //ㅢ

            new HangulJamo(0x3163, HangulJamo.Type.MEDIAL)  //ㅣ
    ));
    public static final ArrayList<HangulJamo> FINALS = new ArrayList<>(Arrays.asList( //28
            new HangulJamo(HangulJamo.NONE, HangulJamo.Type.FINAL), //None
            new HangulJamo(0x3131, HangulJamo.Type.FINAL), //ㄱ
            new HangulJamo(0x3132, HangulJamo.Type.FINAL), //ㄲ
            new HangulJamo(0x3133, HangulJamo.Type.FINAL), //ㄳ
            new HangulJamo(0x3134, HangulJamo.Type.FINAL), //ㄴ
            new HangulJamo(0x3135, HangulJamo.Type.FINAL), //ㄵ
            new HangulJamo(0x3136, HangulJamo.Type.FINAL), //ㄶ
            new HangulJamo(0x3137, HangulJamo.Type.FINAL), //ㄷ
            new HangulJamo(0x3139, HangulJamo.Type.FINAL), //ㄹ
            new HangulJamo(0x313a, HangulJamo.Type.FINAL), //ㄺ

            new HangulJamo(0x313b, HangulJamo.Type.FINAL), //ㄻ
            new HangulJamo(0x313c, HangulJamo.Type.FINAL), //ㄼ
            new HangulJamo(0x313d, HangulJamo.Type.FINAL), //ㄽ
            new HangulJamo(0x313e, HangulJamo.Type.FINAL), //ㄾ
            new HangulJamo(0x313f, HangulJamo.Type.FINAL), //ㄿ
            new HangulJamo(0x3140, HangulJamo.Type.FINAL), //ㅀ
            new HangulJamo(0x3141, HangulJamo.Type.FINAL), //ㅁ
            new HangulJamo(0x3142, HangulJamo.Type.FINAL), //ㅂ
            new HangulJamo(0x3144, HangulJamo.Type.FINAL), //ㅄ
            new HangulJamo(0x3145, HangulJamo.Type.FINAL), //ㅅ

            new HangulJamo(0x3146, HangulJamo.Type.FINAL), //ㅆ
            new HangulJamo(0x3147, HangulJamo.Type.FINAL), //ㅇ
            new HangulJamo(0x3148, HangulJamo.Type.FINAL), //ㅈ
            new HangulJamo(0x314a, HangulJamo.Type.FINAL), //ㅊ
            new HangulJamo(0x314b, HangulJamo.Type.FINAL), //ㅋ
            new HangulJamo(0x314c, HangulJamo.Type.FINAL), //ㅌ
            new HangulJamo(0x314d, HangulJamo.Type.FINAL), //ㅍ
            new HangulJamo(0x314e, HangulJamo.Type.FINAL)  //ㅎ
    ));

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
