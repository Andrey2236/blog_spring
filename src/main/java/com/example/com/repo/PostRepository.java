package com.example.com.repo;

import com.example.com.models.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post,Long> {

}
