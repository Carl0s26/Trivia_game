import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class trivia_game {

    // if check_question == true then there is a repeated variable and the question repeater calls itself again after changing the random number making it a infinite loop until it becomes false

    // static boolean check_question(int random_int, ArrayList<Integer> choosed_questions) {
    //     for (int i = 0; i < choosed_questions.size(); i++) {
    //         if (choosed_questions.get(i) == random_int) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // static void question_repeter(int random_int, ArrayList<Integer> choosed_questions, Random random) {
    //     if (choosed_questions.contains(random_int)) {
    //         random_int = random.nextInt(20);
    //         if (check_question(random_int, choosed_questions) == true) {
    //             question_repeter(random_int, choosed_questions, random);
    //         } else {
    //             ;
    //         }
    //     }
    // }

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner Satoru_gojo = new Scanner(System.in);
        boolean While = true;
        int random_int = 0;
        int questions_chossen = 0;
        String user_choice;
        int user_points = 0;
        ArrayList<Integer> choosed_questions = new ArrayList<Integer>();

        do {
            random_int = random.nextInt(20);

            if (!choosed_questions.contains(random_int)) {
                switch (random_int) {
                default:
                    break;
                case 0:
                    questions_chossen += 1;
                    choosed_questions.add(0);
                    System.out.println("Is the capital of Mexico called Caracas?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 1:
                    questions_chossen += 1;
                    choosed_questions.add(1);
                    System.out.println("Is 11th the best grade of softwere development?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 2:
                    questions_chossen += 1;
                    choosed_questions.add(2);
                    System.out.println("The I of int is written with Uppercase when defining a variable?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    questions_chossen += 1;
                    choosed_questions.add(3);
                    System.out.println("Is 4 the highest amount of links a carbon can have?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    questions_chossen += 1;
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    questions_chossen += 1;
                    choosed_questions.add(4);
                    System.out.println("Is JavaScript the coding language with most users?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    questions_chossen += 1;
                    choosed_questions.add(5);
                    System.out.println("Luffy's devil fruit is called the Yami Yami");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    questions_chossen += 1;
                    choosed_questions.add(6);
                    System.out.println("The most wached anime is Dragon Ball");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 7:
                    questions_chossen += 1;
                    choosed_questions.add(7);
                    System.out.println("Fortnite was realeased in 2017");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 8:
                    questions_chossen += 1;
                    choosed_questions.add(8);
                    System.out.println("George Washington was the first president of the US.");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 9:
                    questions_chossen += 1;
                    choosed_questions.add(9);
                    System.out.println("Portagas D Ace had 3 brothers");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 10:
                    questions_chossen += 1;
                    choosed_questions.add(10);
                    System.out.println("Jupiter is the last planet of the solar system");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 11:
                    questions_chossen += 1;
                    choosed_questions.add(11);
                    System.out.println("The first world cup that Germany won was in 1954");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 12:
                    questions_chossen += 1;
                    choosed_questions.add(12);
                    System.out.println("Clash royale have 109 different cards:");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 13:
                    questions_chossen += 1;
                    choosed_questions.add(13);
                    System.out.println("The first color of the rainbow is red");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 14:
                    questions_chossen += 1;
                    choosed_questions.add(14);
                    System.out.println("Don Quixote is the world's most famous book");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 15:
                    questions_chossen += 1;
                    choosed_questions.add(15);
                    System.out.println("Mufasa is the name of the villain in \"The Lion King\" movie.");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 16:
                    questions_chossen += 1;
                    choosed_questions.add(16);
                    System.out.println("The first character introduced by marvel was Captain America");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 17:
                    questions_chossen += 1;
                    choosed_questions.add(17);
                    System.out.println("The identity of darth vader is Luke Skywalker?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 18:
                    questions_chossen += 1;
                    choosed_questions.add(18);
                    System.out.println("Is \".toLowerCase\" objectivly better than \".toUpperCase\"?");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("yes")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("no")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
                case 19:
                    questions_chossen += 1;
                    choosed_questions.add(19);
                    System.out.println("There are only 86 oficial gundams");
                    user_choice = Satoru_gojo.nextLine();
                    while (!user_choice.equals("yes") & !user_choice.equals("no")) {
                        System.out.println("Please answer with a yes or no.");
                        user_choice = Satoru_gojo.nextLine();
                    }
                    if (user_choice.toLowerCase().equals("no")) {
                        System.out.println("");
                        System.out.println("Great Answer");
                        System.out.println("");
                        user_points += 1;
                    } else if (user_choice.toLowerCase().equals("yes")) {
                        try {
                            System.out.println("");
                            throw new RuntimeException("Wrong Answer");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("");
                        }
                    }
                    break;
            }
            }
            else{
                random_int = random.nextInt(20);
            }

            
        } while (questions_chossen <= 10);

        System.out.println("Your score was " + user_points);
        if (user_points >= 7) {
            System.out.println("Great job you passed the trivia");
        } else {
            System.out.println("You failed the trivia.");
        }
    }
}
