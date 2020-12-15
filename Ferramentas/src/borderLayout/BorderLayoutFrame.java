package borderLayout;
// Fig. 11.41: BorderLayoutFrame.java
// Demonstrando BorderLayout.
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener 
{
   private JButton buttons[]; // array de bot�es para ocultar partes
   private final String names[] = { "Hide North", "Hide South", 
      "Hide East", "Hide West", "Hide Center" };
   private BorderLayout layout; // objeto borderlayout

   // configura GUI e tratamento de evento
   public BorderLayoutFrame()
   {
      super( "BorderLayout Demo" );

      layout = new BorderLayout( 5, 5 ); // espa�os de 5 pixels
      setLayout( layout ); // configura o layout de frame
      buttons = new JButton[ names.length ]; // configura o tamanho do array

      // cria JButtons e registra ouvintes para eles
      for ( int count = 0; count < names.length; count++ ) 
      {
         buttons[ count ] = new JButton( names[ count ] );
         buttons[ count ].addActionListener( this );
      } // for final

      add( buttons[ 0 ], BorderLayout.NORTH ); // adiciona bot�o para o norte
      add( buttons[ 1 ], BorderLayout.SOUTH ); // adiciona bot�o para o sul
      add( buttons[ 2 ], BorderLayout.EAST ); // adiciona bot�o para o leste
      add( buttons[ 3 ], BorderLayout.WEST ); // adiciona bot�o para o oeste
      add( buttons[ 4 ], BorderLayout.CENTER ); // adiciona bot�o para o centro
   } // fim do construtor BorderLayoutFrame

   // trata os eventos de bot�o
   public void actionPerformed( ActionEvent event )
   {
      // verifica a origem de evento e o painel de conte�do de layout correspondentemente
      for ( JButton button : buttons )
      {
         if ( event.getSource() == button )
            button.setVisible( false ); // oculta o bot�o clicado
         else
            button.setVisible( true ); // mostra outros bot�es
      } // for final

      //layout.layoutContainer( getContentPane() ); // painel de conte�do de layout
   } // fim do m�todo actionPerformed
} // fim da classe BorderLayoutFrame


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