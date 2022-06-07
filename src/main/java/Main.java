public class Main {
    static BinOps bins = new BinOps();

    public static void main(String[] args) {
        String res, arg1, arg2;
        System.out.printf("Проверка работы метода sum:\n%s (%d) плюс %s (%d) равно %s (%d).\n", arg1 = "1001101", Integer.parseInt(arg1, 2)
                , arg2 = "1110000", Integer.parseInt(arg2, 2), res = bins.sum(arg1, arg2), Integer.parseInt(res, 2));
        System.out.printf("Проверка работы метода mult:\n%s (%d) умножить на %s (%d) равно %s (%d).\n", arg1 = "1001101", Integer.parseInt(arg1, 2)
                , arg2 = "1110000", Integer.parseInt(arg2, 2), res = bins.mult(arg1, arg2), Integer.parseInt(res, 2));
    }
}
