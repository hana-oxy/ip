public class Duke {
    public static void main(String[] args) {
        Scanner sc;
        String[][] list = new String[][2];
        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        Scanner sc = new Scanner(System.in)
        System.out.println(">");
        String input = sc.nextLine();
        System.out.println(input);
        while (input != "bye" || input != "Bye") {
            if (input == "list") {
                System.out.println("list");
                System.out.println("        ____________________________________________________________");
                System.out.println("        ____________________________________________________________");
                for (int i = 0; i < list.length; i++) {
                    System.out.println(i+1 + "." + list[i]);
                }
                System.out.println("        ____________________________________________________________");
            }
            else if (input.contains("done")) {
                for (int i = 0; i < list.length(); i++){
                    int listIndex = Integer.parseInt(input.substring(input.length() - 1)) - 1;
                    if (i == listIndex) {
                        list[listIndex][listIndex - 1] = "[x]";
                        System.out.println("____________________________________________________________\n" +
                                "     Nice! I've marked this task as done: \n" +
                                list[listIndex][listIndex - 1] + listIndex[listIndex][listIndex] + "\n" +
                                "    ____________________________________________________________");
                    }
                }
            }
            else {
                for (int i = 0; i < list.length(); i++){
                    if (list[i][i] == null) {
                        list[i][i] = {{"[]", input}}
                    }
                }
            }
        }

        System.out.println("        ____________________________________________________________");
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println("        ____________________________________________________________");
        return;
    }
}
