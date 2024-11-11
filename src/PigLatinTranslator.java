import java.lang.*;

public class PigLatinTranslator
{
  public static Book translate(Book input)
  {
    Book translatedBook = new Book();

    // Add code here to populate translatedBook with a translation of the input book.
    // Curent do-nothing code will return an empty book.

    return translatedBook;
  }

  public static String translate(String input)
  {
    // System.out.println("Translate String: '" + input + "'");
    int i = 0;
    String characters = "";
    String line = "";
    int n = input.length();
    String trueOrFalse = "";
    String letters = "abcdefghijklmnopqrstuvwxyz";
    while (i<n){
        if (letters.indexOf(input.charAt(i)) != -1){
          trueOrFalse += "T";
        }
        else {
          trueOrFalse += "F";
          i++;
        }
    }
    while (trueOrFalse.length()>0){
      while(trueOrFalse.charAt(0) == 'T'){
        characters += input.substring(0, 1);
        trueOrFalse = trueOrFalse.substring(1);
        input = input.substring(1);
      }
      line += translateWord(characters);
      characters = "";
      while(trueOrFalse.charAt(0) == 'F'){
        line += input.substring(0, 1);
        trueOrFalse = trueOrFalse.substring(1);
        input = input.substring(1);
      }
    }
    return line;


    // Replace this code to translate a string input.
    // The input to this function could be any English string. 
    // A sentence, paragraph, or a single word. 
    // It should call translateWord at least once.
    
  }

  private static String translateWord(String input)
  {
    // System.out.println("translateWord: '" + input + "'");

    // Replace this code to correctly translate a single word.
    String word = input;
    String vowels = "aeiou";
    word = word.substring(0,1).toLowerCase() + word.substring(1);
    while (vowels.indexOf(word.charAt(0)) == -1){
      word = word.substring(1)+ word.substring(0,1);
    }
    word += "ay";
    //word = word.substring(0,1).toUpperCase() + word.substring(1);

    
    return word;
  }

  // Add additonal private methods here.
  // For example, I had one like this:
  // private static String capitalizeFirstLetter(String input)

}