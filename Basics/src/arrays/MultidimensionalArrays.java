package arrays;
import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		
		//NOTES TO remember:   x.length = Number of Rows.  VERSUS  x[i].length = number of elements inside row i
		
		// multidimensional arrays are:  1 dimensional arrays of N number of elements(Rows) where each element(Row) is an array of Z number of elements(Columns).
		
//declare a partial multidimensional array where row is defined but not column		
char[][] ary = new char[5][];
	  ary[0] = new char[2];   //add 2 column for row zero.    [0][0] and [0][1] exist now.
		
		
//USING LOOPS to print out every element of 2D Arrays by individual indexing x[i][j]
		int[][] x= { {1,2,4},{3,7,8,9}, {9,1,1}  };  // { {row 1 or x[0] } , {row 2 r x[1] } }
		
									/*  NOTE: 1st row=> x[0].length = number of elements 1st row = 3  =>{1,2,4}
								              2nd row=> x[1].length =>number of elements 2nd row =3   =>{3,7,8}         */
		
		for (int i=0;i<=x.length-1;i++)   //x.length-1 = 3-1 = 2
		{
			for (int j=0;  j<= x[i].length-1  ;j++)  //loops through the length of the row(every element).
				System.out.print(x[i][j]+"\t");
				System.out.println();
		}
		System.out.println();
		
		
//RETRIEVING VALUE OF AN ELEMENT OF A 2-DIMENSIONAL ARRAY		
		System.out.println("The value of the element x[2][0]  of this 2-D array is : "+x[2][0]);

		
		
//Loop  through every element of 2-D array and find average value.
		double sum=0;
	
for (int i=0;i<= x.length-1;i++)       // Loop through Rows
{
for (int j=0;j<= x[i].length-1;j++)    // Loop through Columns (elements inside row)
{
	sum += x[i][j];
			
}	

}  //sum/total elements        total elements = sum of x[i].length for each Row.
	System.out.println("The average of all elements of this 2-D array is "+
(sum/(x[0].length+   x[1].length+  x[2].length)));	//or you can divide sum by a counter variable that you include inside the 2nd for loop above
		
		System.out.println();
		System.out.println();
		
		
		
//USING toString method to print every element of 2D array. (by looping through each Row.)
		int [][] y= new int [4][6];             //declaring array with 4 rows with 6 columns each -->all members initialized to 0
		System.out.println();
		
		
		//printing elements of specific row  (Row #1):
		System.out.println("Printing 1st row of the array is :");
		System.out.println(Arrays.toString(y[0]));


		
		//note y.length gives number of Rows.  
		//So we use loop to print every Row of the Array:
System.out.println("Printing all rows of the Array:");
for (int i=0;i<=y.length-1;i++)        			//Remember 2D array is an array inside an array.  { {  } , {  } } 
												// length of 1-D array = the number of its elements.
	System.out.println(Arrays.toString(y[i]));  // toString method must be repeated for every Row										// but in a 2D array, the elements inside the array are arrays.
	                                     		// in other words, 2-D arrays are composed of a bunch of 1-D arrays
												// one 1-D array is actually visually a Row in the Array grid.
	                                   			//In other words, we consider the elements of a 2-D array as being Rows(or 1-D arrays).
	                                   			//  Therefore, the length of a 2-D array is the number of its Rows.
	

		

System.out.println("The length of the 2-D array y[4][6] is :  "+y.length); 
System.out.println("The length of the 3rd 1-D array(3rd row) of the 2-Dimensional array y[4][6] is: "+y[3].length);
System.out.println();
System.out.println();


// SUM OF 2 MATRICES (math rule: can only add if they are same size).
int[][] a = { {10,20}, {30,40}, {50,60} };
int[][] b = { { 1,2 },  {3,4},  {5,6} };

int numrows=a.length;    
int numcols=a[0].length;
int [][] sumaab = new int [numrows][numcols];   //declare new matrix of size of same size

for (int i=0; i<= numrows-1; i++)     // loop through row & columns and use index positions [i][j] and copy in identical location in new matrix.
{
	for (int j=0; j<= numcols-1 ; j++)
	sumaab[i][j] = a[i][j]+b[i][j];
}


for (int i=0; i<=sumaab.length-1;  i++)    // Loop by each row and use toString method to print
	System.out.println(Arrays.toString(sumaab[i]));

System.out.println();



			/// ADDITION OF DIAGONALES OF SQUARE MATRIX
int[][] ab= { { 1,2,3 }, { 5,6,7}, {9,10,11}};

//print the 2D-array
System.out.println("The addition of the diagonals of the 2-D array below is(without double counting middle element)");

for (int i=0;i<=ab.length-1;i++)
System.out.print(Arrays.toString(ab[i])+"\n");


   // note the diagonales are always  1,1   2,2   3,3   4,4..... etc
sum=0;
	for (int i=0;i<=ab.length-1;i++)
	sum+=ab[i][i];	
	
	for (int i=0,j=ab.length-1; j>=0;  i++,j--)
	{
	sum+=ab[i][j];	
	}
	
	//if odd square, then remove the middle element ex: (3,3) of a 3 length square.  TO AVOID double counting(already counted previous loop)
	if (ab.length%3==0)
	sum-=ab[ab.length/2][ab.length/2];
	
System.out.print(sum);	




  /// Verify if 2 arrays content all of the same elements but in no particular order.

char[] geb= {'a','e','d','1'};
char[] geb2= {'a','d','e','1'};

int counter=0;
boolean answer=true;

for (int i=0;i<=geb.length-1;i++)
{
	for (int j=0;j<=geb2.length-1;j++)
if (geb[i]==geb2[j])
{
	counter++;
	
}	   // if more than 1 match, then both arrays cannot contain ALL identical items since they are of the same size.
if ((counter!=1))
{
	answer=false;
	break;   //abort if more than 1 match. reach conclusion.
}
	else
		counter=0;


}

System.out.println(answer);
System.out.println();




//MAGIC square:  Verify that sum of each column = sum of each row = sum of 2 diagonals

int magic1[][] =  {  {4,9,2},
 					 {3,5,7},
 					 {8,1,6}    };






// for sum of diagonales
int sumDiag1=0;
int sumDiag2=0;

//diagonal(left)
	for (int m=0;m<=magic1.length-1;m++)
		sumDiag1+=magic1[m][m];

	//diagonal(right)
	for (int k=0,l=magic1.length-1-k;k<=magic1.length-1;k++)
		sumDiag2+=magic1[k][l];


	int sumRow=0;
	int sumCol=0;
	boolean lastAnswer=false;
for (int i=0;i<=magic1.length-1;i++)   //outer loop: for each Row
{
	if (sumRow!=sumCol)   //verify each sums found below for every loop.  exit loop as soon as sums of columns is NOT equal to sums of rows  
	{							//no point continuing since not equal.
		answer=false;
		break;
		
	}   
	sumRow=0;
	sumCol=0;
	for (int j=0;j<=magic1[i].length-1;j++)   //inner loop for each column
	{
		sumRow+=magic1[i][j];   
		sumCol+=magic1[j][i];			//every iteration of inner loop finds sum of a column and sum of a row. 
	}
	
	// on every iteration of sumRow and sumCOl found, compare with Sum Diags. (some boolean omitted by transitivity)
	if ((sumRow==sumCol)&&(sumRow==sumDiag1)&&(sumCol==sumDiag2))
	lastAnswer=true;
	
	else
	{
		lastAnswer=false;
		break;
	
	
	} 
}


System.out.print(lastAnswer);
System.out.println();
System.out.println();






///  CREATE MULTIPLICATION TABLE AND STORE INSIDE ARRAY:   Example multiplication table of 1 to 9.
int[][] abc= new int[9][9];


int z=1;
int w=0;
for (int k=0;k<=abc.length-1;k++)
{
	for (int l=0;l<=abc[k].length-1;l++)
	{

	abc[k][l]=z+(z*w);
	w++;
	
		
		
	}
	z++;
	w=0;
}	
			
for (int i=0;i<=8;i++)
System.out.println(Arrays.toString(abc[i])); 




//Transposing a matrix.

int[][] twod = { { 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }   };

final int LIM = twod.length;
for (int j = 0; j < LIM; j++)
for (int k = 0; k < LIM; k++)
	if(k>j)   //this condition is key!!! or will not work =>    if not, it will transpose twice. ex: 0,1 to 1,0  
{														//    then it will permit to transpose from 1,0 to 0,1 when loop reaches j=1,k=0  to transpose again.
int temp = twod[j][k];									// so by selecting EITHER j>k or k>j ,  we avoid double transposing (thus causing no change at all)
twod[j][k] = twod[k][j];
twod[k][j] = temp;
}


for (z=0;z<=twod.length-1;z++)
System.out.println(Arrays.toString(twod[z]));


 					 
	}

}
