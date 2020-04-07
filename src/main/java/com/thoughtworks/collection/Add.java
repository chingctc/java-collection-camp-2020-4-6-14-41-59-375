package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> newNumberList = new ArrayList<Integer>();

        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) % 2 != 0) {
                newNumberList.add((arrayList.get(index) * 3) + 2);
            } else {
                newNumberList.add(arrayList.get(index));
            }
        }
//        throw new NotImplementedException();
        return newNumberList;
//        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sumOfList = 0;

        for (int index = 0; index < arrayList.size(); index++) {
            int newListAfterCal = (arrayList.get(index) * 3) + 2;
            sumOfList += newListAfterCal;
            System.out.println(sumOfList);
        }
//        throw new NotImplementedException();
        return sumOfList;
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sumEvenNumber = 0;

        if(leftBorder < rightBorder) {
            for (int start = leftBorder; start <= rightBorder; start++) {
                if (start % 2 == 0) {
                    sumEvenNumber += start;
                }
            }
        }else {
            for (int start = rightBorder; start <= leftBorder; start++) {
                if (start % 2 == 0) {
                    sumEvenNumber += start;
                }
            }
        }
        return sumEvenNumber;
//        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sumOddNumber = 0;

        if (leftBorder < rightBorder) {
            for (int start = leftBorder; start <= rightBorder; start++) {
                if (start % 2 != 0) {
                    sumOddNumber += start;
                }
            }
        } else {
            for (int start = rightBorder; start <= leftBorder; start++) {
                if (start % 2 != 0) {
                    sumOddNumber += start;
                }
            }
        }
        return sumOddNumber;
//        throw new NotImplementedException();
    }
}
