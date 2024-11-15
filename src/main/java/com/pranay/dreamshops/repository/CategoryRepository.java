package com.pranay.dreamshops.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pranay.dreamshops.model.Category;
import org.springframework.stereotype.Repository;

@Qualifier("category")
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findByName(String name);

	boolean existsByName(String name);

}
