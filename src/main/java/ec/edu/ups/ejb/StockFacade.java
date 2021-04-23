package ec.edu.ups.ejb;

import ec.edu.ups.entidad.Bodega;
import ec.edu.ups.entidad.Empleado;
import ec.edu.ups.entidad.Producto;
import ec.edu.ups.entidad.Stock;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Stateless
public class StockFacade extends AbstractFacade<Stock>{
    @PersistenceContext(unitName = "DistribuidoraJSF")
    private EntityManager entityManager;

    public StockFacade() { super(Stock.class); }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public Stock validarStock(Stock stock){
        Stock stock1 = null;
        String consulta;
        try {
            consulta = "SELECT s FROM Stock s WHERE s.bodega.codigo = ?1 and s.producto.codigo = ?2";
            Query query = entityManager.createQuery(consulta);
            query.setParameter(1, stock.getBodega().getCodigo());
            query.setParameter(2,stock.getProducto().getCodigo());
            List<Stock> lista = query.getResultList();
            if (!lista.isEmpty()){
                stock1 = lista.get(0);
            }
        }catch (Exception e){

        }
        return stock1;
    }

}
