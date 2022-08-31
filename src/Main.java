public class Main {
    public static void main(String[] args) {

        //Задание 1 - 2
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] brr = new double[3];
        double a = 1.57;
        double b = 7.654;
        double c = 9.986;
        brr[0] = a;
        brr[1] = b;
        brr[2] = c;
        boolean[] crr = {true, false, true, false};
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]);
            if (i != brr.length - 1) {
                System.out.print(", ");
            }
        }   ///Пометка для себя: этот и выше варианты вывода в консоль - одинаковы. Разница в написании.
        System.out.println();
        for (int i = 0; i < crr.length - 1; i++) {
            System.out.print(crr[i] + ", ");
        }
        System.out.print(crr[crr.length - 1]);
        System.out.println();

        //Задание 3
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        double[] brrDouble = new double[3];
        double a1 = 1.57;
        double b1 = 7.654;
        double c1 = 9.986;
        brrDouble[0] = a1;
        brrDouble[1] = b1;
        brrDouble[2] = c1;
        boolean[] crrBoolean = {true, false, true, false};
        for (int j = arrInt.length - 1; j > 0; j--) {
            System.out.print(arrInt[j] + ", ");
        }
        System.out.print(arrInt[0]);
        System.out.println();
        for (int j = brrDouble.length - 1; j > 0; j--) {
            System.out.print(brrDouble[j] + ", ");
        }
        System.out.print(brrDouble[0]);
        System.out.println();
        for (int j = crrBoolean.length - 1; j > 0; j--) {
            System.out.print(crrBoolean[j] + ", ");
        }
        System.out.print(crrBoolean[0]);
        System.out.println();

        //Задание 4
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int y = 0; y < arr1.length; y++) {
            if (arr1[y] % 2 != 0) {
                arr1[y]++;
            }
            System.out.print(arr1[y] + ", ");
        }

    }

}
