public class StringPractice {
    public static void main(String[] args) {
        // String s1="abc";
        // String s2="Abc";

        // for(int i=0;i<s1.length();i++){
        //     System.out.println(s1.charAt(i));
        // }

        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1==s2);
        // System.out.println(s1.equalsIgnoreCase(s2));
        StringBuilder sb = new StringBuilder("Yash");
        sb.append("Rathore");
        System.out.println(sb);

        sb.replace(2,4,"hi");
        System.out.println(sb);
        

    }
}
