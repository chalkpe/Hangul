package pe.chalk.hangul;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public class HangulMedialVowel extends HangulJamo {
    public static final HangulMedialVowel JUNGSEONG_A   = new HangulMedialVowel(0x314f); //ㅏ
    public static final HangulMedialVowel JUNGSEONG_AE  = new HangulMedialVowel(0x3150); //ㅐ
    public static final HangulMedialVowel JUNGSEONG_YA  = new HangulMedialVowel(0x3151); //ㅑ
    public static final HangulMedialVowel JUNGSEONG_YAE = new HangulMedialVowel(0x3152); //ㅒ
    public static final HangulMedialVowel JUNGSEONG_EO  = new HangulMedialVowel(0x3153); //ㅓ

    public static final HangulMedialVowel JUNGSEONG_E   = new HangulMedialVowel(0x3154); //ㅔ
    public static final HangulMedialVowel JUNGSEONG_YEO = new HangulMedialVowel(0x3155); //ㅕ
    public static final HangulMedialVowel JUNGSEONG_YE  = new HangulMedialVowel(0x3156); //ㅖ
    public static final HangulMedialVowel JUNGSEONG_O   = new HangulMedialVowel(0x3157); //ㅗ
    public static final HangulMedialVowel JUNGSEONG_WA  = new HangulMedialVowel(0x3158); //ㅘ

    public static final HangulMedialVowel JUNGSEONG_WAE = new HangulMedialVowel(0x3159); //ㅙ
    public static final HangulMedialVowel JUNGSEONG_OE  = new HangulMedialVowel(0x315a); //ㅚ
    public static final HangulMedialVowel JUNGSEONG_YO  = new HangulMedialVowel(0x315b); //ㅛ
    public static final HangulMedialVowel JUNGSEONG_U   = new HangulMedialVowel(0x315c); //ㅜ
    public static final HangulMedialVowel JUNGSEONG_WEO = new HangulMedialVowel(0x315d); //ㅝ

    public static final HangulMedialVowel JUNGSEONG_WE  = new HangulMedialVowel(0x315e); //ㅞ
    public static final HangulMedialVowel JUNGSEONG_WI  = new HangulMedialVowel(0x315f); //ㅟ
    public static final HangulMedialVowel JUNGSEONG_YU  = new HangulMedialVowel(0x3160); //ㅠ
    public static final HangulMedialVowel JUNGSEONG_EU  = new HangulMedialVowel(0x3161); //ㅡ
    public static final HangulMedialVowel JUNGSEONG_YI  = new HangulMedialVowel(0x3162); //ㅢ

    public static final HangulMedialVowel JUNGSEONG_I   = new HangulMedialVowel(0x3163);  //ㅣ
    
    public static final List<HangulMedialVowel> MEDIAL_VOWELS = Collections.unmodifiableList(Arrays.asList( //21
            JUNGSEONG_A,   JUNGSEONG_AE,  JUNGSEONG_YA, JUNGSEONG_YAE, JUNGSEONG_EO,
            JUNGSEONG_E,   JUNGSEONG_YEO, JUNGSEONG_YE, JUNGSEONG_O,   JUNGSEONG_WA,
            JUNGSEONG_WAE, JUNGSEONG_OE,  JUNGSEONG_YO, JUNGSEONG_U,   JUNGSEONG_WEO,
            JUNGSEONG_WE,  JUNGSEONG_WI,  JUNGSEONG_YU, JUNGSEONG_EU,  JUNGSEONG_YI,
            JUNGSEONG_I
    ));

    public static final int LENGTH = MEDIAL_VOWELS.size();

    public HangulMedialVowel(final int integer){
        super(integer);
    }
    public HangulMedialVowel(final char character){
        super(character);
    }

    @Override
    public int getIndex(){
        return MEDIAL_VOWELS.indexOf(this);
    }
}