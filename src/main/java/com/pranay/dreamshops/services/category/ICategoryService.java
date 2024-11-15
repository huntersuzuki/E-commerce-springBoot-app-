package com.pranay.dreamshops.services.category;

import java.util.List;

import com.pranay.dreamshops.model.Category;
import org.springframework.stereotype.Service;

@Service
public interface ICategoryService {
	Category getCategoryById(Long id);

	Category getCategoryByName(String name);

	List<Category> getAllCategories();

	Category addCategory(Category category);

	Category updateCategory(Category category, Long id);

	void deleteCategoryById(Long id);
}
