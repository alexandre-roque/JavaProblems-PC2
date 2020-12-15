package textFileApp;

public class ConfereInformacao {
    public static boolean isNumeric(String strnum){
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
    
    public static boolean isRankMissao(String strRank){
        if(strRank == null){
            return false;
        }
        else if(strRank.equals("S")){
            return true;
        }
        else if(strRank.equals("A")){
            return true;
        }
        else if(strRank.equals("B")){
            return true;
        }
        else if(strRank.equals("C")){
            return true;
        }
        else if(strRank.equals("D")){
            return true;
        }
        else
            return false; 
    }
    
    public static boolean temConteudo(String str){
        if(str.equals("")){
            return false;
        }else
            return true;
    }
}
