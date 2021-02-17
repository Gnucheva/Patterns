package ru.netology.web;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor

public class User {
    private final String city;
    private final String data;
    private final String name;
    private final String phone;
}
