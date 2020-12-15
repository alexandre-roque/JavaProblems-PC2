package jOptionPane;

// Fig. 11.2: Addition.java
// Programa de adi��o que utiliza JOptionPane para entrada e sa�da.
import javax.swing.JOptionPane; // programa utiliza JOptionPane

public class Addition 
{
   public static void main( String args[] )
   {
      // obt�m a entrada de usu�rio a partir dos di�logos de entrada JOptionPane      
      String firstNumber =                                      
         JOptionPane.showInputDialog( "Enter first integer" );  
      String secondNumber =                                     
          JOptionPane.showInputDialog( "Enter second integer" );

      // converte String em valores int para utiliza��o em um c�lculo
      int number1 = Integer.parseInt( firstNumber );                 
      int number2 = Integer.parseInt( secondNumber );                

      int sum = number1 + number2; // soma os n�meros

      // exibe o resultado em um di�logo de mensagem JOptionPane       
      JOptionPane.showMessageDialog( null, "The sum is " + sum,
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );   
   } // fim do m�todo main
} // fim da classe Addition


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/