public class goodnight {
    public static void main (String[] args){
        System.out.println("Goodnight world!");

        try{
            Runtime.getRuntime().exec("shutdown -s");
        }catch(Exception e){
            System.out.println("This was a bad idea");
            e.printStackTrace();
        }
    }
}
