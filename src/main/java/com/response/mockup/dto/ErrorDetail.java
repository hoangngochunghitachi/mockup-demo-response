package com.response.mockup.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DStockAdjustmentDTO class.
 *
 * @author hungnh.za
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetail {

    /**
     * Explanation of processing
     *
     * @param string
     * @param string2
     * @param string3
     * @param string4
     * @param string5
     * @param string6
     * @param string7
     * @param string8
     * @param string9
     * @param string10
     * @param string11
     * @param string12
     * @param string13
     */
//    public ErrorDetail(String type, String id, String number, String message, String logNo, String logMsgNo,
//            String messageV1, String messageV2, String messageV3, String messageV4, String parameter, Integer row,
//            String field) {
//        this.type = type;
//        this.id = id;
//        this.number = number;
//        this.message = message;
//        this.logNo = logNo;
//        this.logMsgNo = logMsgNo;
//        this.messageV1 = messageV1;
//        this.messageV2 = messageV2;
//        this.messageV3 = messageV3;
//        this.messageV4 = messageV4;
//        this.parameter = parameter;
//        this.row = row;
//        this.field = field;
//    }

    /** type field. */
    @JsonProperty("TYPE")
    private String type;

    /** id field. */
    @JsonProperty("ID")
    private String id;

    /** number field. */
    @JsonProperty("NUMBER")
    private String number;

    /** message field. */
    @JsonProperty("MESSAGE")
    private String message;

    /** logNo field. */
    @JsonProperty("LOG_NO")
    private String logNo;

    /** logMsgNo field. */
    @JsonProperty("LOG_MSG_NO")
    private String logMsgNo;

    /** messageV1 field. */
    @JsonProperty("MESSAGE_V1")
    private String messageV1;

    /** messageV2 field. */
    @JsonProperty("MESSAGE_V2")
    private String messageV2;

    /** messageV3 field. */
    @JsonProperty("MESSAGE_V3")
    private String messageV3;

    /** messageV4 field. */
    @JsonProperty("MESSAGE_V4")
    private String messageV4;

    /** parameter field. */
    @JsonProperty("PARAMETER")
    private String parameter;

    /** row field. */
    @JsonProperty("ROW")
    private Integer row;

    /** field. */
    @JsonProperty("FIELD")
    private String field;
}
