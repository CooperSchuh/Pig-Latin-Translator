public class App {
    public static void main(String[] args)
    {
        /*  Introduction and TODO List

        This project is setup with four main classes:
            1. App - the main application
            2. Book - a class that creates the basic book objects.
                - a Book contains a representation of a real book.
                - Book has methods to read data in from various sources
                - Book also has methods to read data out.
            3. PigLatinTranslator - a static class
                - Used to implement your translator.
                - Has two public methods to take input and return a translated copy.
                    - Book translate(Book input)
                    - String translate(String input)
            4. TestSuite - a simple class that helps you test your work.
                - Just like CodingBat this class tries your code against various cases.
                - It will tell you which cases return expected output or not
         */


        // Run tests, comment out once they pass.
        TestSuite.run();

        // Starter book
        Book input = new Book();

        // Start with a "test" book based on a string.
        // Get this to work, and all the tests to pass first.
        //input.readFromString("Test", "Dog\nCat\nMouse");

        // Example reading from a URL
        input.readFromUrl("The greatest story of the world period 3", "https://www.gutenberg.org/cache/epub/74772/pg74772.txt");

        input.printlines(89, 111111);
        Book output = PigLatinTranslator.translate(input);
        output.printlines(89,111111);
        output.writeToFile();

        Book input2 = new Book();
        input2.readFromUrl("The greatest story of the world period 2", "https://www.gutenberg.org/cache/epub/74771/pg74771.txt");

        input2.printlines(116, 111111);
        Book output2 = PigLatinTranslator.translate(input2);
        output2.printlines(116,111111);
        output2.writeToFile();

        
        Book input3 = new Book();
        input3.readFromUrl("Romeo and Juliette", "https://www.gutenberg.org/cache/epub/1513/pg1513.txt");

        input3.printlines(116, 111111);
        Book output3 = PigLatinTranslator.translate(input3);
        output3.printlines(116,111111);
        output3.writeToFile();
    }
}

