package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.*;

public interface GenreRepo extends JpaRepository<Genre,Integer> {

}
