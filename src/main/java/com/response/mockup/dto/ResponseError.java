package com.response.mockup.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ResponseErrorSap class.
 *
 * @author hungnh.za
 */
@Data
public class ResponseError {

    @JsonProperty("ERROR_MSG")
    private List<ErrorDetail> errorMessages;
}
