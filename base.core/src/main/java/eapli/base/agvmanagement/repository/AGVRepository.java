package eapli.base.agvmanagement.repository;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface AGVRepository extends DomainRepository<IDAGV, AGV> {
    List<AGV> findByAGVDock(AGVDock agvDock);
    default Optional<AGV> findByID(IDAGV id) {
        return ofIdentity(id);
    }


}
