package lesson2;

public class Main {


    public static void main(String[] args) {
        String[][] arr1 = {
                {"6", "6", "6", "6"},
                {"6", "6", "6", "6"},
                {"6", "6", "6", "6"},
                {"6", "6", "6", "6"}
        };

        String[][] arr2 = {
                {"6", "6", "6", "6"},
                {"6", "6", "6"},
                {"6", "6", "6", "6"},
                {"6", "6", "6", "6"}
        };

        String[][] arr3 = {
                {"6", "6", "6", "6"},
                {"6", "6", "6", "6"},
                {"6", "6", "x", "6"},
                {"6", "6", "6", "6"}
        };

        // для каждого метода свой создать блок трай кэтч с эксепшином
        try {
            System.out.println(convertAndSum(arr1));
            System.out.println(convertAndSum(arr2));
            System.out.println(convertAndSum(arr3));

        } catch (MySizeEx e) {
            System.out.println("Wrong array length");
        } catch (MyDataEx ignored) {
        }


    }

    public static int convertAndSum(String[][] arr) throws MySizeEx, MyDataEx {

        int sum = 0;
        int convert;
        String regex = "[a-zA-Z]";

        for (int row = 0; row < arr.length; row++) {
            if (arr.length != 4 || arr[row].length != 4) {
                throw new MySizeEx();
            }
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col].matches(regex)) {
                    throw new MyDataEx(arr[row][col], row, col);
                } else {
                    convert = Integer.parseInt(arr[row][col]);
                    sum += convert;
                }
            }
        }
        return sum;
    }
}
