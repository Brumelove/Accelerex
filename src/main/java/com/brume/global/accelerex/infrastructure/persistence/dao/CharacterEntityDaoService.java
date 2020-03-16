package com.brume.global.accelerex.infrastructure.persistence.dao;

import com.brume.global.accelerex.domain.CharacterDomain;
import com.brume.global.accelerex.infrastructure.persistence.CharacterEntity;

import java.util.List;
import java.util.Optional;


public interface CharacterEntityDaoService {

    void createNewCharacter(CharacterDomain characterDomain);

    Long countCharacters();

    Optional<CharacterEntity> selectCharacterEntityByCharacterId(Long characterId);

    List<CharacterEntity> selectAllCharacters(String name, String gender, String species, String status);

    CharacterDomain convertCharacterEntityToCharacterDomain(CharacterEntity characterEntity);
}
