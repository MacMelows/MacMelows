package com.oesia.formacion.practica.architecture.persistence.entities.article;

import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.entities.Entity;

public interface ArticleEntity extends Entity<Article> {

	Size findSizeById(Integer sizeId);

	void update(Article article);
	
	void create(Article article);
}
