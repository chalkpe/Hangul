package com.mcpekorea.hangul;

public class Hangul {
	public static enum Type {
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


	public static boolean hasFinalConsonant(final char unicode){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END){
			throw new CharacterIndexOutOfBoundsException(unicode);
		}
		
		return (unicode - CHAR_BEGIN) % 28 != 0;
	}
	
	public static char getPostposition(final char unicode, final Hangul.Type mode){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END){
			throw new CharacterIndexOutOfBoundsException(unicode);
		}
		
		switch(mode){
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
}
