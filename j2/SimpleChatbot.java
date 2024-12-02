import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hi! I'm your friendly chatbot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            // Exit condition
            if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Respond based on keywords
            switch (getKeyword(userInput)) {
                case "hello":
                case "hi":
                    System.out.println("Chatbot: Hello! How can I assist you?");
                    break;
                case "name":
                    System.out.println("Chatbot: My name is Chatbot. What's yours?");
                    break;
                case "time":
                    System.out.println("Chatbot: Sorry, I can't tell the time yet. You can check your device!");
                    break;
                case "help":
                    System.out.println("Chatbot: I'm here to chat! Ask me anything, or just say 'bye' to end.");
                    break;
                case "thanks":
                case "thank you":
                    System.out.println("Chatbot: You're welcome! 😊");
                    break;
                default:
                    System.out.println("Chatbot: I'm not sure I understand. Can you rephrase?");
                    break;
            }
        }

        scanner.close();
    }

    // Function to detect keywords
    private static String getKeyword(String input) {
        if (input.contains("hello") || input.contains("hi")) {
            return "hello";
        } else if (input.contains("name")) {
            return "name";
        } else if (input.contains("time")) {
            return "time";
        } else if (input.contains("help")) {
            return "help";
        } else if (input.contains("thanks") || input.contains("thank you")) {
            return "thanks";
        } else {
            return "unknown";
        }
    }
}
