package solidDemo;

/*
class LinkedIn {
    void newPost(String message) {
        if(message.charAt(0).equals("#")) {
            System.out.println("It's a hashtag!");
        }
        else  {
            System.out.println("It's a general text");
        }
    }
}
*/

class LinkedIn
{
  char extractChar (String message)
  {
    char s = message.charAt (0);
      return s;
  }
}

class Hashtag extends LinkedIn
{
  public void printHashTag ()
  {
    if (super.extractChar ("#competitive_coders") == '#')

      System.out.println ("It's a hashtag!");
  }
}
class Gentext extends LinkedIn
{
  public void printGenText ()
  {
    if (super.extractChar ("abc") != '#')
      {
	System.out.println ("-------------------");
	System.out.println ("It's a general text");
      }
  }
}
class Mention extends LinkedIn
{
  public void printMention ()
  {
    if (super.extractChar ("@zemosolabs") == '@')
      {
	System.out.println ("-------------------");
	System.out.println ("It's @ Mention");
      }
  }
}

public class OpenClosedPrinciple 
{
  public static void main (String[]args)
  {
    Hashtag ht = new Hashtag ();
      ht.printHashTag ();
    Gentext gt = new Gentext ();
      gt.printGenText ();
    Mention mt = new Mention ();
      mt.printMention ();

  }
}
//implementing new feature is not possible,it makes our code rigid
