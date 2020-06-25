package pkg3a;

class RangeException extends Exception{
    public String toString(){
        return "ERROR MARKS ENTERED SHOULD BE BETWEEN 0 AND 50";
    }
}

public class Driver {
    public static void main(String[] args) throws Exception{
        try{
            String name = args[0];
            int sub1 = Integer.parseInt(args[1]);
            int sub2 = Integer.parseInt(args[2]);
            int sub3 = Integer.parseInt(args[3]);
            int sub4 = Integer.parseInt(args[4]);
            int sub5 = Integer.parseInt(args[5]);
            int sub6 = Integer.parseInt(args[6]);

            if(sub1<0 || sub2<0 || sub3<0 || sub4<0 || sub5<0 || sub6<0 || sub1>50 || sub2>50 || sub3>50 || sub4>50 || sub5>50 || sub6>50){
                throw new RangeException();
            }

            else{
                int totalMarks = sub1+sub2+sub3+sub4+sub5+sub6;
                float percentage = (float)totalMarks/6 ;
                System.out.println(name + " has scored " + totalMarks + " = " + percentage + "%");
            }
        }catch(RangeException e){
            System.out.println("CAUGHT EXCEPTION" + e);
        }
    }
}
