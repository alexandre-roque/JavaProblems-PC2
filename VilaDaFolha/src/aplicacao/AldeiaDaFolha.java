package aplicacao;

import dominio.ControleMissoes;
import dominio.ControleNinjas;
import gui.JanelaPrincipal;

/**
 *
 * @author alexa
 */
public class AldeiaDaFolha {
    public static void main(String args[]) {
        ControleNinjas controleNinja = new ControleNinjas();
        ControleMissoes controleMissoes = new ControleMissoes();
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaPrincipal janela = new JanelaPrincipal(controleNinja, controleMissoes);
                janela.setVisible(true);
            }
        });       
    }
    
}
