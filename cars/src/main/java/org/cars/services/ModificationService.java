package org.cars.services;

import org.cars.models.Modification;
import org.cars.repositories.ModificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModificationService implements ServiceInterface<Modification> {
    @Autowired
    ModificationRepository modificationRepository;

    @Override
    public List<Modification> getAll() {
        return new ArrayList<>(modificationRepository.findAll());
    }

    @Override
    public Modification getById(long id) {
        return modificationRepository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Modification modification) {
        modificationRepository.save(modification);
    }
}