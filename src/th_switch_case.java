import java.util.Scanner;

public class th_switch_case {

    public static void main(String[] args){
//        int totalDayInMonth;
//        int month;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter month");
//        month = input.nextInt();
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.printf("month \'%d\' have 31 day ", month);
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.printf("month \'%d\' have 30 day ", month);
//                 break;
//            case 2:
//                System.out.printf("month \'%d\' have 28 or 29 day ", month);
//                break;
//            default:
//                System.out.printf("\'%d\' is not month ", month);
//
//        }
        String dayInMonth;
        int month;

                Scanner input = new Scanner(System.in);
        System.out.println("enter month");
        month = input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                 break;
            case 2:
                dayInMonth = "28 or 29";
                break;
            default:
                dayInMonth = "";
        }

        if (dayInMonth != "") System.out.printf("month %d have %s day ", month,dayInMonth) ;
        else System.out.println("Invalid input");

    }

}
