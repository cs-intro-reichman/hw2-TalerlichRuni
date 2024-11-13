public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        String add = args[1];
        String[] parts = time.split(":");
        int Chour = Integer.parseInt(parts[0]);
        int Cminutes = Integer.parseInt(parts[1]);
        int TotalMinutes = (Chour * 60) + Cminutes + Integer.parseInt(add);
        int Totalhours = TotalMinutes/60; 
        int NewHours= Totalhours%24;
        int Newminutes = TotalMinutes-(Totalhours*60);
        if(NewHours<10)
        {
        System.out.print("0"+NewHours +":");
    }
    else{
        System.out.print(+NewHours +":");

    }
    if(Newminutes<10)
    {
    System.out.print("0"+Newminutes);
}
else
{
    System.out.print(Newminutes);

}
}
}