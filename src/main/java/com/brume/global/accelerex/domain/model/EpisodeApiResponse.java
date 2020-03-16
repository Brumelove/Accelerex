package com.brume.global.accelerex.domain.model;

import com.brume.global.accelerex.domain.EpisodeDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class EpisodeApiResponse {
    public Info info;
    public  ArrayList<EpisodeDomain> results =  new   ArrayList<EpisodeDomain>();
}
