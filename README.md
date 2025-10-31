- Build: `javac -d build -sourcepath src src/Main.java`
- Run: `java -cp build Main`
- Example: `javac -d build -sourcepath src src/Main.java && java -cp build Main ./input/standard/matrix-1.txt ./input/standard/matrix-2.txt ./output-matrix.txt`

---

# CMPE436 Matrix Multiplication Assignment
- This project created for the Assignment-1 Question-1 of CMPE436 course
- It is simply calculating the multiplication of two matrices
- It has 3 classes apart from the Main class
    - `MatrixMultiplicator`: Handling the matrix multiplication
    - `MatrixReader`: Reading matrices from the input files and storing them in chosen data structure
    - `MatrixWriter`: Writing the result matrix into the output file (Which should be given as an argument to the program)

## Test-Cases
- This repository includes the input files for testing possible errors and edge cases. They can be found in the `input` folder
- They are all have expected outcome file. If any of them not have that, then that case should give an error in the terminal which is explaining the problem.
- Required command to test each one of them can be found below:

**Identity-Matrix**: `javac -d build -sourcepath src src/Main.java && java -cp build Main ./input/identity-matrix/matrix-1.txt ./input/identity-matrix/matrix-2.txt ./output-matrix.txt`

**Incompatible-Dimensions**: `javac -d build -sourcepath src src/Main.java && java -cp build Main ./input/incompatible-dimensions/matrix-1.txt ./input/incompatible-dimensions/matrix-2.txt ./output-matrix.txt`

**Negative-Numbers**: `javac -d build -sourcepath src src/Main.java && java -cp build Main ./input/negative-numbers/matrix-1.txt ./input/negative-numbers/matrix-2.txt ./output-matrix.txt`

**Non-Square-Matrices**: `javac -d build -sourcepath src src/Main.java && java -cp build Main ./input/non-square-matrices/matrix-1.txt ./input/non-square-matrices/matrix-2.txt ./output-matrix.txt`

**Outer-Product**: `javac -d build -sourcepath src src/Main.java && java -cp build Main ./input/outer-product/matrix-1.txt ./input/outer-product/matrix-2.txt ./output-matrix.txt`