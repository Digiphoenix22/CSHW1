import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# Read the CSV data
data = pd.read_csv("C:\\Users\\ethob\\Desktop\\IDGAHarvestGameJam\\CSHW1\\CSHW1\\output.csv")

# Plotting
plt.figure(figsize=(10, 6))
plt.plot(data['Size'], data['TimeTaken'], '-o', label='Binary Search', color='blue')

# Adding a reference line (theoretical time complexity of binary search)
x_vals = np.array(data['Size'])
y_vals = x_vals * np.log2(x_vals)  # Just a sample, adjust coefficient as needed
plt.plot(x_vals, y_vals, '--', color='red', label='Reference O(log n)')

plt.xlabel('Size of Array')
plt.ylabel('Time (nanoseconds)')
plt.title('Time Complexity of Binary Search')
plt.legend()
plt.grid(True, which='both', linestyle='--', linewidth=0.5)
plt.xscale('log')
plt.yscale('log')
plt.tight_layout()

plt.show()
