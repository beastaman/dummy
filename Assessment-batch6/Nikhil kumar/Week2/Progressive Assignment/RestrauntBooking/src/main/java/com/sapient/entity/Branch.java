package com.sapient.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
public class Branch {
    private String branchId;
    private String branchName;
    private String address;
    private String phoneNo;
}
