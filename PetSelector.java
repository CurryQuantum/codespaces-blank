import java.util.*;
// ernest pedregosa delserieys
// 10/16/2025
//this class finds the best pet for you based on your name , favorit color and season
public class PetSelector {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("give me a name?");
    String name = input.nextLine().toLowerCase();
    System.out.println("give me a color? Red, Blue, Green");
    String color = input.nextLine().toLowerCase();
    System.out.println("give me a season?");
    String season = input.nextLine().toLowerCase();
    char firstChar = name.charAt(0);
    boolean vowel;
    if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
      vowel = true;
    } else {
      vowel = false;
    }
    getPet(season, color, vowel);

  }

  public static void getPet(String S, String C, Boolean F) {
    if ("blue".equals(C)) {
      if ("fall".equals(S)) {
        System.out.println("your pet should be an alligator");
        return;
      } else if ("spring".equals(S)) {
        System.out.println("your pet should be an ostrich");
        return;
      } else if (!F) {
        if (!"summer".equals(S) && !"fall".equals(S)) {
          System.out.println("your pet should be an axolotl");
          return;
        }
      }
    } else if ("green".equals(C)) {
        // If name starts with a consonant (F == false) and season is winter -> giraffe
        if (!F) {
          if ("winter".equals(S)) {
            System.out.println("your pet should be a giraffe");
            return;
          }

        }
        // If green and season is anything other than fall -> dog (unless already returned with giraffe)
        if (!"fall".equals(S)) {
          System.out.println("your pet should be a dog");
          return;
        }

      }
      else if ("red".equals(C)) {
        if (F) {
          System.out.println("your pet should be a porcupine");
          return;
        }
       else {
        System.out.println("your pet should be a panda");
        return;
      }

    }
     if ("summer".equals(S)) {
        System.out.println("your pet should be a pony");
        return;
      } else {
        System.out.println("your pet should be a pet rock");
        return;
      }

  }

}
