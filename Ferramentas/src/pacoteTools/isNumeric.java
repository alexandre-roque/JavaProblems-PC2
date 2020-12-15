package pacoteTools;
public class isNumeric {
    private static boolean isNumeric(String strnum){
        if(strnum == null){
            return false;
        }
        try{
            double d = Double.parseDouble(strnum);
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
