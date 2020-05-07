//
// By- Joydeep Biswas [27/04/2020]
//
//solution for 100 points 
//
//O(nlogn) complexity
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class PowerSeedsSolution {
    public static void main(String args[] ) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		while(t-->0) {
			String[] s = reader.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			int[] arr = new int[n];
			String[] input = reader.readLine().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(input[i]);
			}
            Arrays.sort(arr);
			int l=0;
			int r=n-1;
			int count=0;
			while(l<r) {
				if(Math.abs(arr[l]+arr[r])==k) {
					count++;
					l++;
					r--;
				}
				else if(Math.abs(arr[l]+arr[r])>k) {
					r--;
				}
				else if(Math.abs(arr[l]+arr[r])<k) {
					l++;
				}
			}
            System.out.println(count);
		}

    }
}
