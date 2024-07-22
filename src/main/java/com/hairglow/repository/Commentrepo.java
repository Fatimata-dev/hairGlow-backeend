package com.hairglow.repository;

import com.hairglow.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Commentrepo extends JpaRepository<Comment, Long> {
}
