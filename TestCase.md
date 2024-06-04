# Test case for Simple Calculator

## Test case 1: Addition
- Input: 10, 5, 1
- Expected output: 15
- Observations: works as expected.

## Test case 2: Subtraction
- Input: 10, 5, 2
- Expected output: 5
- Observations: works as expected.

## Test case 3: Multiplication
- Input: 10, 5, 3
- Expected output: 50
- Observations: works as expected.

## Test case 4: Division
- Input: 10, 5, 4
- Expected output: 2
- Observations: works as expected.

## Test case 5: Division by zero
- Input: 10, 0, 4
- Expected output: error message
- Observations: properly handles division by zero.

## Test case 6: Invalid number input
- Input: "xyz", 2, 1
- Expected output: prompt for valid input
- Observations: properly prompts for valid input.

## Test case 7: Invalid operation selection
- Input: 4, 2, 5
- Expected output: prompt for valid input
- Observations: properly prompts for valid operation.

## Test case 8: Exit program
- Input: 'no' at the prompt to perform another calculation
- Expected output: program exits with "Goodbye!"
- Observations: program exits as expected.