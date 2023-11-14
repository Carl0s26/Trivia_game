import java.util.Random;
import java.util.Scanner;


public class trivia_game {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner Satoru_gojo = new Scanner(System.in);
        boolean While = true;
        int random_int;
        int questions_chossen = 0;
        String user_choice;

        do {
            random_int = random.nextInt(20);
            switch (random_int) {
                default:
                    break;
                case 0:
                    System.out.println("Question 1");
                    user_choice = Satoru_gojo.nextLine();
                    if (user_choice.toLowerCase(null).equals("yes")) {
                        
                    }
                    else
                    break;

                case 1:
                
                    break;

                case 2:
                
                    break;

                case 3:
                
                    break;

                case 4:
                
                    break;

                case 5:
                
                    break;

                case 6:
                
                    break;

                case 7:
                
                    break;

                case 8:
                
                    break;

                case 9:
                
                    break;

                case 10:
                
                    break;

                case 11:
                
                    break;

                case 12:
                
                    break;

                case 13:
                
                    break;

                case 14:
                
                    break;

                case 15:
                
                    break;

                case 16:
                
                    break;

                case 17:
                
                    break;

                case 18:
                
                    break;

                case 19:
                
                    break;

                
            }
        } while (questions_chossen < 10)
    }
}
