class Page244Ex6 {
    public static void main(String[] args) {
        String a = new String();
        a = "My string";

        System.out.println("Исходная строка:  " + a);

        System.out.println("Изменённая строка:  " +
                meth(a));
    }

    public static String meth(String a) {
//        String rightStr;
//        String leftStr;
//        int length = a.length();
//
//        if (length <= 1) {
//            return a;
//        }
//
//        leftStr = a.substring(0, length / 2);
//        rightStr = a.substring(length / 2, length);
//
//        return meth(rightStr) + meth(leftStr);

        if (a.length() <= 1) {
            return a;
        }
        return meth(a.substring(1)) + a.charAt(0);
    }
}
