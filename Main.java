class Main
{
    public static void main(String[] args)
    {
        Funciones f = new Funciones();
        try
        {
            f.PrepareCards();
        }
        catch(Exception e)
        {
            
        }
        
        /*String s = "Welcome|to |Baeldung";
        String[] result = s.split("\\|");
        for(int i=0;i<result.length;i++)
        System.out.println(result[i]);*/
    }
}