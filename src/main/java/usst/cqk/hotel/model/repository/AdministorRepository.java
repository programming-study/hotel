package usst.cqk.hotel.model.repository;

import org.springframework.data.repository.CrudRepository;
import usst.cqk.hotel.model.Administor;

public interface AdministorRepository extends CrudRepository<Administor,Long> {
    Administor findAdministorByAdministorAccount(String administorAccount);
}
