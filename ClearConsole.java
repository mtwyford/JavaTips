public class ClearConsole {
    public static void main(String[] args) {
        System.out.print("\033[2J");
        System.out.flush();
    }
}
