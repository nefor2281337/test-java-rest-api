package exampl.service.impl;

import exampl.DTO.CatDTO;
import exampl.entity.Cat;
import exampl.mapper.CatMapper;
import exampl.mapper.CatObjectMapper;
import exampl.repository.CatRepository;
import exampl.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService {

    private final CatRepository catRepository;
    private final CatObjectMapper catObjectMapper;
    private final CatMapper catMapper;

    @Override
    public String getAllCats() {
        return catObjectMapper.CatWriteValueAsString(catRepository.findAll());
    }

    @Override
    public String addCat(CatDTO catDTO) {
        catRepository.save(catMapper.toCat(catDTO));
        return "Cat has been added";
    }

    @Override
    public String deleteCat(Integer id) {
        catRepository.deleteById(id);
        return "Cat has been deleted";
    }

    @Override
    public String getCatById(Integer id) {
        return catObjectMapper.CatWriteValueAsString(catRepository.findById(id));
    }

    @Override
    public String updateCat(Cat cat) {
        if (catRepository.findById(cat.getId()).isEmpty()) return "Cat does not exist";
        catRepository.save(cat);
        return "Cat has been updated";
    }
}
