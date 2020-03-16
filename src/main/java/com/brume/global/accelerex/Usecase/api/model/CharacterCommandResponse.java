package com.brume.global.accelerex.Usecase.api.model;

import com.brume.global.accelerex.domain.model.CharacterCommand;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data  @AllArgsConstructor
public class CharacterCommandResponse {
    private List<CharacterCommand> character;
    private int numberOfCharacters;

}
