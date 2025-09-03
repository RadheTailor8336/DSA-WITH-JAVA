package strings;

public class indexOf {
    public static void main(String[] args) {
        String s = "Raghav";
        System.out.println(s.indexOf('z'));;
        System.out.println(s.indexOf('a'));; // first occuring character ko print krta hai
        System.out.println(s.lastIndexOf('a'));; //return last occuring char if(already occru)

        String a = "abc";
        String b = "abc";
        System.out.println(a.compareTo(b)); // it return the differnce in Ascii values

        String c = "Physics Wallah Skills";
        System.out.println(c.contains("Skills"));

        System.out.println(c.startsWith("Phy")); // check krta hain ki word start ho rha hain vo shi hain ki nhi - output true
        System.out.println(c.endsWith("lls")); // end check krta hai



    }
}
