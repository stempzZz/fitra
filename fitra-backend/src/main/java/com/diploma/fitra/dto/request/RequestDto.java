package com.diploma.fitra.dto.request;

import com.diploma.fitra.dto.travel.TravelShortDto;
import com.diploma.fitra.dto.user.UserShortDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestDto {

    private Long id;
    private TravelShortDto travel;
    private UserShortDto sender;
    private String text;
    private LocalDateTime createTime;
    private String status;
    private boolean viewed;
}
