package CacHinh;

public class RectanglePattern {
    public static void main(String[] args) {
        int width = 7;
        int height = 3;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
