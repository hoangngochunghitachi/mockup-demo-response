package com.response.mockup.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OutputRestDTO class.
 *
 * @author hungnh.za
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class OutputRestDTO extends ResponseError {

    @JsonProperty("MAT_DOC")
    private String materialDocument;
}
