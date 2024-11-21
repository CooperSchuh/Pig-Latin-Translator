import java.lang.*;

public class PigLatinTranslator
{
  public static Book translate(Book input)
  {
    Book translatedBook = new Book();

    String title = input.getTitle();
    title = translate(title);
    translatedBook.setTitle(title);

    for (int q = 0; q<input.getLineCount(); q++){
      String line = input.getLine(q);
      translatedBook.appendLine(translate(line));
    }

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
    String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int c = 0;
    int ch = 0;
    if (!input.isEmpty()){
      while (i<n){
          if (letters.indexOf(input.charAt(i)) != -1){
            trueOrFalse += "T";
          }
          else {
            trueOrFalse += "F";
          }
          i++;
      }
    }
    while (!trueOrFalse.isEmpty() && !input.isEmpty() && ch<100){
      while( !trueOrFalse.isEmpty() && trueOrFalse.charAt(0) == 'T' && !input.isEmpty() && c<100){
        characters += input.substring(0, 1);
        trueOrFalse = trueOrFalse.substring(1);
        input = input.substring(1);
        c++;
      }
      c = 0;
      line += translateWord(characters);
      characters = "";
      while(!trueOrFalse.isEmpty() && trueOrFalse.charAt(0) == 'F' && !input.isEmpty() && c<100){
        line += input.substring(0, 1);
        trueOrFalse = trueOrFalse.substring(1);
        input = input.substring(1);
        c++;
      }
      ch++;
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
    boolean allCaps = false;
    if (input.equals(input.toUpperCase()) && !input.isBlank()) {
      allCaps = true; 
  }  
    String word = input;
    String vowels = "AEIOUaeiou";
    String a = "";
    boolean capitalize = false;
    int c = 0;
    if (!word.isEmpty()){
      a = word.substring(0,1).toUpperCase();
      if (word.substring(0, 1).equals(a)){
        capitalize = true;
      }
    }
    if (!word.isEmpty()){
      word = word.substring(0, 1).toLowerCase() + word.substring(1);
      while (vowels.indexOf(word.charAt(0)) == -1 && c<100){
        // idk why i need the c but i do
        word = word.substring(1)+ word.substring(0,1);
        c++;
      }
      word += "ay";
      
    }
    if (capitalize == true){
      word = word.substring(0,1).toUpperCase() + word.substring(1);
    }
    if (allCaps == true){
      word = word.toUpperCase();
    }

    
    return word;
  }
  

  // Add additonal private methods here.
  // For example, I had one like this:
  // private static String capitalizeFirstLetter(String input)

}