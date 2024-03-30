package com.tutofox.Aadhar_Card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tutofox.Aadhar_Card.entity.Aadhar;

@Repository
public interface Repo extends JpaRepository <Aadhar, Integer > {

}
