package Assignment9_17;
//doubt in stripIndent
class Question10{
    public static void main (String[] args) {
        String str="This is a message";
        //it will repeat the variable value count number of times.
        int count=4;
        System.out.println("String :"+str.repeat(count));

        System.out.println(str.strip().equals("message"));
        //checks if the variable is blank or not.
        System.out.println(str.isBlank());
        //text have many spaces at the beginning.
        String text = """      
    Hello, 
    This is a multi-line text block. 
    It has some indentation for readability.
    We can remove the common leading whitespace using stripIndent().
    """;
        System.out.println(text.stripIndent());

        String text1 = "Hello\\nWorld\\t This is my home.";
        System.out.println(text1.translateEscapes());
    }
}
