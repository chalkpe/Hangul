package pe.chalk.hangul;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public class HangulInitialConsonant extends HangulJamo {
    public static final HangulInitialConsonant CHOSEONG_KIYEOK      = new HangulInitialConsonant(0x3131); //ㄱ
    public static final HangulInitialConsonant CHOSEONG_SSANGKIYEOK = new HangulInitialConsonant(0x3132); //ㄲ
    public static final HangulInitialConsonant CHOSEONG_NIEUN       = new HangulInitialConsonant(0x3134); //ㄴ
    public static final HangulInitialConsonant CHOSEONG_TIKEUT      = new HangulInitialConsonant(0x3137); //ㄷ
    public static final HangulInitialConsonant CHOSEONG_SSANGTIKEUT = new HangulInitialConsonant(0x3138); //ㄸ

    public static final HangulInitialConsonant CHOSEONG_RIEUL       = new HangulInitialConsonant(0x3139); //ㄹ
    public static final HangulInitialConsonant CHOSEONG_MIEUM       = new HangulInitialConsonant(0x3141); //ㅁ
    public static final HangulInitialConsonant CHOSEONG_PIEUP       = new HangulInitialConsonant(0x3142); //ㅂ
    public static final HangulInitialConsonant CHOSEONG_SSANGPIEUP  = new HangulInitialConsonant(0x3143); //ㅃ
    public static final HangulInitialConsonant CHOSEONG_SIOS        = new HangulInitialConsonant(0x3145); //ㅅ

    public static final HangulInitialConsonant CHOSEONG_SSANGSIOS   = new HangulInitialConsonant(0x3146); //ㅆ
    public static final HangulInitialConsonant CHOSEONG_IEUNG       = new HangulInitialConsonant(0x3147); //ㅇ
    public static final HangulInitialConsonant CHOSEONG_CIEUC       = new HangulInitialConsonant(0x3148); //ㅈ
    public static final HangulInitialConsonant CHOSEONG_SSANGCIEUC  = new HangulInitialConsonant(0x3149); //ㅉ
    public static final HangulInitialConsonant CHOSEONG_CHIEUCH     = new HangulInitialConsonant(0x314a); //ㅊ

    public static final HangulInitialConsonant CHOSEONG_KHIEUKH     = new HangulInitialConsonant(0x314b); //ㅋ
    public static final HangulInitialConsonant CHOSEONG_THIEUTH     = new HangulInitialConsonant(0x314c); //ㅌ
    public static final HangulInitialConsonant CHOSEONG_PHIEUPH     = new HangulInitialConsonant(0x314d); //ㅍ
    public static final HangulInitialConsonant CHOSEONG_HIEUH       = new HangulInitialConsonant(0x314e); //ㅎ

    public static final List<HangulInitialConsonant> INITIAL_CONSONANTS = Collections.unmodifiableList(Arrays.asList( //19
            CHOSEONG_KIYEOK,    CHOSEONG_SSANGKIYEOK, CHOSEONG_NIEUN,   CHOSEONG_TIKEUT,     CHOSEONG_SSANGTIKEUT,
            CHOSEONG_RIEUL,     CHOSEONG_MIEUM,       CHOSEONG_PIEUP,   CHOSEONG_SSANGPIEUP, CHOSEONG_SIOS,
            CHOSEONG_SSANGSIOS, CHOSEONG_IEUNG,       CHOSEONG_CIEUC,   CHOSEONG_SSANGCIEUC, CHOSEONG_CHIEUCH,
            CHOSEONG_KHIEUKH,   CHOSEONG_THIEUTH,     CHOSEONG_PHIEUPH, CHOSEONG_HIEUH
    ));

    public static final int LENGTH = INITIAL_CONSONANTS.size();

    public HangulInitialConsonant(final int integer){
        super((char) integer);
    }
    public HangulInitialConsonant(final char character){
        super(character);
    }

    @Override
    public int getIndex(){
        return INITIAL_CONSONANTS.indexOf(this);
    }
}