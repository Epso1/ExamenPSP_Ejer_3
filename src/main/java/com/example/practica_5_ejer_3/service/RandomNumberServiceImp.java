package com.example.practica_5_ejer_3.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomNumberServiceImp implements RandomNumberService {


    @Override
    public void return100RandomNumbers() {
        for (int i = 0; i < 100; i++) {
            System.out.println((int) (Math.random() * 100));
        }
    }

    @Override
    public int getRandomNumber(int d) {
        return (int) (Math.random() * Math.pow(10, d));
    }

    @Override
    public int getRandomNumberWithNumberOfDigits(int numberOfDigits) {
        return (int) (Math.random() * Math.pow(10, numberOfDigits));
    }

    @Override
    public int generateRandomNumberWithDigits(int digits) {
        String number = "";
        for (int i = 0; i < digits; i++) {
            number += (int) (Math.random() * 10);
        }
        int result = Integer.parseInt(number);
        return result;
    }
}
