public class SecondTask {
    public static void main(String[] args) {
        int balanceBefore = 100;
        int clientPays = 300;
        int bonuses = 0;


        if (clientPays >= 1000) {
            bonuses += clientPays / 100;
        } else if (clientPays < 1000){
            bonuses = 0;
        }
        System.out.println(" ");
        System.out.println("Bonuses: " + bonuses);
        System.out.println("Final value is " + (balanceBefore + clientPays + bonuses));
    }
}
