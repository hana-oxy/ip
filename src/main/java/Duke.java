public class Duke {
    public static void main(String[] args) {
        Scanner sc;
        String[] list;
        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        Scanner sc = new Scanner(System.in)
        System.out.println(">");
        String input = sc.nextLine();
        System.out.println(input);
        if (input == "bye" || input == "Bye") {
            System.out.println("        ____________________________________________________________");
            System.out.println("Bye. Hope to see you again soon!");
            System.out.println("        ____________________________________________________________");
            return;
        }
        else if (input == "list") {
            System.out.println("list");
            System.out.println("        ____________________________________________________________");
            System.out.println("        ____________________________________________________________");
            for (int i = 0; i < list.length; i++) {
                System.out.println(i+1 + "." + list[i]);
            }
            System.out.println("        ____________________________________________________________");
        }
    }
}
