import java.lang.String;
class StringBuffer
{
    public static void main(String arg[])
    {
        StringBuffer sb = new StringBuffer("This is my college");
        System.out.println("The string sb is: " + sb);
        System.out.println("The length sb is: " + sb.length());
        System.out.println("The capacity sb is: " + sb.capacity());
        System.out.println("The character at an index of 5 is: " + sb.charAt(6));
        sb.setCharAt(3,'x');
        System.out.println("After setting char x at position 3: " + sb);
        System.out.println("After appending: " + sb.append(" in Mumbai"));
        System.out.println("After inserting: " + sb.insert(19, "SAKEC"));
        System.out.println("After deleting: " + sb.delete(19,24));
    }
}