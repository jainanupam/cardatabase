package com.coddicted.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import com.coddicted.cardatabase.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {}
