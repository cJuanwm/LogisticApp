package com.example.LogisticApp.services;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LogisticApp.mappers.MerchandiseMapper;
import com.example.LogisticApp.models.entities.MerchandiseEntity;
import com.example.LogisticApp.models.entities.dtos.MerchandiseDTO;
import com.example.LogisticApp.repositories.MerchandiseRepository;

@Service
public class MerchandiseServiceImpl implements MerchandiseService{

    @Autowired
    private MerchandiseRepository merchandiseRepository;

    @Autowired
    private MerchandiseMapper merchandiseMapper;

    @Override
    public MerchandiseDTO createMerchandise(MerchandiseDTO merchandiseDTO) {
        MerchandiseEntity merchandiseToCreate = merchandiseMapper.merchandiseConvertToEntity(merchandiseDTO);
        merchandiseRepository.save(merchandiseToCreate);
        return merchandiseMapper.merchandiseConvertToDto(merchandiseToCreate);
    }

    @Override
    public MerchandiseDTO getMerchandise(int id) {
        MerchandiseEntity merchandiseToGet = merchandiseRepository.findById(id);
        return merchandiseMapper.merchandiseConvertToDto(merchandiseToGet);
    }

    @Override
    public MerchandiseDTO updateMerchandise(int id, MerchandiseDTO merchandiseDTO) {
        MerchandiseEntity merchandiseToUpdate = merchandiseRepository.findById(id);

        merchandiseToUpdate.setVolumeOccupies(merchandiseDTO.getVolumeOccupies());
        merchandiseToUpdate.setWeightOccupies(merchandiseDTO.getWeightOccupies());
        merchandiseToUpdate.setName(merchandiseDTO.getName());
        merchandiseToUpdate.setDescription(merchandiseDTO.getDescription());
        merchandiseToUpdate.setDateEntry(merchandiseDTO.getDateEntry());
        merchandiseToUpdate.setDateExit(merchandiseDTO.getDateExit());

        merchandiseRepository.save(merchandiseToUpdate);

        return merchandiseMapper.merchandiseConvertToDto(merchandiseToUpdate);
    }

    @Transactional
    @Override
    public void deleteMerchandise(int id) {
        merchandiseRepository.deleteById(id);
    }

}
