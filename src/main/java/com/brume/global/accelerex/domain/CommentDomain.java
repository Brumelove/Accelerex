package com.brume.global.accelerex.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class CommentDomain {
    Long id;
    String comment;
    String ipAddress;
    String created;

}
