import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year of birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of birth", 1, 12);

        int day;
        switch (month) {
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day of birth", 1, 29);
                break;
            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(in, "Enter the day of birth", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter the day of birth", 1, 31);
                break;
        }

        int hour = SafeInput.getRangedInt(in, "Enter the hour of birth", 0, 23);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of birth", 0, 59);

        System.out.println("You were born on: " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);
    }
}
