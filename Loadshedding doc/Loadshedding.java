import java.util.Scanner;
import java.lang.Integer;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Loadshedding {

    public static void main(String[] args) {

        // Receiving the day of the month from the computers clock
        DateTimeFormatter dayOfMonth = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();
        String dates = dayOfMonth.format(now);

        // Creating new scanner
        Scanner scanner = new Scanner(System.in);

        // If you want to test out different dates uncomment the 2 lines below and comment out line 13

        // System.out.print("Please enter a date: ");
        // String dates = scanner.nextLine();

        // The next few lines are interpreting the date and assigning an array called matrix with the corresponding loadshedding regions

        int[][] matrix = new int[12][2];
        int k = 9;
        int g;
        if (dates.equals("1") || dates.equals("3") || dates.equals("17") || dates.equals("19")) {
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = t + 1;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                    }
                }
            }
        }
        if (dates.equals("2") || dates.equals("4") || dates.equals("18") || dates.equals("20")) {
            k = 5;
            g = 13;
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = g;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                        g++;
                        if (g > 16) {
                            g = 1;
                        }
                    }
                }
            }
        }

        if (dates.equals("5") || dates.equals("7") || dates.equals("21") || dates.equals("23")) {
            k = 10;
            g = 2;
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = g;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                        g++;
                        if (g > 16) {
                            g = 1;
                        }
                    }
                }
            }
        }

        if (dates.equals("6") || dates.equals("8") || dates.equals("22") || dates.equals("24")) {
            k = 6;
            g = 14;
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = g;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                        g++;
                        if (g > 16) {
                            g = 1;
                        }
                    }
                }
            }
        }

        if (dates.equals("9") || dates.equals("11") || dates.equals("25") || dates.equals("27")) {
            k = 11;
            g = 3;
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = g;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                        g++;
                        if (g > 16) {
                            g = 1;
                        }
                    }
                }
            }
        }

        if (dates.equals("10") || dates.equals("12") || dates.equals("26") || dates.equals("28")) {
            k = 7;
            g = 15;
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = g;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                        g++;
                        if (g > 16) {
                            g = 1;
                        }
                    }
                }
            }
        }
        if (dates.equals("13") || dates.equals("15") || dates.equals("29") || dates.equals("31")) {
            k = 12;
            g = 4;
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = g;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                        g++;
                        if (g > 16) {
                            g = 1;
                        }
                    }
                }
            }
        }

        if (dates.equals("14") || dates.equals("16")) {
            k = 8;
            g = 16;
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    matrix[t][p] = g;
                    if (p == 1) {
                        matrix[t][p] = k;
                        k++;
                        if (k > 16) {
                            k = 1;
                        }
                        g++;
                        if (g > 16) {
                            g = 1;
                        }
                    }
                }
            }
        }

        // Creating start times and end times
        String[] f = new String[]{"00:00", "02:00", "04:00", "06:00", "08:00", "10:00", "12:00", "14:00", "16:00", "18:00", "20:00", "22:00"};
        String[] c = new String[]{"02:30", "04:30", "06:30", "08:30", "10:30", "12:30", "14:30", "16:30", "18:30", "20:30", "22:30", "00:30"};

        System.out.print("Please enter a region or type Exit: ");
        String reg = scanner.nextLine();

        // Ensures the program loops
        while (!reg.equals("Exit")) {
            System.out.println("Your Load shedding schedule in region " + reg + ":");

            // This iterate through the matrix array to find the corresponding region you entered
            for (int t = 0; t < 12; t++) {
                for (int p = 0; p < 2; p++) {
                    if (Integer.parseInt(reg) == matrix[t][p]) {

                        DateTimeFormatter tofday = DateTimeFormatter.ofPattern("HH:mm");

                        // Just converting certain values of time from strings into integers for time calculations
                        String str = tofday.format(now);
                        char fday = str.charAt(0);
                        char sday = str.charAt(1);
                        char tday = str.charAt(3);
                        char foday = str.charAt(4);

                        // Corresponding ACII characters
                        int fdigit = fday - '0';
                        int sdigit = sday - '0';
                        int thd = tday - '0';
                        int fth = foday - '0';

                        // Integer variables for hours and minutes
                        int hour = (fdigit * 10) + sdigit;
                        int min = (thd * 10) + fth;

                        // Converting loadshedding start time from strings into integers
                        String loadt = f[t];
                        char fd = loadt.charAt(0);
                        char sd = loadt.charAt(1);
                        char td = loadt.charAt(3);
                        char fdgt = loadt.charAt(4);

                        int fdg = fd - '0';
                        int sdg = sd - '0';
                        int nom3 = td - '0';
                        int nom4 = fdgt - '0';

                        int h = (fdg * 10) + sdg;

                        // Converting loadshedding end times into integers
                        String loade = c[t];
                        char nom1 = loade.charAt(0);
                        char nom2 = loade.charAt(1);

                        int nomd1 = nom1 - '0';
                        int nomd2 = nom2 - '0';

                        int hend = (nomd1 * 10) + nomd2;

                        // Returning the Start time and end time of the loadshedding
                        System.out.println("Start time " + f[t] + " to " + c[t]);
                        System.out.println();

                        // The following code is just to calculate the time remaining for loadshedding on the cases where the region is entered during loadshedding
                            if (hour <= hend && hour >= h) {
                                if (hour == hend && min > 30) {
                                    System.out.println("Refer to times above");
                                } else if (hour == hend && min < 30) {
                                    int diff = 30 - min;
                                    System.out.println("You are currently loadshedding and have " + diff + " minute(s) of loadshedding remaining");
                                } else if (hend - hour == 1 && min > 30) {
                                    int diff = 60 - min + 30;
                                    System.out.println("You are currently loadshedding and have " + diff + " minute(s) of loadshedding remaining");
                                } else if (hend - hour == 2 && min > 30) {
                                    int hourrem = 1;
                                    int diff = 60 - min + 30;
                                    System.out.println("You are currently loadshedding and have " + hourrem + " hour and " + diff + " minute(s) of loadshedding remaining");
                                }
                                else {
                                    int hourrem = hend - hour;
                                    int diff = 30 - min;
                                    System.out.println("You are currently loadshedding and have " + hourrem + " hours and " + diff + " minute(s) of loadshedding remaining");
                                }
                            }
                            else if(hend == 0 && hour > hend){
                                int hourrem = 24 - hour;
                                int diff = 30 - min;
                                System.out.println("You are currently loadshedding and have " + hourrem + " hours and " + diff + " minute(s) of loadshedding remaining");
                            }
                        }
                    }
                }

                // Reiterate through
                System.out.print("Please enter a region or type Exit to close program: ");
                reg = scanner.nextLine();
            }
        }
    }