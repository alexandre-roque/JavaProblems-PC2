package mouseEvents;
// Fig. 11.28: MouseTrackerFrame.java
// Demonstrando os eventos de mouse.
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame
{
   private JPanel mousePanel; // painel em que os eventos de mouse ocorrer�o
   private JLabel statusBar; // r�tulo que exibe informa��es de evento

   // construtor MouseTrackerFrame configura GUI e
   // registra handlers de evento de mouse
   public MouseTrackerFrame()
   {
      super( "Demonstrating Mouse Events" );

      mousePanel = new JPanel(); // cria painel
      mousePanel.setBackground( Color.WHITE ); // configura cor de fundo
      add( mousePanel, BorderLayout.CENTER ); // adiciona painel ao JFrame

      statusBar = new JLabel( "Mouse outside JPanel" );           
      add( statusBar, BorderLayout.SOUTH ); // adiciona r�tulo ao JFrame

      // cria e registra listener para mouse e eventos de movimento de mouse
      MouseHandler handler = new MouseHandler();                       
      mousePanel.addMouseListener( handler );                          
      mousePanel.addMouseMotionListener( handler );                    
   } // fim do construtor de MouseTrackerFrame

   private class MouseHandler implements MouseListener,
      MouseMotionListener                              
   {
      // Handlers de evento de MouseListener
      // trata evento quando o mouse � liberado logo depois de pressionado
      public void mouseClicked( MouseEvent event )
      {
         statusBar.setText( String.format( "Clicked at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseClicked

      // trata evento quando mouse � pressionado
      public void mousePressed( MouseEvent event )
      {
         statusBar.setText( String.format( "Pressed at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mousePressed

      // trata evento quando mouse � liberado depois da opera��o de arrastar
      public void mouseReleased( MouseEvent event )
      {
         statusBar.setText( String.format( "Released at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseReleased

      // trata evento quando mouse entra na �rea
      public void mouseEntered( MouseEvent event )
      {
         statusBar.setText( String.format( "Mouse entered at [%d, %d]", 
            event.getX(),event.getY() ) );
         mousePanel.setBackground( Color.GREEN );
      } // fim do m�todo mouseEntered

      // trata evento quando mouse sai da �rea
      public void mouseExited( MouseEvent event )
      {
         statusBar.setText( "Mouse outside JPanel" );
         mousePanel.setBackground( Color.WHITE );
      } // mouseExited fim do m�todo

      // Handlers de evento de MouseMotionListener
      // trata evento quando usu�rio arrasta o mouse com o bot�o pressionado
      public void mouseDragged( MouseEvent event )
      {
         statusBar.setText( String.format( "Dragged at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseDragged

      // trata evento quando usu�rio move o mouse
      public void mouseMoved( MouseEvent event )
      {
         statusBar.setText( String.format( "Moved at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseMoved
   } // fim da classe interna MouseHandler
} // fim da classe MouseTrackerFrame


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