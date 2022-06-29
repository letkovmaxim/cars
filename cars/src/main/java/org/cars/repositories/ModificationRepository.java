package org.cars.repositories;

import org.cars.models.Modification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModificationRepository extends JpaRepository<Modification, Long> {
}
