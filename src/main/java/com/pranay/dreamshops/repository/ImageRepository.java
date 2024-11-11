package com.pranay.dreamshops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranay.dreamshops.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
