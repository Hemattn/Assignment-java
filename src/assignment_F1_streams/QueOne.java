package assignment_F1_streams;

public class QueOne {
    public static void main(String[] args) {
        //If n1 is greater than n2 return true else return false.
        GreaterNumber g=(int n1 ,int n2) -> {
            boolean ans=false;
            if(n1>n2){
                ans=true;
            }
            return ans;
        };

        System.out.println(g.GreaterThan(10,20));

        //Increment by one will return a number incremented by 1
        IncrementByOne i= (int num1)->{return ++num1; };
        System.out.println(i.Increment(12));


        //Concatenate 2 strings
        ConcatenateTwoStrings c= (String s1, String s2) ->{ return s1+s2;};
        System.out.println(c.Concatenate2Strings("Hema", "Patidar"));

        //Convert to uppercase
        ConvertToUpperCase u =(String s)-> {
            String output=s.toUpperCase() ;
            return output;
        };
        System.out.println(u.UpperCase("dog"));
        }

    }


