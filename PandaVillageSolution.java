//
// By - Joydeep Biswas - 24/04/2020
//
//for 100 points
//
import java.io.*;
import java.util.*;
import java.lang.*;
class PandaVillageSolution {
     static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    public static void main(String args[] ) throws Exception {
        FastReader s=new FastReader(); 
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            int[] p = new int[n];
            for(int i=0;i<n;i++){
                x[i] = s.nextInt();
            }
            for(int i=0;i<n;i++){
                y[i] = s.nextInt();
            }
            int d=0;
            for(int i=0;i<n;i++){
                d^=x[i]^y[i];
            }
            for(int i=0;i<n;i++){
                p[i] = x[i]^d;
            }
            Arrays.sort(y);
            Arrays.sort(p);
            int i=0;
            for(i=0;i<n;i++){
                if(y[i]!=p[i])
                    break;
                
            }
            if(i<n){
                System.out.print("-1"+"\n");
            }
            else{
                int temp=0;
                for(i=0;i<n;i++){
                    temp^= y[i];
                }
                System.out.print("YES "+temp+"\n");
            }
        }

    }
}
