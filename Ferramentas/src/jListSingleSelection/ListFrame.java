package jListSingleSelection;
// Fig. 11.23: ListFrame.java
// Selecionando as cores de uma JList.
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame 
{
   private JList colorJList; // lista para exibir cores
   private final String colorNames[] = { "Black", "Blue", "Cyan", 
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow" };
   private final Color colors[] = { Color.BLACK, Color.BLUE, Color.CYAN, 
      Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, 
      Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, 
      Color.YELLOW };

   // construtor ListFrame adiciona JScrollPane que cont�m JList ao JFrame
   public ListFrame()
   {
      super( "List Test" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      colorJList = new JList( colorNames ); // cria com colorNames
      colorJList.setVisibleRowCount( 5 ); // exibe cinco linhas de uma vez
      
      // n�o permite m�ltiplas sele��es
      colorJList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

      // adiciona um JScrollPane que cont�m JList ao frame
      add( new JScrollPane( colorJList ) );         

      colorJList.addListSelectionListener(
         new ListSelectionListener() // classe interna an�nima
         {   
            // trata eventos de sele��o de lista
            public void valueChanged( ListSelectionEvent event )
            {
               getContentPane().setBackground( 
                  colors[colorJList.getSelectedIndex()] );
            } // fim do m�todo valueChanged
         } // fim da classe interna an�nima
      ); // fim da chamada para addListSelectionListener
   } // fim do construtor ListFrame
} // fim da classe ListFrame


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