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

    private HangulInitialConsonant initialConsonant;
    private HangulMedialVowel medialVowel;
    private HangulFinalConsonant finalConsonant;

    public HangulSyllable(final int integer){
        this((char) integer);
    }
    public HangulSyllable(final char character){
        super(character);
    }

    @Override
    public void setCharacter(char character){
        super.setCharacter(character);

        this.initialConsonant = HangulInitialConsonant.INITIAL_CONSONANTS.get(this.getInitialConsonantIndex());
        this.medialVowel = HangulMedialVowel.MEDIAL_VOWELS.get(this.getMedialVowelIndex());
        this.finalConsonant = HangulFinalConsonant.FINAL_CONSONANTS.get(this.getFinalConsonantIndex());
    }

    @Override
    public boolean isOutOfBounds(final char character){
        return character < HangulSyllable.MIN_VALUE || HangulSyllable.MAX_VALUE < character;
    }

    @Override
    public String toString(){
        return "[HangulSyllable " + this.getCharacter() + "]";
    }

    public static HangulSyllable createFromJamo(HangulInitialConsonant initialConsonant, HangulMedialVowel medialVowel, HangulFinalConsonant finalConsonant){
        return new HangulSyllable(HangulSyllable.MIN_VALUE
                + initialConsonant.getIndex() * HangulMedialVowel.LENGTH * HangulFinalConsonant.LENGTH
                + medialVowel.getIndex() * HangulFinalConsonant.LENGTH
                + finalConsonant.getIndex());
    }

    public int getOffset(){
        return this.getCharacter() - HangulSyllable.MIN_VALUE;
    }

    public int getInitialConsonantIndex(){
        return this.getOffset() / (HangulMedialVowel.LENGTH * HangulFinalConsonant.LENGTH);
    }

    public int getMedialVowelIndex(){
        return (this.getOffset() % (HangulMedialVowel.LENGTH * HangulFinalConsonant.LENGTH)) / HangulMedialVowel.LENGTH;
    }

    public int getFinalConsonantIndex(){
        return (this.getOffset() % (HangulMedialVowel.LENGTH * HangulFinalConsonant.LENGTH)) % HangulMedialVowel.LENGTH;
    }

    public HangulInitialConsonant getInitialConsonant(){
        return this.initialConsonant;
    }

    public HangulMedialVowel getMedialVowel(){
        return this.medialVowel;
    }

    public HangulFinalConsonant getFinalConsonant(){
        return this.finalConsonant;
    }

    public ArrayList<HangulJamo> getJamoGroup(){
        return new ArrayList<>(Arrays.asList(this.getInitialConsonant(), this.getMedialVowel(), this.getFinalConsonant()));
    }
}