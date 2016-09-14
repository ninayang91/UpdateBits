
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Given two 32-bit numbers M and N; and two bit positions i and j;
	//insert M into N such that M starts at bit j and ends at bit i
	//bits j through i have enough space to fit all of M
	public static int updateBits(int N, int M, int i, int j){
		//Suppose i=2, j=4, we need a mask like 11100011
		int left = ~((1<<(j+1))-1);//111100000, (j+1)0s
	    int right = (1<<i)-1;//0000000011, i 1s
		int mask=left|right;//11100011
		return (mask&N)|(M<<i);
	}

}
