package com.brume.global.accelerex.Usecase.api;

import com.brume.global.accelerex.domain.model.CharacterApiResponse;
import com.brume.global.accelerex.domain.model.EpisodeApiResponse;

public interface ApplicationDataUseCase {
    EpisodeApiResponse getEpisodeData(String url);

    CharacterApiResponse getCharacterData(String url);
}
