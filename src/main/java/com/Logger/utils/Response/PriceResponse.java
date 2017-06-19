package com.Logger.utils.Response;

import com.Logger.domain.model.Prices;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class PriceResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yy-MM-dd")
    Date date;
    Integer hotelId;
    Integer roomId;
    Integer rateplanId;
    Long userId;
    String userName;
    Long uniqueId;
    String status;
    Prices price;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ",timezone="GMT+5:30")
    Date createdDate;
}
