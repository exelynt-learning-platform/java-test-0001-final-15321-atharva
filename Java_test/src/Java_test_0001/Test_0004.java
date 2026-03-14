package Java_test_0001;

public class Test_0004 {

	public static void main(String[] args) {
		
		 int n=4;
	        int size = 2*n-1;

	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {

	                int rowdist = i-(n-1);
	                if (rowdist < 0) rowdist = -rowdist;

	                int coldist = j-(n-1);
	                if (coldist < 0) coldist = -coldist;

	                int max = rowdist;
	                if (coldist > max) {
	                    max = coldist;
	                }

	                System.out.print((max+1) + " ");
	            }

	            System.out.println();
	        }

	}

}
