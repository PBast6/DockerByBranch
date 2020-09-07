package de.pbast6.springdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    int sum(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }
}
