package enumtask;

public class Enumtask {
    enum Luni
    {
        IANUARIE, FEBRUARIE, MARTIE, APRILIE, MAI, IUNIE, IULIE, AUGUST, SEPTEMBRIE, OCTOMBRIE, NOIEMBRIE, DECEMBRIE
    }
    public static void main (String[] args)
    {
        for (Luni luniValue : Luni.values())
        {
            System.out.println(luniValue);
        }
    }
}
