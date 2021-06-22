import java.io.*;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegualrExpression_ex {

	public static void main(String[] args) {
		String s=" This is Sangeetha from Bangalore. This is my first regualar expression program";
        String patternString=".*Bangalore.*.";
        Pattern pattern=Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(s);
        boolean b=matcher.matches();
        System.out.println("It is a Match?"+b);
        
        String s2="java is object oriented programming language, it is platform independent and it is popular language ";
        String patternString2=".*is*.";
        Pattern pattern2=Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
        Matcher matcher2=pattern.matcher(s2);
        String [] myString2=s2.split("is");
        for(String temp:myString2)
        {
        	System.out.println(temp);
        	
        }
        System.out.println("No of splits:"+myString2.length);
        
	}

}
