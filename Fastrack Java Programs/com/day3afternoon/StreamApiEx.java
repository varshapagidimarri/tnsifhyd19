package com.day3afternoon;
import java.util.*;
/*
  Intermediate Operations:
filter(): Filters elements based on a predicate.
map(): Transforms elements into a new type.
flatMap(): Maps each element to a stream and flattens the resulting streams.
distinct(): Returns a stream with distinct elements.
sorted(): Returns a sorted stream.
limit(): Returns a stream with a specified number of elements.
skip(): Skips a specified number of elements.

Terminal Operations:
forEach(): Performs an action for each element.
collect(): Collects elements into a collection or other data structure.
reduce(): Combines elements into a single value.
findAny(): Returns an optional element.
findFirst(): Returns the first element.
max(): Returns the maximum element.
min(): Returns the minimum element.
count(): Returns the number of elements.
Intermediate operations: These operations create a new stream based on the original stream without consuming it.
Terminal operation: This operation consumes the stream and produces a result.
 */
public class StreamApiEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Find the sum of even numbers greater than 3
        int sum = numbers.stream()
                         .filter(n -> n > 3)// Filters numbers greater than 3.
                         .filter(n -> n % 2 == 0)//Filters even numbers.
                         .map(n -> n * n) // Square each even number
                         .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers greater than 3: " + sum);
	}

}
