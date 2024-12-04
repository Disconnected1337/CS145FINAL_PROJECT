#HELLO DARELL, I DID MY CODE IN PYTHON
#I GOT TONS OF HELP FROM KAI AS PER USUAL
#I WOULD LIKE TO BE REWARDED HANDSOMELY IF YOU WOULDNT MIND!


#Alonzo Turner
#CS145
#Pascals Triangle

#This code's purpose is to take a number and generate that many rows of Pascal's Triangle


def generate_pascals_triangle(n):
    # Mathematical Calculation
    def pascal_value(row, col):
        # Base cases
        if col == 0 or col == row:
            return 1
        else:
            # Recursion 
            return pascal_value(row - 1, col - 1) + pascal_value(row - 1, col)

    # Trianglular Generation
    triangle = []
    for row in range(n):
        current_row = []
        for col in range(row + 1):
            current_row.append(pascal_value(row, col))
        triangle.append(current_row)
    
    return triangle

# Number of rows
x = 4
num_rows = x
triangle = generate_pascals_triangle(num_rows)

# Print rows to create triangle shape
for row in triangle:
    print(row)
