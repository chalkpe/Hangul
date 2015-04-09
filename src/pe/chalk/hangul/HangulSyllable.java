package pe.chalk.hangul;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public class HangulSyllable extends Hangul { //Hangul Syllables, AC00—D7A3
    public static final char MIN_VALUE = 0xAC00; //가
    public static final char MAX_VALUE = 0xD7A3; //힣

    public HangulSyllable(final int integer){
        this((char) integer);
    }
    public HangulSyllable(final char character){
        super(character);
    }

    @Override
    public boolean isOutOfBounds(final char character){
        return character < HangulSyllable.MIN_VALUE || HangulSyllable.MAX_VALUE < character;
    }

    @Override
    public String toString(){
        return "[HangulSyllable " + this.getCharacter() + "]";
    }

    public static HangulSyllable createFromJamo(HangulJamo initialJamo, HangulJamo medialJamo, HangulJamo finalJamo){
        if(initialJamo.getType() != HangulJamo.Type.INITIAL || medialJamo.getType() != HangulJamo.Type.MEDIAL || finalJamo.getType() != HangulJamo.Type.FINAL){
            throw new IllegalArgumentException();
        }

        return new HangulSyllable(HangulSyllable.MIN_VALUE
                + initialJamo.getIndex() * Hangul.MEDIALS.size() * Hangul.FINALS.size()
                + medialJamo.getIndex() * Hangul.FINALS.size()
                + finalJamo.getIndex());
    }

    public int getOffset(){
        return this.getCharacter() - HangulSyllable.MIN_VALUE;
    }

    public int getInitialJamoIndex(){
        return this.getOffset() / (Hangul.MEDIALS.size() * Hangul.FINALS.size());
    }

    public int getMedialJamoIndex(){
        return (this.getOffset() % (Hangul.MEDIALS.size() * Hangul.FINALS.size())) / Hangul.MEDIALS.size();
    }

    public int getFinalJamoIndex(){
        return (this.getOffset() % (Hangul.MEDIALS.size() * Hangul.FINALS.size())) % Hangul.MEDIALS.size();
    }

    public HangulJamo getInitialJamo(){
        return Hangul.INITIALS.get(this.getInitialJamoIndex());
    }

    public HangulJamo getMedialJamo(){
        return Hangul.MEDIALS.get(this.getMedialJamoIndex());
    }

    public HangulJamo getFinalJamo(){
        return Hangul.FINALS.get(this.getFinalJamoIndex());
    }

    public ArrayList<HangulJamo> getJamoGroup(){
        return new ArrayList<>(Arrays.asList(this.getInitialJamo(), this.getMedialJamo(), this.getFinalJamo()));
    }
}