package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1524_NumberOfSubArraysWithOddSumTest {
    P1524_NumberOfSubArraysWithOddSum test = new P1524_NumberOfSubArraysWithOddSum();
    @Test
    public void numOfSubarrays() {
        assertEquals(12, test.numOfSubarrays(new int[]{5,4,4,5,1,3}));
        assertEquals(4, test.numOfSubarrays(new int[]{1, 3, 5}));
        assertEquals(4, test.numOfSubarrays(new int[]{1, 3, 1}));
        assertEquals(4, test.numOfSubarrays(new int[]{100, 100, 99, 99}));
        assertEquals(592124, test.numOfSubarrays(new int[]{40,41,9,11,73,47,4,63,72,79,67,10,63,15,11,39,8,2,35,53,29,82,81,22,71,15,95,37,41,45,53,90,35,63,13,18,7,99,49,11,97,52,28,90,13,81,31,6,98,69,91,98,62,70,68,60,18,87,35,15,56,30,70,21,31,36,35,87,94,65,25,22,94,13,43,89,39,90,52,30,11,76,42,52,81,80,25,3,35,12,95,86,4,27,86,70,94,13,61,92,8,81,68,85,88,52,99,22,62,13,97,9,40,84,28,23,71,46,1,59,3,16,42,38,88,98,47,44,97,87,94,57,19,75,61,54,7,100,3,74,13,15,43,75,67,69,35,44,12,91,12,9,5,82,68,82,14,20,36,45,69,97,99,35,28,43,27,92,96,98,13,43,69,16,88,15,12,50,45,45,20,69,31,100,95,44,98,50,80,67,71,15,33,46,75,53,33,9,21,44,62,53,39,50,15,92,49,16,86,58,73,55,45,34,20,51,71,27,56,15,80,100,19,63,84,63,3,36,51,38,22,24,54,54,45,93,96,80,94,74,8,70,20,24,79,72,15,23,94,32,10,78,81,91,45,59,52,62,72,11,10,9,41,31,49,67,95,7,96,78,3,86,73,98,37,46,54,99,90,70,28,31,50,51,43,24,9,46,17,35,57,54,57,58,52,77,86,3,91,34,7,25,70,91,97,53,55,54,16,67,76,90,95,9,61,32,77,47,41,20,28,53,85,33,90,84,80,4,69,49,66,51,43,39,86,97,39,20,41,80,95,7,75,3,15,15,14,45,21,54,59,65,74,30,56,38,6,67,88,47,81,23,58,30,26,16,90,95,90,88,62,69,53,64,75,22,20,13,19,12,24,33,17,2,82,5,60,55,91,93,33,11,48,83,24,19,45,84,18,86,76,30,72,62,95,1,4,56,10,56,100,75,49,23,66,96,77,28,82,90,42,50,5,52,1,7,8,53,60,25,33,26,65,11,63,60,46,32,33,100,74,55,56,9,59,55,81,96,28,68,42,17,83,8,38,78,91,23,39,80,88,5,52,76,63,14,72,35,11,30,49,85,72,57,90,13,33,24,65,21,21,84,51,30,92,34,100,74,10,13,41,6,48,96,80,39,34,33,43,9,88,47,67,63,9,58,83,70,46,48,43,9,32,7,74,26,25,66,76,3,54,67,68,14,86,67,59,60,6,19,88,16,61,59,33,8,61,84,32,96,3,71,31,29,95,25,43,36,4,84,88,66,84,78,93,96,24,23,62,92,5,93,21,31,72,28,49,6,58,27,10,85,84,83,54,82,100,9,59,88,67,30,7,97,28,26,94,89,94,3,25,52,2,5,41,17,75,73,36,94,87,29,59,15,50,40,40,89,66,26,84,71,55,32,50,43,9,37,79,37,88,92,48,13,3,11,73,54,29,24,81,50,10,40,55,15,48,32,59,10,21,95,17,80,80,15,28,58,43,7,77,79,59,61,96,17,56,87,76,33,78,7,60,58,55,13,100,100,95,91,65,78,59,36,18,17,15,50,17,48,76,52,70,30,8,6,77,88,100,84,52,70,72,97,79,67,83,82,18,16,65,87,30,89,20,15,82,93,8,68,48,64,68,13,72,54,86,35,74,92,71,55,11,80,55,64,30,19,11,93,44,53,7,26,10,32,13,24,7,37,47,55,81,17,50,93,92,94,1,73,81,41,64,49,46,4,77,87,35,28,33,81,16,44,37,92,57,42,38,51,71,46,44,91,94,50,75,17,88,63,35,95,85,85,90,31,27,61,2,42,52,45,41,83,45,35,55,15,54,51,67,41,23,51,14,81,42,41,12,99,5,60,77,55,79,55,43,12,6,99,56,92,87,30,61,2,44,19,61,27,21,60,36,31,35,83,11,78,88,36,79,45,38,55,39,97,52,49,57,6,20,41,73,46,84,57,42,62,20,45,57,72,37,100,95,32,64,32,56,51,36,49,79,62,13,34,18,68,76,39,79,45,52,72,8,89,71,40,42,27,5,98,20,92,4,63,70,44,52,16,2,34,11,43,87,69,22,10,12,93,7,49,36,98,85,91,23,90,66,97,62,2,12,68,37,43,73,10,26,69,48,8,29,96,49,11,32,14,6,18,28,3,92,72,30,22,13,56,26,54,98,80,92,74,32,96,59,32,86,48,83,64,69,45,13,92,61,72,8,25,31,94,63,20,19,41,62,71,38,78,43,96,27,52,80,49,50,45,92,99,74,17,65,97,20,62,81,96,74,83,37,99,100,13,91,55,95,11,28,42,67,74,20,1,85,20,92,10,66,3,32,31,25,56,67,86,27,88,62,48,59,67,10,64,91,47,66,74,7,62,12,12,74,24,48,81,82,97,81,99,67,49,43,42,7,18,79,47,78,14,61,58,33,19,55,68,45,54,55,51,8,8,14,99,25,49,52,1,60,62,54,15,59,97,66,18,72,6,84,11,20,76,22,42,34,6,44,28,76,93,37,94,20,25,57,18,46,59,23,11,21,73,77,100,25,10,30,64,77,12,45,79,54,74,62,2,37,24,19,12,46,30,75,32,20,31,72,72,67,38,13,14,6,79,26,58,98,36,9,21,5,31,77,10,56,72,45,68,31,33,20,43,9,76,74,87,22,92,96,68,83,2,73,35,98,79,89,87,5,72,83,61,100,34,28,34,35,1,17,56,43,43,5,75,64,46,93,71,87,20,72,51,56,65,63,41,88,30,46,28,38,88,67,32,86,68,82,87,43,42,82,16,53,75,79,43,23,13,55,85,9,48,4,5,96,26,61,13,49,84,74,90,28,78,40,28,5,87,99,51,38,10,87,33,43,22,73,88,79,7,16,42,3,73,30,29,37,91,82,95,78,73,91,62,78,66,100,90,30,46,7,28,74,84,96,2,4,19,99,1,70,98,18,25,50,48,22,46,79,44,80,24,34,51,66,64,48,54,80,41,44,98,97,23,84,20,99,65,21,35,91,57,42,61,60,22,88,91,11,25,70,92,17,32,12,66,51,79,10,27,61,85,78,92,29,65,51,35,30,55,5,43,75,15,16,41,18,66,67,3,71,75,84,11,96,46,5,99,72,89,78,100,14,85,59,96,70,32,19,34,3,50,44,27,95,6,50,51,35,85,5,99,90,53,55,43,7,66,85,12,14,94,84,18,42,27,42,14,80,50,41,34,28,59,92,79,8,31,61,73,78,87,6,14,13,64,36,85,9,17,63,54,38,98,46,37,81,99,62,27,28,38,76,29,25,9,73,100,44,57,14,29,52,86,36,24,39,88,99,81,77,4,29,2,5,73,37,14,21,36,95,76,26,13,67,15,33,19,76,95,72,38,92,93,32,53,95,80,87,42,3,3,25,27,3,95,6,30,58,73,83,68,88,63,51,27,94,46,49,57,15,18,80,46,28,22,82,93,41,56,30,29,3,66,22,66,46,17,46,100,57,81,34,29,71,26,1,33}));
    }
}