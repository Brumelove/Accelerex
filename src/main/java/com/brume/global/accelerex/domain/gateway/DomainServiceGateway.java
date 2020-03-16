package com.brume.global.accelerex.domain.gateway;

import com.brume.global.accelerex.domain.CommentDomain;
import com.brume.global.accelerex.domain.model.CharacterCommand;
import com.brume.global.accelerex.domain.model.EpisodeCommand;

import java.util.List;

public interface DomainServiceGateway {

    List<CharacterCommand> listEpisodeCharacters(Long episodeId);

    List<EpisodeCommand> listEpisode();

    List<CommentDomain> listEpisodeComments(Long episodeId);

    void postComments(Long episodeId, String comments);


}
