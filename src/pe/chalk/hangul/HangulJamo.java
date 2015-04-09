package pe.chalk.hangul;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public class HangulJamo extends Hangul { //Hangul Compatibility Jamo, 3130—318F
    public static final char MIN_VALUE = 0x3131; //ㄱ
    public static final char MAX_VALUE = 0x3163; //ㅣ
    public static final char NONE = 0x0000; //Uses when the syllable doesn't have final

    private HangulJamo.Type type;

    public HangulJamo(final int integer, HangulJamo.Type type){
        this((char) integer, type);
    }
    public HangulJamo(final char character, HangulJamo.Type type){
        super(character);
        this.type = type;
    }

    @Override
    public boolean isOutOfBounds(final char character){
        return character != NONE && (character < HangulJamo.MIN_VALUE || HangulJamo.MAX_VALUE < character);
    }

    @Override
    public boolean equals(final Object that){
        return super.equals(that) && this.getType() == ((HangulJamo) that).getType();
    }

    @Override
    public String toString(){
        return "[HangulJamo " + this.getType().getName() + " " + this.getCharacter() + "]";
    }

    public enum Type {
        INITIAL("initial"), MEDIAL("medial"), FINAL("final");

        private String name;

        Type(final String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        @Override
        public String toString(){
            return "[HangulJamo.Type." + this.getName().toUpperCase() + "]";
        }
    }

    public Type getType(){
        return type;
    }

    public int getIndex(){
        switch(this.getType()){
            case INITIAL:
                return Hangul.INITIALS.indexOf(this);
            case MEDIAL:
                return Hangul.MEDIALS.indexOf(this);
            case FINAL:
                return Hangul.FINALS.indexOf(this);
            default:
                return -1;
        }
    }
}
