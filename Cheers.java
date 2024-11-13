public class Cheers {
public static void main(String[] args) 
{
String Word = args[0];
int times = Integer.parseInt(args[1]); 
String NoWord = "AEFHILMNOR";
String UpdateWord = Word.toUpperCase();
int i=0 ;
while( i < UpdateWord.length())
{
char letter = UpdateWord.charAt(i);
int b=0;
Boolean u = true;
while(b<NoWord.length())
{
if (letter == NoWord.charAt(b))
{
        u = false; 
}
b++;
}

if (u == true)
{
System.out.println("Give me a  " + letter + ": " + letter + "!");}
else
{
System.out.println("Give me an " + letter + ": " + letter + "!");

}
i++;
}
System.out.println("What does that spell?");
int c=0;
while (c < times)
{
System.err.println(UpdateWord + "!!!");
c++;
}
}
}





