package Tom;

import java.util.Scanner;

public class TimeConvertedOne {
    private int hrs,mins,secs;
    public String convert(){
        System.out.println("Enter time to be converted: ");
        Scanner scanner = new Scanner(System.in);
        hrs = scanner.nextInt();
        mins = scanner.nextInt();
        secs = scanner.nextInt();
        scanner.close();

        StringBuilder sb = new StringBuilder("The original time of ");
        sb.append(hrs).append(" ").append(mins).append(" ");
        sb.append(secs).append(" has been converted to ");

        int c = (((60 * hrs) + mins) * 60) + secs;
        sb.append(c).append(" seconds");
        return sb.toString();
    }
}
