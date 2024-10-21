public class JavaBuil {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Abhijeet");
        name.append(" Sharan");
        System.out.println(name);

        System.out.println(name.length());

        char c = name.charAt(1);
        System.out.println(c);

        String str = name.toString();
        System.out.println(str);

        String s1 = str.toUpperCase();
        System.out.println(s1);

        String s2 = str.toLowerCase();
        System.out.println(s2);

        name.insert(9, "Java ");
        System.out.println(name);

        String sub = name.substring(5,7);
        System.out.println(sub);


        int num = Integer.parseInt("123");
        System.out.println(num);

        String strNum = String.valueOf(123);
        System.out.println(strNum);

    }
}
