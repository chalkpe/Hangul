package com.mcpekorea.calcium.hangul;

public class Hangul {
	public static enum Mode {
		OBJECT,      //-> 을/를
		NOUN,        //-> 은/는
		CONJUNCTION, //-> 이/가
		AND,         //-> 과/와
		PRONOUN;     //-> 아/야
	}
	
	public static final char CHAR_BEGIN = 0xAC00;  //-> 가
	public static final char CHAR_END = 0xD7A3;    //-> 힣
	
	public static final char CHAR_EUL = 0xC744;    //-> 을
	public static final char CHAR_LEUL = 0xB97C;   //-> 를
	public static final char CHAR_EUN = 0xC740;    //-> 은
	public static final char CHAR_NEUN = 0xB294;   //-> 는
	public static final char CHAR_I = 0xC774;      //-> 이
	public static final char CHAR_GA = CHAR_BEGIN; //-> 가
	public static final char CHAR_GWA = 0xACFC;    //-> 과
	public static final char CHAR_WA = 0xC640;     //-> 와
	public static final char CHAR_A = 0xC544;      //-> 아
	public static final char CHAR_YA = 0xC57C;     //-> 야
	
	
	public static boolean hasFinalConsonant(final char unicode){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END)
			throw new CharacterIndexOutOfBoundsException(unicode);
		
		return (unicode - CHAR_BEGIN) % 28 != 0;
	}
	
	public static char getPostposition(final char unicode, final Hangul.Mode mode){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END)
			throw new CharacterIndexOutOfBoundsException(unicode);
		
		switch(mode){
			case OBJECT:
				return hasFinalConsonant(unicode) ? CHAR_EUL : CHAR_LEUL;
					
			case NOUN:
				return hasFinalConsonant(unicode) ? CHAR_EUN : CHAR_NEUN;
				
			case CONJUNCTION:
				return hasFinalConsonant(unicode) ? CHAR_I : CHAR_GA;
			
			case AND:
				return hasFinalConsonant(unicode) ? CHAR_GWA : CHAR_WA;
			
			case PRONOUN:
				return hasFinalConsonant(unicode) ? CHAR_A : CHAR_YA;
				
			default:
				throw new IllegalArgumentException();
		}
	}
}
