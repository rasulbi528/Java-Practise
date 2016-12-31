/*
 * This source code was written by Behara Gowtham a.k.a Gowtham Siddarth.
 * It is an open source and can be used for development purposes.  * 
 */
package prpexam1;

/**
 *
 * @author Gowtham
 */
public class ValidDate {

    /**
     * Static method to check if the given year is a leap year.
     *
     * @param year
     * @return
     */
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * Static method to check if given string is a valid date representation
     * (DD/MM/YYYY).
     *
     * @param input1
     */
    public static void isValidDate(String input1) {
        String tokens[] = input1.split("-");
        
        try {
            int date = Integer.parseInt(tokens[0]);
            int month = Integer.parseInt(tokens[1]);
            int year = Integer.parseInt(tokens[2]);

            if (date <= 0 || date > 31 || month <= 0 || month > 12 || year <= 0) {
                output1 = false;
            } else {
                java.util.HashMap<Integer, Integer> maxDaysOfMonth = new java.util.HashMap<>();
                maxDaysOfMonth.put(1, 31);
                maxDaysOfMonth.put(3, 31);
                maxDaysOfMonth.put(4, 30);
                maxDaysOfMonth.put(5, 31);
                maxDaysOfMonth.put(6, 30);
                maxDaysOfMonth.put(7, 31);
                maxDaysOfMonth.put(8, 31);
                maxDaysOfMonth.put(9, 30);
                maxDaysOfMonth.put(10, 31);
                maxDaysOfMonth.put(11, 30);
                maxDaysOfMonth.put(12, 31);

                boolean leapYear;

                if (month == 2) {
                    leapYear = isLeapYear(year);
                    if (leapYear && date <= 29) {
                        output1 = true;
                    } else {
                        output1 = date < 29;
                    }
                } else {
                    output1 = date <= maxDaysOfMonth.get(month);
                }

            }
        } catch (java.lang.NumberFormatException ex) {
            output1 = false;
        }
    }

    /**
     * Main method: starting method of program execution.
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO add your handling code here:
        String date;

        date = "27-09-1995";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "03-09-1995";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "29-02-1997";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "31-03-2015";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "30-02-1765";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "31-04-2040";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "02-15-3000";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "37-09-1995";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "29-02-0100";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);

        date = "29-a2-0100";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);
        
        date = "29-02-0400";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);
        
        date = "36-22-2222";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);
        
        date = "29-12-2012";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);
        
        date = "15-12-201c";
        isValidDate(date);

        // The following statement is used to check the output only. Remove, if necessary.
        System.out.println(date + " " + output1);
    }

    // Variables declaration - do not modify
    public static boolean output1;
    // End of variables declaration.
}
