package com.pranay.dreamshops.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pranay.dreamshops.model.Image;
import org.springframework.stereotype.Repository;

@Qualifier("image")
@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
