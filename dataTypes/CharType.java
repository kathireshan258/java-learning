package dataTypes;

public class CharType {
    public static void main(String[] args) {

        //https://symbl.cc for more info on Unicode and Emojis
        //https://unicode.org/emoji/charts/full-emoji-list.html
        //https://www.unicode.org/charts/
        //https://www.unicode.org/Public/UNIDATA/UnicodeData.txt
        char mySimpleChar = 'D';
        char unicodeChar = '\u0044'; // Unicode for 'D'
        char asciiChar = 68; // ASCII value for 'D' or integer value
        System.out.println("Simple Char: " + mySimpleChar);
        System.out.println("Unicode Char: " + unicodeChar);
        System.out.println("ASCII Char: " + asciiChar);

        String emojiChar = "\uD83D\uDE00"; // Unicode for 😀
        System.out.println("Emoji Char: " + emojiChar);
        System.out.println("Accurate count of char:" + emojiChar.codePointCount(0, emojiChar.length()));

        String multiEmojiChar = "\uD83D\uDE00\uD83D\uDE02\uD83D\uDE09"; // 😀😂😉
        System.out.println("Multi Emoji Char: " + multiEmojiChar);
        System.out.println("Accurate count of char:" + multiEmojiChar.codePointCount(0, multiEmojiChar.length()));

        multiEmojiChar.codePoints().forEach(cp ->
                System.out.println("Code point: " + cp + " Character: " + new String(Character.toChars(cp))));
    }
}
