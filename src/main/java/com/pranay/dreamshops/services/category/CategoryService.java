package com.pranay.dreamshops.services.category;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pranay.dreamshops.exceptions.AlreadyExistsException;
import com.pranay.dreamshops.exceptions.ResourceNotFoundException;
import com.pranay.dreamshops.model.Category;
import com.pranay.dreamshops.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoryService implements ICategoryService {

	private final CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {

		return Optional.of(category).filter(c -> !categoryRepository.existsByName(c.getName()))
				.map(categoryRepository::save)
				.orElseThrow(() -> new AlreadyExistsException(category.getName() + " Already exists"));
	}

	@Override
	public void deleteCategoryById(Long id) {
		categoryRepository.findById(id).ifPresentOrElse(categoryRepository::delete, () -> {
			throw new ResourceNotFoundException("Category not found");
		});

	}

	@Override
	public List<Category> getAllCategories() {

		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(Long id) {

		return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found."));
	}

	@Override
	public Category getCategoryByName(String name) {

		return categoryRepository.findByName(name);
	}

	@Override
	public Category updateCategory(Category category, Long id) {

		return Optional.ofNullable(getCategoryById(id)).map(oldCategories -> {
			oldCategories.setName(category.getName());
			return categoryRepository.save(oldCategories);
		}).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
	}

}
