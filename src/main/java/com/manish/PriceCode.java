package com.manish;

public interface PriceCode {
    double amount(int daysRented);
    int frequentRenterPoints(int daysRented);
}
