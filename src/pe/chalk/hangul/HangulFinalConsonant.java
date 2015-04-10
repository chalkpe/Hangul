package pe.chalk.hangul;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ChalkPE <amato0617@gmail.com>
 * @since 2015-04-10
 */
public class HangulFinalConsonant extends HangulJamo {
    public static final HangulFinalConsonant JONGSEONG_NONE          = new HangulFinalConsonant(HangulJamo.NONE); //None
    public static final HangulFinalConsonant JONGSEONG_KIYEOK        = new HangulFinalConsonant(0x3131); //ㄱ
    public static final HangulFinalConsonant JONGSEONG_SSANGKIYEOK   = new HangulFinalConsonant(0x3132); //ㄲ
    public static final HangulFinalConsonant JONGSEONG_KIYEOK_SIOS   = new HangulFinalConsonant(0x3133); //ㄳ
    public static final HangulFinalConsonant JONGSEONG_NIEUN         = new HangulFinalConsonant(0x3134); //ㄴ
    public static final HangulFinalConsonant JONGSEONG_NIEUN_CIEUC   = new HangulFinalConsonant(0x3135); //ㄵ
    public static final HangulFinalConsonant JONGSEONG_NIEUN_HIEUH   = new HangulFinalConsonant(0x3136); //ㄶ
    public static final HangulFinalConsonant JONGSEONG_TIKEUT        = new HangulFinalConsonant(0x3137); //ㄷ
    public static final HangulFinalConsonant JONGSEONG_RIEUL         = new HangulFinalConsonant(0x3139); //ㄹ
    public static final HangulFinalConsonant JONGSEONG_RIEUL_KIYEOK  = new HangulFinalConsonant(0x313a); //ㄺ

    public static final HangulFinalConsonant JONGSEONG_RIEUL_MIEUM   = new HangulFinalConsonant(0x313b); //ㄻ
    public static final HangulFinalConsonant JONGSEONG_RIEUL_PIEUP   = new HangulFinalConsonant(0x313c); //ㄼ
    public static final HangulFinalConsonant JONGSEONG_RIEUL_SIOS    = new HangulFinalConsonant(0x313d); //ㄽ
    public static final HangulFinalConsonant JONGSEONG_RIEUL_THIEUTH = new HangulFinalConsonant(0x313e); //ㄾ
    public static final HangulFinalConsonant JONGSEONG_RIEUL_PHIEUPH = new HangulFinalConsonant(0x313f); //ㄿ
    public static final HangulFinalConsonant JONGSEONG_RIEUL_HIEUH   = new HangulFinalConsonant(0x3140); //ㅀ
    public static final HangulFinalConsonant JONGSEONG_MIEUM         = new HangulFinalConsonant(0x3141); //ㅁ
    public static final HangulFinalConsonant JONGSEONG_PIEUP         = new HangulFinalConsonant(0x3142); //ㅂ
    public static final HangulFinalConsonant JONGSEONG_PIEUP_SIOS    = new HangulFinalConsonant(0x3144); //ㅄ
    public static final HangulFinalConsonant JONGSEONG_SIOS          = new HangulFinalConsonant(0x3145); //ㅅ

    public static final HangulFinalConsonant JONGSEONG_SSANGSIOS     = new HangulFinalConsonant(0x3146); //ㅆ
    public static final HangulFinalConsonant JONGSEONG_IEUNG         = new HangulFinalConsonant(0x3147); //ㅇ
    public static final HangulFinalConsonant JONGSEONG_CIEUC         = new HangulFinalConsonant(0x3148); //ㅈ
    public static final HangulFinalConsonant JONGSEONG_CHIEUCH       = new HangulFinalConsonant(0x314a); //ㅊ
    public static final HangulFinalConsonant JONGSEONG_KHIEUKH       = new HangulFinalConsonant(0x314b); //ㅋ
    public static final HangulFinalConsonant JONGSEONG_THIEUTH       = new HangulFinalConsonant(0x314c); //ㅌ
    public static final HangulFinalConsonant JONGSEONG_PHIEUPH       = new HangulFinalConsonant(0x314d); //ㅍ
    public static final HangulFinalConsonant JONGSEONG_HIEUH         = new HangulFinalConsonant(0x314e); //ㅎ

    public static final List<HangulFinalConsonant> FINAL_CONSONANTS = Collections.unmodifiableList(Arrays.asList( //28
            JONGSEONG_NONE,        JONGSEONG_KIYEOK,      JONGSEONG_SSANGKIYEOK, JONGSEONG_KIYEOK_SIOS,   JONGSEONG_NIEUN,
            JONGSEONG_NIEUN_CIEUC, JONGSEONG_NIEUN_HIEUH, JONGSEONG_TIKEUT,      JONGSEONG_RIEUL,         JONGSEONG_RIEUL_KIYEOK,
            JONGSEONG_RIEUL_MIEUM, JONGSEONG_RIEUL_PIEUP, JONGSEONG_RIEUL_SIOS,  JONGSEONG_RIEUL_THIEUTH, JONGSEONG_RIEUL_PHIEUPH,
            JONGSEONG_RIEUL_HIEUH, JONGSEONG_MIEUM,       JONGSEONG_PIEUP,       JONGSEONG_PIEUP_SIOS,    JONGSEONG_SIOS,
            JONGSEONG_SSANGSIOS,   JONGSEONG_IEUNG,       JONGSEONG_CIEUC,       JONGSEONG_CHIEUCH,       JONGSEONG_KHIEUKH,
            JONGSEONG_THIEUTH,     JONGSEONG_PHIEUPH,     JONGSEONG_HIEUH
    ));

    public static final int LENGTH = FINAL_CONSONANTS.size();

    public HangulFinalConsonant(final int integer){
        super(integer);
    }
    public HangulFinalConsonant(final char character){
        super(character);
    }

    @Override
    public int getIndex(){
        return FINAL_CONSONANTS.indexOf(this);
    }
}