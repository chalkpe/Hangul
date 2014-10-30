package com.mcpekorea.calcium.hangul;

public class Hangul {
	public static final int MODE_OBJECT = 0; // 을/를
	public static final int MODE_NOUN = 1; // 은/는
	public static final int MODE_CONJUNCTION = 2; // 이/가
	
	public static final char CHAR_EUL = 51012;//을
	public static final char CHAR_LEUL = 47484;//를
	public static final char CHAR_I = 51060;//이
	public static final char CHAR_GA = 44032;//가
	public static final char CHAR_EUN = 51008;//은
	public static final char CHAR_NEUN = 45716;//는
	
	public static boolean hasConsonant(final char unicode){
		if(unicode < 0xAC00 || unicode > 0xD7AF){
			return false;
		}
		return (unicode-44032)%28 != 0;
	}
	
	public static char getNext(final char unicode){
		
	}
}
