package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-11-22 16:31
 */
@Service
public interface Test<T, S> {
    T convertTo (S obj);
}
