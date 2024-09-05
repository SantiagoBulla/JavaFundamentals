
public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 12Create the necessary variables, loops and flow control to print March as a
         * calendar. The calendar will have:
         * a. A heading with the days of the week
         * b. 5 rows with the days of the month in the correct column
         * c. Assume that March 1 starts on a Friday
         * d. Each week on the calendar should flow from Sunday – Saturday
         * (left to right).
         * e. You can use the function System.out.print() to print
         * information to the console without adding a carriage return
         */

        int count = 1;
        String spaces = "   ";
        System.out.println("Start of output for Challenge Exercise");

        System.out.print("Sun Mon Tue Wed Thu Fri Sat");

        System.out.println();
        while (count <= 31) {
            if (count == 1) {
                for (int i = 0; i < 6; i++) {
                    if (i == 5) {
                        System.out.print(count + spaces);
                    } else {
                        System.out.print("    ");
                    }
                }
            }
            count++;
            if (count > 9) {
                spaces = "  ";
            }
            System.out.print(count + spaces);
            if (count == 2 || count == 9 || count == 16 || count == 23 || count == 30) {
                System.out.println();
            }
        }
    }

}
