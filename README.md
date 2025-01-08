# Intelligent Elevator Stop Optimizer

This project addresses the challenge of optimizing elevator stops in a tall building to minimize the total walking distance for passengers while adhering to constraints such as a maximum number of stops per trip. Implemented using Java, the solution leverages both **Dynamic Programming** and **Greedy Algorithms** to evaluate and optimize elevator operations effectively.

## Problem Statement

The objective is to minimize passenger walking distances by optimizing elevator stops, considering:
- A maximum of `k` stops per trip.
- Tie-breaking by prioritizing stops at the lowest floors to conserve energy.
- Flexibility to stop at floors other than those requested by passengers for better optimization.

## Features
- **Algorithm Implementations**:
  - **Greedy Algorithm**: Selects floors with the lowest walking cost iteratively.
  - **Dynamic Programming**: Formulates the problem with overlapping subproblems to achieve an optimal solution.
- **Optimization**:
  - Minimized total walking distance for passengers.
  - Tie-breaking to conserve energy and enhance user experience.
- **Custom Cost Function**: Calculates walking distance for each floor to guide stop selection.
  
## Technical Highlights
- **Programming Language**: Java
- **Key Libraries**:
  - `java.util.ArrayList`
  - `java.util.Collections`
- **Data Structures**:
  - Arrays for cost calculations.
  - ArrayLists for dynamic storage of selected stops.
- **Experimental Results**:
  - Quantitative outputs demonstrating the efficiency of the solution for various test cases.

## Results
### Example Case
Input:
- Number of stops (`k`): 3
- Destination floors: `[1, 2, 4, 7, 9, 13]`
- Total floors: 15

Output:
- Optimized stops: Floors `4`, `6`, and `8`.
- Costs for each floor:
  - Floor 1: 30, Floor 4: 22, Floor 6: 22, Floor 8: 24, Floor 15: 54 (and more).

## How It Works
### Greedy Algorithm
1. **Selection**: Identify the floor with the minimum walking cost.
2. **Feasibility Check**: Ensure proximity to current stops for optimal coverage.
3. **Solution Check**: Repeat until the required number of stops (`k`) is reached.

## Experimental Setup
- Conducted simulations with various `k` values and destination lists.
- Evaluated time and space complexity for both approaches.

## Future Improvements
- Enhance performance for larger datasets with optimized data structures.
- Integrate real-time data processing for dynamic rider input.
- Extend to multi-elevator systems for complex building layouts.

## Contributors
- **Mohd Muhtasim Bashar**  
- **Mohd Ridhwanul Hoque**

## Conclusion
This project demonstrates a practical approach to elevator stop optimization using algorithmic design principles, showcasing efficiency and scalability for real-world applications.

