
import java.io.*;

public class MagicSquare 
{
	// Matrix where we will store the magic squares
	Matrix m;
	
	// Fill up the magic square from the data in the file
	public MagicSquare(String filename) throws IOException
	{
		// Open the file
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        
        // Read a row of text
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null) 
        {
        	// Split the text by tab
            String[] parts = line.split("\t");
            
            // Create the matrix if we haven't from the number of parts
            if (m == null)
            {
            	m = new Matrix(parts.length, parts.length);
            }
            
            // Set the matrix from the line
            for (int j=0; j<parts.length; j++)
            {
            	double value = Double.parseDouble(parts[j]);
                m.setMatrixValue(i, j, value);
            }
            
            // Increment the line number
            i++;
        }
        
        reader.close();
	}
	
	// Get the sum of the i-th column
	public double sumColumn(int i)
	{
		return 0;
	}
	
	// Get the sum of the j-th row
	public double sumRow(int j)
	{
		return 0;
	}
	
	// Check if this is a magic square or not
	public boolean isMagic()
	{
		return false;
	}
	
	// String representation which is just the matrix representation
	public String toString()
	{
		return m.toString();
	}
}
