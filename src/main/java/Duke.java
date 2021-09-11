import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        int listRow = 100;
        int listCol = 3;
        String list[][][] = new String[listRow][listCol][listCol];
        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        Scanner sc = new Scanner(System.in);
        System.out.println(">");
        String input = sc.nextLine();
        System.out.println(input);
        if (input != null) {
            // display list items
            if (input == "list") {
                System.out.println("____________________________________________________________");
                for (int i = 0; i < list.length; i++) {
                    System.out.println(list[i][i][i] + list[i][i][i + 1] + list[i][i][i + 2]);
                    System.out.println(i + 1 + "." + list[i]);
                }
                System.out.println("____________________________________________________________");
            }
            // mark list items as done
            else if (input.contains("done")) {
                for (int i = 0; i < list.length; i++){
                    int listIndex = Integer.parseInt(input.substring(input.length - 1));
                    if (i == listIndex) {
                        list[listIndex][listIndex + 1][listIndex] = "[x]";
                        System.out.println("____________________________________________________________\n" +
                                "Nice! I've marked this task as done: \n" +
                                list[listIndex][listIndex][listIndex] + list[listIndex][listIndex] + "\n" +
                                "____________________________________________________________");
                    }
                }
            }
            // create todo list
            else if (input.contains("todo")) {
                for (int i = 0; i < list.length; i++){
                    int listIndex = Integer.parseInt(input.substring(input.size - 1)) - 1;
                    if (i == listIndex) {
                        list[listIndex][listIndex][listIndex] = "[T]";
                        list[listIndex][listIndex + 1][listIndex] = "[ ]";
                        list[listIndex][listIndex][listIndex + 2] = input.substring(4);
                        System.out.println("____________________________________________________________\n" +
                                "Got it. I've added this task: \n" +
                                list[listIndex][listIndex][listIndex] +
                                list[listIndex][listIndex + 1][listIndex] +
                                list[listIndex][listIndex][listIndex + 2] + "\n" +
                                "Now you have " + list.length + "tasks in the list." + "\n" +
                                "____________________________________________________________");
                    }
                }
            }
            // add items to list
            else {
                for (int i = 0; i < list.length; i++){
                    if (list[i][i] == null) {
                        list[i][i] = i + 1;
                        list[i][i - 1] = input;
                    }
                }
            }

        }
        

        System.out.println("____________________________________________________________");
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println("____________________________________________________________");
        return;
    }
}
