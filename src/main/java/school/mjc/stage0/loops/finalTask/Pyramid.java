package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j == cathetusLength) {
                    System.out.print(1);
                } else if (j == cathetusLength - 1 || j == cathetusLength + 1) {
                    System.out.print(2);
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}


