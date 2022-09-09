package com.zinkworks.app.repository;

import com.zinkworks.app.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* The two parameters passed are <T, ID> the T refers to the
   entity/model that the repository will manage and ID refers to
   the type of the ID field */
@Repository
public interface UrlRepository extends JpaRepository<Url, String> {
}
