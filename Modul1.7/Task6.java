public class Task6 {
    public static void main(String[] args) {
        double gb = 35.24;
        double mb = gb * 1024;
        double kb = gb * 1024 * 1024;
        double bytes = gb * 1024 * 1024 * 1024;
        long mbInt = (long) mb;
        long kbInt = (long) kb;
        long bytesInt = (long) bytes;
        double mbFraction = mb - mbInt;
        double kbFraction = kb - kbInt;
        double bytesFraction = bytes - bytesInt;
        System.out.println("Гигабайты: " + gb + " GB");
        System.out.println("Мегабайты: " + mbInt + " MB + " + String.format("%.3f", mbFraction) + " MB");
        System.out.println("Килобайты: " + kbInt + " KB + " + String.format("%.3f", kbFraction) + " KB");
        System.out.println("Байты: " + bytesInt + " B + " + String.format("%.3f", bytesFraction) + " B");
    }
}