package com.brume.global.accelerex.infrastructure.persistence.dao;

import com.brume.global.accelerex.domain.EpisodeDomain;
import com.brume.global.accelerex.infrastructure.persistence.EpisodeEntity;

import java.util.List;
import java.util.Optional;

public interface EpisodeEntityDaoService {

    void createNewEpisodeEntity(EpisodeDomain episodeDomain);

    Long countEpisodeEntity();

    Optional<EpisodeEntity> selectEpisodeEntityByEpisodeId(Long episodeId);

    List<EpisodeEntity> selectAllEpisodeEntity();
}
