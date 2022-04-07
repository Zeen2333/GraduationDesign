package com.zeen.graduationdesign.util;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PageResult {

    private int pageNum;

    private int pageSize;

    private long totalSize;

    private int totalPages;

    private List<?> content;
}
