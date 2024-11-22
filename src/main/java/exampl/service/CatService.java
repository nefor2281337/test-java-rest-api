package exampl.service;

import exampl.DTO.CatDTO;
import exampl.entity.Cat;

public interface CatService {

    String getAllCats();

    String addCat(CatDTO catTDO);

    String deleteCat(Integer id);

    String getCatById(Integer id);

    String updateCat(Cat cat);
}
