class Solution {
    public int findMinMoves(int[] machines) {
        int size = machines.length , sum =0;
        for(int i=0;i<size;i++){
            sum = sum + machines[i];
        }
        if(sum%size !=0){
            return -1 ;
        }
        int target=sum/size;
        int currDiff , netSoFar=0,move=0;
        for(int i=0;i<size;i++){
            //currDiff=target-machines[i];
            currDiff=machines[i]-target;
            netSoFar+=currDiff;

            if(Math.abs(netSoFar)>move)
                move=Math.abs(netSoFar);

            /*if(-currDiff>move)
                move=-currDiff;
        
            */
            if(currDiff>move)
                move=currDiff;
            
        }
        return move;
    }
}