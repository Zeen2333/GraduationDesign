package com.zeen.graduationdesign.util;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PageRequest {

    private int pageNum = 1;

    private int paseSize = 10;

    private Map<String, Object> params = new HashMap<>();

}
