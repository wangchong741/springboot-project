package com.example.demo.test.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-25 13:38
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Stu1 {
    private Integer businessDate;
    private Integer id;
    private String name1;

    private String add;
}
