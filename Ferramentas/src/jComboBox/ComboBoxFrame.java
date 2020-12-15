package jComboBox;
// Fig. 11.21: ComboBoxFrame.java
// Utilizando um JComboBox para selecionar uma imagem a exibir.
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame 
{
   private JComboBox imagesJComboBox; // caixa de combina��o para armazenar nomes de �cones
   private JLabel label; // r�tulo para exibir �cone selecionado

   private String names[] = 
      { "bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif" };
   private Icon icons[] = { 
      new ImageIcon( getClass().getResource( names[ 0 ] ) ),
      new ImageIcon( getClass().getResource( names[ 1 ] ) ), 
      new ImageIcon( getClass().getResource( names[ 2 ] ) ),
      new ImageIcon( getClass().getResource( names[ 3 ] ) ) };

   // construtor ComboBoxFrame adiciona JComboBox ao JFrame
   public ComboBoxFrame()
   {
      super( "Testing JComboBox" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      imagesJComboBox = new JComboBox( names ); // configura JComboBox
      imagesJComboBox.setMaximumRowCount( 3 ); // exibe tr�s linhas

      imagesJComboBox.addItemListener(                            
         new ItemListener() // classe interna an�nima
         {                                                        
            // trata evento JComboBox
            public void itemStateChanged( ItemEvent event )       
            {                                                     
               // determina se caixa de sele��o est� marcada ou n�o
               if ( event.getStateChange() == ItemEvent.SELECTED )
                  label.setIcon( icons[                           
                     imagesJComboBox.getSelectedIndex() ] );      
            } // fim do m�todo itemStateChanged
         } // fim da classe interna an�nima
      ); // fim da chamada para addItemListener

      add( imagesJComboBox ); // adiciona combobox ao JFrame
      label = new JLabel( icons[ 0 ] ); // exibe primeiro �cone
      add( label ); // adiciona r�tulo ao JFrame
   } // fim do construtor ComboBoxFrame
} // fim da classe ComboBoxFrame


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