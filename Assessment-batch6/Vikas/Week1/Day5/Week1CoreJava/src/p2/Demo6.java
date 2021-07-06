package p2;

public class Demo6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            try {
                System.out.println(i);
                if (i % 5 == 0) {
                    continue;
                }
                try {
                    System.out.println(i);

                    if (i % 3 == 0) {
                        continue;
                    }

                    try {
                        System.out.println(i);
                    } catch (Exception e) {

                    } finally {
                        System.out.println("I'm in inner inner finally");
                    }
                } catch (Exception e) {

                } finally {
                    System.out.println("I'm in inner finally");
                }
            } catch (Exception e) {
            } finally {
                System.out.println("I'm in outer finally");
            }
        }
    }
}