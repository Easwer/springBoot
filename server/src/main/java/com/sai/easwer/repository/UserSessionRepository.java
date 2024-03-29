package com.sai.easwer.repository;

import com.sai.easwer.entity.UserSession;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * User session repository.
 * 
 * @author Easwer AP
 * @email easwerms@gmail.com
 * @create date 2020-02-14 15:12:28
 * @modify date 2020-03-10 18:06:46
 */
@Repository
public interface UserSessionRepository extends PagingAndSortingRepository<UserSession, UUID> {
    Optional<UserSession> findById(UUID id);

    List<UserSession> findAll();

    Optional<UserSession> findByAuthToken(UUID authToken);

    Optional<UserSession> findByUserId(UUID userId);

    @Transactional
    long deleteByUserId(UUID userId);

    @Transactional
    long deleteByAuthToken(UUID authToken);
}
