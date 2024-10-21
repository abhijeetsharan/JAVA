public class StringBuff {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Abhijeet");
        name.append(" Sharan");
        System.out.println(name);

        name.insert(9, "Java ");
        System.out.println(name);

        String sub = name.substring(5, 7);
        System.out.println(sub);

    }
}
