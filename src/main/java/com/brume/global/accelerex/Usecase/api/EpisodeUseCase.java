package com.brume.global.accelerex.Usecase.api;

import com.brume.global.accelerex.Usecase.api.model.CharacterCommandResponse;
import com.brume.global.accelerex.domain.CommentDomain;
import com.brume.global.accelerex.domain.model.EpisodeCommand;

import java.util.List;

public interface EpisodeUseCase {

    CharacterCommandResponse getCharactersOfAnEpisode(Long episodeId, String sortParameter, String filter);

    List<EpisodeCommand> getListOfEpisode();

    List<CommentDomain> getCommentsOfAnEpisode(Long episodeId);

    void postComment(Long episodeId, String comment);
}
