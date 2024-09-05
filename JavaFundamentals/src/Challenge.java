public class Challenge {
    public static void main(String[] args) {
        int spaces = 4;
        int daysCount = 1;
        boolean printing = false;
        System.out.println("Start of output for Challenge Exercise");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (!printing) {
                    System.out.print("    ");
                    if (j == spaces) {
                        printing = true;
                    }
                } else if (daysCount < 10) {
                    System.out.print(daysCount + "   ");
                    daysCount++;
                } else {
                    System.out.print(daysCount + "  ");
                    daysCount++;
                }
            }
            System.out.println();
        }

        String output = "";

        int x = 2;

        switch (x) {

            case 1:

            case 2:

            case 3:

                output += "one,two,three,";

            case 4:

                output += "four,";

                break;

            case 5:

                output += "five,";

                break;

            default:

                output += "six";

                output += "six";

        }

        System.out.println(output);
    }
}
