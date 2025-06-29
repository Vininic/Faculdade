package Ex3;
//Ex 3
public class SomaVet {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {6, 7, 8, 9, 10};
        int[] vetor3 = new int[5];

        for (int i = 0; i < 5; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.print("vetor1 [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor1[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("+ vetor2 [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor2[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("= vetor3 [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor3[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}