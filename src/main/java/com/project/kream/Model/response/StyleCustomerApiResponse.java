package com.project.kream.Model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StyleCustomerApiResponse {
    private Long id;
    private Long customerId;
    private String profileName;
    private String name;
    private String intro;
}
