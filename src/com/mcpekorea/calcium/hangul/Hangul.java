package com.mcpekorea.calcium.hangul;

public class Hangul {
	public static enum Mode {
		OBJECT, NOUN, CONJUNCTION;
	}
	
	public static final char CHAR_BEGIN = 0xAC00;  //-> 가
	public static final char CHAR_END = 0xD7A3;    //-> 힣
	
	public static final char CHAR_EUL = 0xC744;    //-> 을
	public static final char CHAR_LEUL = 0xB97C;   //-> 를
	public static final char CHAR_I = 0xC774;      //-> 이
	public static final char CHAR_GA = CHAR_BEGIN; //-> 가
	public static final char CHAR_EUN = 0xC740;    //-> 은
	public static final char CHAR_NEUN = 0xB294;   //-> 는
	
	
	public static boolean hasFinalConsonant(final char unicode){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END)
			throw new CharacterIndexOutOfBoundsException(unicode);
		
		return (unicode - CHAR_BEGIN) % 28 != 0;
	}
	
	public static char getNext(final char unicode, final Hangul.Mode mode){
		if(unicode < CHAR_BEGIN || unicode > CHAR_END)
			throw new CharacterIndexOutOfBoundsException(unicode);
		
		switch(mode){
			case OBJECT:
				return hasFinalConsonant(unicode) ? CHAR_EUL : CHAR_LEUL;
					
			case NOUN:
				return hasFinalConsonant(unicode) ? CHAR_EUN : CHAR_NEUN;
				
			case CONJUNCTION:
				return hasFinalConsonant(unicode) ? CHAR_I : CHAR_GA;
				
			default:
				throw new IllegalArgumentException();
		}
	}
}
