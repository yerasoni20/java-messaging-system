package com.example.javamessagingsystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by yera soni on 2019-07-16.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {

    static final long serialVersionUID = -6703826490277916847L;

    private UUID id;
    private String message;
}