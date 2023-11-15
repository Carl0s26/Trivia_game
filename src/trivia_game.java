import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



         
              
        



public class trivia_game {

    static void question_repeter(int random_int, ArrayList<String> choosed_questions, Random random){
        for (String q : choosed_questions) {
            if (q.equals(String.valueOf(random_int))) {
                random_int = random.nextInt(20);
                question_repeter(random_int, choosed_questions, random);
            }
            else {
                break;
             }
         }
    }



    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner Satoru_gojo = new Scanner(System.in);
        boolean While = true;
        int random_int = 0;
        int questions_chossen = 0;
        String user_choice;
        int user_points = 0;
        ArrayList<String> choosed_questions = new ArrayList<String>();


        




        do {
            random_int = random.nextInt(20);

            question_repeter(random_int, choosed_questions, random);

            switch (random_int) {
                default:
                    break;
                case 0:
                    questions_chossen += 1;
                    choosed_questions.add("0");
                    System.out.println("Is the capital of Mexico called Caracas?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 1:
                    questions_chossen += 1;
                    choosed_questions.add("1");
                    System.out.println("Is 11th the best grade of softwere development?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 2:
                    questions_chossen += 1;
                    choosed_questions.add("2");
                    System.out.println("The I of int is written with Uppercase when defining a variable?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 3:
                    questions_chossen += 1;
                    choosed_questions.add("3");
                    System.out.println("A carbon can only have 4 links?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    questions_chossen += 1;
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 4:
                    questions_chossen += 1;
                    choosed_questions.add("4");
                    System.out.println("Is JavaScript the coding language with most users?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 5:
                    questions_chossen += 1;
                    choosed_questions.add("5");
                    System.out.println("Luffy's devil fruit is called the Yami Yami");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }break;
                case 6:
                    questions_chossen += 1;
                    choosed_questions.add("6");
                    System.out.println("The most wached anime is Dragon Ball");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }break;
                case 7:
                    questions_chossen += 1;
                    choosed_questions.add("7");
                    System.out.println("Fortnite was realeased in 2017");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }break;
                case 8:
                    questions_chossen += 1;
                    choosed_questions.add("8");
                    System.out.println("George Washington was the first president of the us.");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 9:
                    questions_chossen += 1;
                    choosed_questions.add("9");
                    System.out.println("Portagas D Ace had 3 brothers");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 10:
                    questions_chossen += 1;
                    choosed_questions.add("10");
                    System.out.println("Jupiter is the last planet of the solar system");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 11:
                    questions_chossen += 1;
                    choosed_questions.add("11");
                    System.out.println("The first world cup that Germany won was in 1954");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 12:
                    questions_chossen += 1;
                    choosed_questions.add("12");
                    System.out.println("Clash royale have 109 different cards:");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 13:
                    questions_chossen += 1;
                    choosed_questions.add("13");
                    System.out.println("The first color of the rainbow is red");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 14:
                    questions_chossen += 1;
                    choosed_questions.add("14");
                    System.out.println("Don Quixote is the world's most famous book");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 15:
                    questions_chossen += 1;
                    choosed_questions.add("15");
                    System.out.println("Mufasa is the name of the villain in \"The Lion King\" movie.");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 16:
                    questions_chossen += 1;
                    choosed_questions.add("16");
                    System.out.println("The first character introduced by marvel was Captain America");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 17:
                    questions_chossen += 1;
                    choosed_questions.add("17");
                    System.out.println("The identity of darth vader is Luke Skywalker?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 18:
                    questions_chossen += 1;
                    choosed_questions.add("18");
                    System.out.println("Is \".toLowerCase\" objectivly better than \"toUpperCase\"?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }
                    break;
                case 19:
                    questions_chossen += 1;
                    choosed_questions.add("19");
                    System.out.println("There are only 86 oficial gundams");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer, lets continue.");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Wrong Answer, lets continue.");
                    }break;
            }
        } while (questions_chossen < 10);

        System.out.println("Your score was " + user_points);
        if (user_points >= 7) {
            System.out.println("Great job you passed the trivia");
        }
        else{
            System.out.println("You failed the trivia.");
        }
    }
}
