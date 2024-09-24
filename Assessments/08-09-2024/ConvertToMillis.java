public class ConvertToMillis {
    public static void main(String[] args) {
        System.out.println(convertMillis(1000));
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
