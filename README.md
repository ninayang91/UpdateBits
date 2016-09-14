# UpdateBits
Insert M into N such that M starts at position j and ends at position i

	//Given two 32-bit numbers M and N; and two bit positions i and j;
	
	//insert M into N such that M starts at bit j and ends at bit i
	
	//bits j through i have enough space to fit all of M

Write a mask first, to clear N from j to i, (mask & N) |(M<<i)

if i=2, j=4, mask =11111100011

