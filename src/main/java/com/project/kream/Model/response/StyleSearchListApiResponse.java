package com.project.kream.Model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StyleSearchListApiResponse {
    private Long productId;
    private String name;
    private String korName;
    private String origFileName;
    private Long price;
}
