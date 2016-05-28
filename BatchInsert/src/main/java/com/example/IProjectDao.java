package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectDao extends JpaRepository<Project, Long>,IProjectCustomdao {

}
