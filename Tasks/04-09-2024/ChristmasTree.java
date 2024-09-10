public class ChristmasTree {

    public static void main(String[] args) {        

        for (int dayCount = 1; dayCount <= 12; dayCount++) {
            singVerse(dayCount);
            System.out.println();
        }
    }


    public static void singVerse(int day) {
        System.out.println("On the " + getDayString(day) + " day of Christmas, my true love gave to me...");
        
        switch (day) {
            case 12:
                twelfth();
            case 11:
                eleventh();
            case 10:
                tenth();
            case 9:
                ninth();
            case 8:
                eighth();
            case 7:
                seventh();
            case 6:
                sixth();
            case 5:
                fifth();
            case 4:
                fourth();
            case 3:
                third();
            case 2:
                second();
            case 1:
                first();
                break;
        }
    }


    public static String getDayString(int day) {
        switch (day) {
            case 1: return "first";
            case 2: return "second";
            case 3: return "third";
            case 4: return "fourth";
            case 5: return "fifth";
            case 6: return "sixth";
            case 7: return "seventh";
            case 8: return "eighth";
            case 9: return "ninth";
            case 10: return "tenth";
            case 11: return "eleventh";
            case 12: return "twelfth";
            default: return "";
        }
    }

    
    public static void first() {
        System.out.println("A Partridge in a Pear Tree");
    }


    public static void second() {
        System.out.println("Two Turtle Doves,");
    }

   
    public static void third() {
        System.out.println("Three French Hens,");
    }

    
    public static void fourth() {
        System.out.println("Four Calling Birds,");
    }

  
    public static void fifth() {
        System.out.println("Five Golden Rings,");
    }

    
    public static void sixth() {
        System.out.println("Six Geese a-Laying,");
    }


    public static void seventh() {
        System.out.println("Seven Swans a-Swimming,");
    }

 
    public static void eighth() {
        System.out.println("Eight Maids a-Milking,");
    }

  
    public static void ninth() {
        System.out.println("Nine Ladies Dancing,");
    }


    public static void tenth() {
        System.out.println("Ten Lords a-Leaping,");
    }


    public static void eleventh() {
        System.out.println("Eleven Pipers Piping,");
    }


    public static void twelfth() {
        System.out.println("Twelve Drummers Drumming,");
    }
}
