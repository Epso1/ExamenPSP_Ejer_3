package com.example.practica_5_ejer_3.controller;

import com.example.practica_5_ejer_3.model.RandomNumber;
import com.example.practica_5_ejer_3.service.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@RestController
@RequestMapping("/random")
public class RandomNumberController {

    private final RandomNumberService randomNumberService;

    @Autowired
    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @GetMapping("/numbers")
    public ResponseEntity<List<Integer>> getRandomNumbers() {
        Random random = new Random();
        List<Integer> randomNumbers = IntStream.range(0, 100)
                .map(i -> random.nextInt())
                .boxed()
                .collect(Collectors.toList());
        return new ResponseEntity<>(randomNumbers, HttpStatus.OK);
    }

    /* GET /random/number/{d} Devuelve un número aleatorio que tendrá d dígitos. */
    @GetMapping("/number/{d}")
    public ResponseEntity<Integer> getRandomNumber(@PathVariable int d) {
        return new ResponseEntity<>(randomNumberService.getRandomNumber(d), HttpStatus.OK);
    }

    /*PUT /random/number Recibe un número aleatorio (JSON en el body) y devuelve un número aleatorio (JSON en el body) con el mismo número de dígitos que el número recibido. */

    @PutMapping("/number")
    public ResponseEntity<Integer> putRandomNumber(@RequestBody RandomNumber randomNumber) {
        int length = randomNumber.getSize();
        return new ResponseEntity<>(randomNumberService.generateRandomNumberWithDigits(length), HttpStatus.OK);
    }

}