package com.brume.global.accelerex.infrastructure.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ApplicationApiResponse<T> {
    public String message;
    public Object data;

    public ApplicationApiResponse(String message) {
        this.message = message;
    }


}
