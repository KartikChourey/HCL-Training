class StringOperations {

    public static void main(String[] args) {

        String s = " Hello Java ";

        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.charAt(1));
        System.out.println(s.toString());
        System.out.println(s.equals("Java"));
        System.out.println(s.compareTo("Hello"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.startsWith(" "));
        System.out.println(s.endsWith(" "));
        System.out.println(s.matches(".*Java.*"));
        System.out.println(s.substring(1, 6));
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.replace("Java", "World"));

        String[] arr = s.split(" ");
        System.out.println(String.join("-", arr));

        System.out.println(String.valueOf(100));
    }
}
