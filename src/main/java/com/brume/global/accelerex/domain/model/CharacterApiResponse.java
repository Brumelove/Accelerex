package com.brume.global.accelerex.domain.model;

import com.brume.global.accelerex.domain.CharacterDomain;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CharacterApiResponse {
    public Info info;
    public ArrayList<CharacterDomain> results =  new   ArrayList<CharacterDomain>();
}
