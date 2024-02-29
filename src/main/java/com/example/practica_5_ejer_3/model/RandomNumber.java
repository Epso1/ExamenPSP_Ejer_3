package com.example.practica_5_ejer_3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RandomNumber {
    private int random;


    public int getRamdom(){
       return random;
    }
    public int getSize(){
        return String.valueOf(random).length();
    }
}
