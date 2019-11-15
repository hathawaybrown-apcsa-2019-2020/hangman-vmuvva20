
/**
 * Write a description of class HangmanGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HangmanGame
{

  private String gameStatus = "";
  private String secretWord;
  private String guessedLetters = "";
  
  public HangmanGame(String secretWord)
  {
      this.secretWord = secretWord;
      this.gameStatus = gameStatus;
      this.guessedLetters = guessedLetters;
      for (int i = 0; i <= secretWord.length() - 1; i++)
      {
          if (Character.isLetter(secretWord.charAt(i)))
            {
                gameStatus += "-"; 
            }
          else
            {
                gameStatus += secretWord.charAt(i);
            }
      }
  }
  
  public String getGuessed()
  {
      return gameStatus;
  }
  
  public String getTried()
  {
      return guessedLetters;
  }
  
  public int tryLetter(char s)
  {
      for (int i = 0; i < secretWord.length(); i++)
      {
          if (secretWord.charAt(i) == s)
          {
              gameStatus = gameStatus.substring(0, i) + s + gameStatus.substring(i + 1);
          }
      }
      
      if (guessedLetters.indexOf(s) >= 0)
      {
        return 0;
      }
      guessedLetters += " " + s;
      
      if (secretWord.indexOf(s) >= 0)
      {
        return 1;
      }
 
      else
      {
          return -1;
      }
        
      
  }
  
  
}
