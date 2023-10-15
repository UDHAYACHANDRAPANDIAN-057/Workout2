//1.Reverse the String
import java.util.*;
public class reversedemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=obj.next();
        char c[]=s.toCharArray();
        String newstr="";
        for(int i=c.length-1;i>=0;i--)
        {
            newstr+=c[i];
        }
        System.out.println("String After Reverse:"+newstr);
}
}
//2.Palindrome
import java.util.*;
public class palindraomedemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=obj.next();
        char c[]=s.toCharArray();
        String newstr="";
        for(int i=c.length-1;i>=0;i--)
        {
            newstr+=c[i];
        }
        System.out.println("String After Reverse:"+newstr);
        if(s.equals(newstr))
        {
            System.out.println("Palindrme");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
//3.Count the Vowels and Consonents
import java.util.*;
public class vowcountdemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=obj.next();
        char c[]=s.toCharArray();
        int vowels=0,consonents=0;
        for(char temp:c)
        {
            if(temp>='a' && temp<='z')
            {
                if(temp=='a'temp=='e'temp=='i'temp=='o'temp=='u')
                {
                    vowels++;
                }
                else
                {
                    consonents++;
                }
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonents:"+consonents);
    }
}
//4.Count the Occurence of Word
public class occurencedemo{
    public static void main(String[] args){
        String s="hello way how way are way you way";
        String a="way";
        int i=s.indexOf(a);
        int count=0;
        while(i>=0)
        {
            i=s.indexOf(a,i+1);
            count++;
        }
        System.out.println("Word Occurence Count:"+count);
    }
}
//5.Count No of Words
import java.util.*;
public class worddemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=obj.nextLine();
        String str[]=s.split(" ");
        System.out.println("No.of Words:"+str.length);
    }
}
//6.Sorting
import java.util.*;
public class sortdemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of strings:");
        int n=obj.nextInt();
        String str[]=new String[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++)
        {
            str[i]=obj.next();
        }
        String temp="";
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("After Sorting");
        for(String sort:str)
        {
            System.out.println(sort);
        }
    }
}
//7.Anagram
import java.util.*;
public class anagramdemo{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String1:");
        String s1=s.next();
        System.out.println("Enter String2:");
        String s2=s.next();
        anagramdemo obj=new anagramdemo();
        String s3=obj.sort(s1.toCharArray());
        String s4=obj.sort(s2.toCharArray());
        if(s3.equals(s4))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
    String sort(char a[])
    {
        char temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        String s=String.valueOf(a);
        return s;
    }
}
//8.Change Two String Data
import java.util.*;
public class changedemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=obj.next();
        System.out.println("Enter String 2:");
        String s2=obj.next();
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("String 1:"+s1);
        System.out.println("String 2:"+s2);
    }
}

//9.Capitalize first letter
import java.util.*;
public class capdemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=obj.nextLine();
        String str[]=s.split(" ");
        String temp="";
        for(String newstr:str)
        {
            String c=newstr.charAt(0)+"";
            temp+=c.toUpperCase()+newstr.substring(1)+" ";
        }
        System.out.println(temp);
    }
}

//10.Validate String
import java.util.*;
public class specdemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=obj.nextLine();
        if(s.matches("[a-zA-Z ]+"))
        {
            System.out.println("Valid String");
        }
        else
        {
            System.out.println("Invalid String");
        }
    }
}
//11.Remove duplicate character
package stringhandling;
import java.util.*;
public class RemoveDuplicate 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String news="";
        System.out.print("\nEnter the String: ");
        String s=obj.next();
        char v='$';
        char arr[]=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    char temp=arr[j];
                    arr[j]=v;
                }
            }
        }
        for(char c:arr)
        {
            if(c!=v)
            {
                news+=c;
            }
        }
        System.out.println("\nThe String after removing duplicate characters in \""+s+"\" is: "+news);
    }      
}
                                                
//12.Remove digit
package stringhandling;
import java.util.*;
public class RemoveDigit 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String newstring="",digit="";
        System.out.print("\nEnter the String: ");
        String s=obj.next();
        char arr[]=s.toCharArray();
        for(char c:arr)
        {
            int ascii=(int)c;
            if(ascii>=48&&ascii<=57)
            {
                digit+=c;
            }
            else
            {
                newstring+=c;
            }
        }
        System.out.println("\nThe String after removing digits: "+newstring);
    }      
}     
//13.count no of times each character present
package stringhandling;
import java.util.*;

public class CharacterCount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("\nEnter the String: ");
        String s=obj.next();
        
        String cpy=s;
        
        System.out.println("\nCounting the occurence of each character in \""+s+"\": ");
        do
        {
            int count=0;
            char arr[]=cpy.toCharArray();
            int n=cpy.length();
            for(int i=0;i<n;i++)
            {
                if(arr[0]==arr[i])
                {
                    count++;
                }                
            }
            if(count>=1)
            {
                System.out.println(""+arr[0]+": "+count);
            }
            cpy=cpy.replace(""+arr[0],"");
            
        }while(cpy.length()!=0);        
    }   
}                                                                                                                                                                        /*
//14.Print ASCII code of each character of string
package stringhandling;
import java.util.*;

public class CharASCII 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("\nEnter the String: ");
        String s=obj.next();
        System.out.println("\nASCII code of each character in the string \""+s+"\" is: ");
        char arr[]=s.toCharArray();
        for(char c:arr)
        {
            int ascii=(int)c;
            System.out.println(c+"- "+ascii);
        }
    }    
}   
//15.Print Upper case characters in Java
package stringhandling;
import java.util.*;

public class Uppercase 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String upstr="";
        System.out.print("\nEnter the String: ");
        String s=obj.next();
        char arr[]=s.toCharArray();                                         //A-65-->Z-90
        for(char c:arr)
        {
            int v=(int)c;
            if(v>=65&&v<=90)
            {
                upstr+=c;
            }
        }
        System.out.println("The Upper case character in the string \""+s+"\"is: "+upstr);
    }    
}
//16.Lowercse character count
package com.mycompany.workout2;
import java.util.*;
public class Workout2 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = Sc.next();
        int count = 0;
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(Character.isLowerCase(c[i]))
            {
                count++;
            }
        }
        System.out.println("The lowercase in the String is : "+count);
        Sc.close();
    }
}
//17.String with digit first
import java.util.*;
public class STRINGWITHDIGITS
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the strinng : ");
        String s = Sc.next();
        char c[] = s.toCharArray();
        String str = "";
        String str1 = "";
        for(int i=0;i<c.length;i++)
        {
            if(Character.isDigit(c[i]))
            {
                str += c[i];
            }
            else
            {
                str1 += c[i]; 
            }
        }
        String resultString = str+str1;
        System.out.println("The given String with digit first is : "+resultString);
        Sc.close();
    }   
}
//18.String without whitespace
import java.util.*;
public class STRINGWITHOUTSPACE
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = Sc.nextLine();
        String str[] = s.split(" ");
        String result = "";
        for(String news : str)
        {
            result += news;
        }
        System.out.println("The String without space is : "+result);
        Sc.close();
    }  
}
//19.Reverse a case of string
import java.util.*;
public class REVERSESTRING 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = Sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("The reversed String is : "+sb);
        Sc.close();
    }   
}
//20.Piglatin
import java.util.*;
public class PIGLATIN {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = Sc.next();
        char c[]= s.toCharArray();
        String resultString = "";
        if(c[0] == 'a'  c[0] == 'e'  c[0] == 'i'  c[0] == 'o'  c[0] == 'u'  c[0] == 'A'  c[0] == 'E'  c[0] == 'I'  c[0] == 'O' || c[0] == 'U')
        {
            String result = s+"way";
            System.out.println("The Encoded String is : "+result);
        }
        else
        {
            for(int i=0;i<c.length;i++)
            {
                if(c[i] == 'a'  c[i] == 'e'  c[i] == 'i'  c[i] == 'o'  c[i] == 'u'  c[i] == 'A'  c[i] == 'E'  c[i] == 'I'  c[i] == 'O' || c[i] == 'U')
                {
                    resultString = s.substring(i)+s.substring(0,i);
                    break;
                }   
            }
            System.out.println("The Encoded String is : "+resultString);
        }
        Sc.close();
  }
}
//21. Encoding in Java by shifting characters by 2
import java.util.Scanner;
public class StringEncoder {
    public static String encode(String input) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            char encodedChar = (char)(originalChar + 2);
            encoded.append(encodedChar);
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to encode: ");
        String input = scanner.nextLine();
        scanner.close();

        String encodedString = encode(input);
        System.out.println("Encoded String: " + encodedString);
    }
}
//22. Print the first character of each word in a sentence
import java.util.Scanner;

public class FirstCharacterOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                System.out.print(firstChar);
            }
        }
    }
}
//23.Print the first 2 characters of each word in a sentence
import java.util.Scanner;
public class FirstTwoCharactersOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();
        String[] words = input.split(" ");
        for (String word : words) {
                if (word.length() >= 2) {
                String firstTwoChars = word.substring(0, 2);
                System.out.print(firstTwoChars);
            }
        }
    }
}
//24.  Print a word starting with a particular letter or string 
import java.util.Scanner;
public class WordsStartingWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        System.out.print("Enter a letter or string to search for: ");
        String search = scanner.next();
        scanner.close();
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.startsWith(search)) {
                System.out.println(word);
            }
        }
    }
}
//25.Print word ending with a particular letter or string
import java.util.Scanner;
public class WordsEndingWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        System.out.print("Enter a letter or string to search for at the end of words: ");
        String search = scanner.next();
        scanner.close();
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.endsWith(search)) {
                System.out.println(word);
            }
        }
    }
}
//26. Print word containing a particular letter or string
public class WordsWithLetterOrString {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with words.";
        String searchWord = "sample";

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.contains(searchWord)) {
                System.out.println(word);
            }
        }
    }
}
//27. Print words having particular number of characters
public class WordsWithSpecificLength {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with words.";
        int desiredLength = 5;

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() == desiredLength) {
                System.out.println(word);
            }
        }
    }
}
//28. Printing string with special characters
public class SpecialCharacterString {
    public static void main(String[] args) {
        String specialString = "This is a string with special characters: @#$%^&*";
        System.out.println(specialString);
    }
}
//29. Find longest word in a sentence in Java
public class LongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with long and longest words.";
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}
//30. Find a particular word in a string
public class FindWordInString {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with words.";
        String searchWord = "sample";

        if (sentence.contains(searchWord)) {
            System.out.println("Word found: " + searchWord);
        } else {
            System.out.println("Word not found.");
        }
    }
}
//31.No.of.Words in Sentence
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str=scan.nextLine();
        String[] arr=str.split("[\\s,]");
        for(String s:arr)
        {
            count++;
        }
        System.out.println("Number of Words in Java: "+count);
    }
}
//32.No.of.Words Ends with Given Character
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str=scan.nextLine();
        System.out.println("Enter the Letter to be Check:");
        char ch=scan.next().charAt(0);
        String[] arr=str.split("[^a-zA-Z]");
        for(String s:arr)
        {
           System.out.println(s);
           char c[]=s.toCharArray();
           if(c[c.length-1]==ch)
           {
               count++;
           }
        }
        System.out.println("No.of.Words Ends with "+ch+": "+(count));
    }
}

//33.Replace the Word in a Sentence with given word
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str=scan.nextLine();
        System.out.println("Enter the Word to be replaced:");
        String old=scan.next();
        System.out.println("Enter the Word to be replace:");
        String newstr=scan.next();
        str=str.replace(old,newstr);
        System.out.println("Sentence After Replaced:");
        System.out.println(str);
    }
}

//34.Deleting the Word
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str=scan.nextLine();
        System.out.println("Enter the Word:");
        String old=scan.next();
        str=str.replace(old,"").replaceAll("\\s+"," ");
        System.out.println("After Deleting the Word: "+str);
    }
}
        
//35.Change the Case of the Word
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str=scan.nextLine();
        System.out.println("Enter the Word:");
        String old=scan.next();
        if(old.equals(old.toLowerCase()))
        {
            str=str.replace(old,old.toUpperCase());
        }
        else
        {
            str=str.replace(old,old.toLowerCase());
        }
        System.out.println("After Conversion: "+str);
    }
}
        
//36.Swap the first and last Character in a word in Sentence
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str=scan.nextLine();
        String[] arr=str.split("[^a-zA-Z]");
        String fin="";
        for(String s:arr)
        {
            char ch[]=s.toCharArray();
            char temp=ch[0];
            ch[0]=ch[s.length()-1];
            ch[s.length()-1]=temp;
            String res=new String(ch);
            fin=fin+" "+res;
        }
        System.out.println("Modified String:"+fin);
    }
}
