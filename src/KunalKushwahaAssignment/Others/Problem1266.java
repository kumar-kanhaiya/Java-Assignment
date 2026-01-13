package KunalKushwahaAssignment.Others;

public class Problem1266 {
    static void main() {
        int[][] arr = {
                {1,1},{3,4},{-1,0}
        };
        int[][] secondCase = {{3,2},{-2,2}};
        System.out.println(minTimeToVisitAllPoints(arr));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        if(points.length < 1){
            return ans;
        }
        for (int i = 1; i < points.length ; i++) {
            int f = points[i-1][0];
            int s = points[i-1][1];
            int fn = points[i][0];
            int sn = points[i][1];

            while(f != fn || s != sn){
                if(f == fn){
                    if(s < sn){
                        ans++;
                        s++;
                    }
                    else{
                        ans++;
                        s--;
                    }
                }
                else if(s == sn){
                    if(f<fn){
                        ans++;
                        f++;
                    }
                    else{
                        ans++;
                        f--;
                    }
                }
                else if (f < fn && s<sn){
                    f++;
                    s++;
                    ans++;
                }
                else{
                    f--;
                    s--;
                    ans++;
                }
            }
        }


        return ans;
    }


}
