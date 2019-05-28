package reshenie.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reshenie.server.entity.Book;
import reshenie.server.entity.Category;
import reshenie.server.repository.BookRepository;
import reshenie.server.repository.CategoryRepository;

import java.util.List;
@Service

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

}

