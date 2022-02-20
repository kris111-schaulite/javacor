package lesson2;

    public class MyDataEx extends Exception {

        public MyDataEx(String s, int row, int col) {
            System.out.println("Can't convert char '" + s + "' in [" + row + "][" + col + "]");
        }
}
