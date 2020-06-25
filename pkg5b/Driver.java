package pkg5b;

class RandomClass{
    @Override
    public String toString() {
        return "GOOD MORNING";
    }
}

public class Driver {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c' , 'd' , 'e' , 'f'};
        String str = new String(arr,2,3);
        System.out.println(str);

        String str1, str2, strRes;
        str1 = "Hello World";
        str2 = "BMS College";
        strRes = str1+ str2;
        System.out.println(strRes);

        RandomClass obj = new RandomClass();
        System.out.println(obj);

        StringBuilder strHello = new StringBuilder("Hello");
        strHello.deleteCharAt(2);
        strHello.insert(2,'x');
        System.out.println(strHello);

        String convertToChar = "This is java programming";
        char[] charArray = convertToChar.toCharArray();
        System.out.println(charArray);

        String s1 = "hello world";
        String s2 = new String("hello world");
        String s3 = "bms college";

        System.out.println("Comparing s1 and s2: " + s1.equals(s2));
        System.out.println("Comparing s1 and s2: " + s1.equals(s3));

        if(s1.compareTo(s2) == 0)
            System.out.println("s1 and s2 are equal");
        else
            System.out.println("s1 and s2 are not equal");

        if(s1.compareTo(s3) == 0)
            System.out.println("s1 and s3 are equal");
        else
            System.out.println("s1 and s3 are not equal");

        System.out.println("Doing a region match"+ s1.regionMatches(3,s2,3,4));

        if(s1 == s2)
            System.out.println("s1 == s2");
        else
            System.out.println("s1 !== s2");

        String search1, search2;
        search1 = "good morning";
        search2 = "morning is started";

        System.out.println("Does s1 have good : "+search1.contains("good"));
        System.out.println("Extracting good from good morning "+search1.substring(0,4));

        s1 = "Hello World";
        String greeting = s1.replace("Hello", "Greetings");
        System.out.println(greeting);

        s1 = "Hello BMSCE Good Morning";
        System.out.println(s1.replace(" ", ""));

        StringBuilder sb1=new StringBuilder("xyz");
        sb1.append(" "+ 24);
        sb1.append(" aditya@gmail.com");
        sb1.append(" 7909857898");
        System.out.println("Resultant string is: "+sb1);

    }
}
