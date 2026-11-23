import java.util.Date;
import java.util.Scanner;
import java.util.Locale;
public class exercise {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        //استخدمت Locale.US لانه Scanner لايستطيع يقرأ الرقم العشري
        input.useLocale(Locale.US);

        //Q1
        System.out.println("Enter your Weight(in Kilograms)");
        double Weight=input.nextDouble();
        System.out.println("Enter your Height(in meters)");
        double Height=input.nextDouble();
        double bmi=Weight/(Height*Height);
        System.out.println("BMI " + bmi);
        //Q2
        System.out.println("Enter your Marks ");
        double Marks=input.nextDouble();
        double total=100.0;
        double percentage = (Marks / 100) * 100;
        System.out.println("percentage" +percentage+"%");

        //Q3
        System.out.println("Enter Amount in USD");
        double Amount=input.nextDouble();
        double Rate=0.85;
        double euro = Amount * Rate;
        System.out.println("Amount in EUR = " + euro);
        //Q4
        input.nextLine(); // تنظيف سطر الإدخال السابق
        System.out.println("Enter a string:");
        String text = input.nextLine();
        int length = text.length();
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Length of the string: " + length);
        System.out.println("Reversed string: " + reversed);


        //Q5
        System.out.println("Enter the Sentence The quick brown fox jumps over the lazy dog ");
        String Sentence=input.nextLine();
        System.out.println(Sentence.substring(10,20));

         //Q6
        System.out.println("Enter the Sentence The quick brown fox jumps over the lazy dog");
      String Sentence1=input.nextLine();
        String keyword ="jumps";
        System.out.println(Sentence1.contains(keyword));

      //Q7
        System.out.println("Enter the Sentence The quick brown fox jumps over the lazy dog");
        String Sentence2=input.nextLine();
        String result=Sentence2.replace("fox","cat");
        System.out.println(result);

        //Q8
        System.out.println("Enter the Sentence Hello");
        String Sentence4=input.nextLine();
        System.out.println("Enter the second Sentence hello");
        String secondSentence=input.nextLine();
        System.out.println(Sentence4.equals(secondSentence));


    }

}
