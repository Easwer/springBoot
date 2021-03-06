package com.sai.easwer.repository.mapping;

import java.util.List;
import java.util.UUID;

import com.sai.easwer.entity.mapping.UserGroupMapping;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupMappingRepository extends PagingAndSortingRepository<UserGroupMapping, UUID> {

  List<UserGroupMapping> findByUserId(UUID userId);

}