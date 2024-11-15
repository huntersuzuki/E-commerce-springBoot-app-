package com.pranay.dreamshops.services.image;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.pranay.dreamshops.dto.ImageDto;
import com.pranay.dreamshops.model.Image;

@Service
public interface IImageService {
	Image getImageById(Long id);

	void deleteImageById(Long id);

	List<ImageDto> saveImages(List<MultipartFile> files, Long productId);

	void updateImage(MultipartFile file, Long imageId);
}
