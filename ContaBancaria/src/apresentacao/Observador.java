package apresentacao;

import dominio.ContaBancariaModelo;
/**
 * Essa interface foi criada aqui para fins didáticos.
 * A interface a ser usada é a Observer da API Java
 * @author lsi-hb
 */
public interface Observador {
	void update(ContaBancariaModelo o);
}
