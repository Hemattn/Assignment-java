package assignment2;

class customExcepton extends Exception{

    }
    class testcase{
        public static void main(String[] args) {
            try{
                throw new customExcepton();
            }catch(customExcepton e){
                System.out.println("handle exception");
            }
        }
    }
