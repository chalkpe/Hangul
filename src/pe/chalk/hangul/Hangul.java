package pe.chalk.hangul;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hangul {
	public enum Type {
		NOMINATIVE, //-> 이/가
		ACCUSATIVE, //-> 을/를
		COMITATIVE, //-> 과/와
		TOPIC       //-> 은/는
	}

	public static final char CHAR_BEGIN = 0xAC00;  //-> 가
	public static final char CHAR_END   = 0xD7A3;  //-> 힣
	
	public static final char CHAR_EUL  = 0xC744; //-> 을
	public static final char CHAR_LEUL = 0xB97C; //-> 를
	public static final char CHAR_EUN  = 0xC740; //-> 은
	public static final char CHAR_NEUN = 0xB294; //-> 는
	public static final char CHAR_I    = 0xC774; //-> 이
	public static final char CHAR_GA   = 0xAC00; //-> 가
	public static final char CHAR_GWA  = 0xACFC; //-> 과
	public static final char CHAR_WA   = 0xC640; //-> 와
	
	public static final char[] INITIAL_CONSONANTS = new char[]{
	    0x3131, 0x3132, 0x3134, 0x3137, 0x3138, 0x3139, 0x3141, 0x3142, 0x3143, 0x3145, 0x3146, 0x3147, 0x3148, 0x3149, 0x314a, 0x314b, 0x314c, 0x314d, 0x314e
	    //ㄱ, ㄲ, ㄴ, ㄷ, ㄸ, ㄹ, ㅁ, ㅂ, ㅃ, ㅅ, ㅆ, ㅇ, ㅈ, ㅉ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ
	};
	
	public static final Pattern pattern = Pattern.compile("(\\S)\\[\\[(이|가|을|를|과|와|은|는|NOMINATIVE|ACCUSATIVE|COMITATIVE|TOPIC)\\]\\]");
	
	public static Hangul.Type getType(String typeText){
		switch(typeText){
		case "이":
		case "가":
		case "NOMINATIVE":
			return Hangul.Type.NOMINATIVE;

		case "을":
		case "를":
		case "ACCUSATIVE":
			return Hangul.Type.ACCUSATIVE;

		case "과":
		case "와":
		case "COMITATIVE":
			return Hangul.Type.COMITATIVE;
			
		case "은":
		case "는":
		case "TOPIC":
			return Hangul.Type.TOPIC;
			
		default:
			throw new IllegalArgumentException();
		}
	}
	
	public static boolean hasFinalConsonant(final String unicode){
		return hasFinalConsonant(unicode.charAt(unicode.length() - 1));
	}
	
	public static boolean hasFinalConsonant(final char unicode){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END){
			throw new CharacterIndexOutOfBoundsException(unicode);
		}
		
		return (unicode - CHAR_BEGIN) % 28 != 0;
	}
	
	public static char getPostposition(final String unicode, final String type){
		return getPostposition(unicode.charAt(unicode.length() - 1), getType(type));
	}
	
	public static char getPostposition(final char unicode, final String type){
		return getPostposition(unicode, getType(type));
	}
	
	public static char getPostposition(final String unicode, final Hangul.Type type){
		return getPostposition(unicode.charAt(unicode.length() - 1), type);
	}
	
	public static char getPostposition(final char unicode, final Hangul.Type type){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END){
			return getPostposition(CHAR_BEGIN, type);
		}
		
		switch(type){
		case NOMINATIVE:
			return hasFinalConsonant(unicode) ? CHAR_I : CHAR_GA;
			
		case ACCUSATIVE:
			return hasFinalConsonant(unicode) ? CHAR_EUL : CHAR_LEUL;
			
		case COMITATIVE:
			return hasFinalConsonant(unicode) ? CHAR_GWA : CHAR_WA;
			
		case TOPIC:
			return hasFinalConsonant(unicode) ? CHAR_EUN : CHAR_NEUN;
			
		default:
			throw new IllegalArgumentException();
		}
	}
	
	public static String format(String format, Object... args){
		format = String.format(format, args);
		Matcher m = pattern.matcher(format);
		
		StringBuffer sb = new StringBuffer(format.length());
		while(m.find()){
			m.appendReplacement(sb, m.group(1).concat(String.valueOf(getPostposition(m.group(1), getType(m.group(2))))));
		}
		m.appendTail(sb);
		
		return sb.toString();
	}
}