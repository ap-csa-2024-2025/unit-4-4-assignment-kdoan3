import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String sentence ="peter piper blah";
    int count = 0;
    for (int i = 0; i < sentence.length()-1; i++)
    {
      String pair = sentence.substring(i, i + 2);
      if (pair.equals("pa") || pair.equals("pe") || pair.equals("pi") || pair.equals("po") || pair.equals("pu"))
      {
        count++;
      }
    }
    System.out.println("Contains p after vowel" + count + " times.");
  }

    public static String removeLetter(String Sentence)
    {
      String sentence = "peter piper picked a pack of pickle peppers."
      String sentence2
      int count = 0;
      for (int i = 0; i < sentence.length(); i++)
      {
        String letter = sentence.substring(i, i + 1);
        if (!(letter.equals("e") || letter.equals("t") || letter.equals("a") || letter.equals("i") ||letter.equals("o")))
        {
          sentence2 += letter;
        }
      }
    }
  }

