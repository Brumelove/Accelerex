package com.brume.global.accelerex.infrastructure.persistence.repository;

import com.brume.global.accelerex.infrastructure.persistence.EpisodeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EpisodeEntityRepository extends PagingAndSortingRepository<EpisodeEntity, Long> {
    List<EpisodeEntity> getAllByCreatedNullOrderByCreatedDesc();

}
