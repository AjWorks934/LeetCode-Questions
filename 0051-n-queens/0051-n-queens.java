class Solution {
public boolean check(int row, int j,char Q[][]){
    //col
    int temp=row;
    while( temp>=0){
        if(Q[temp][j]=='Q')
        return false;
        temp--;
    }
    //left diagonal
    temp=row; int tempc=j;
    while(temp>=0 && tempc>=0 ){
        if(Q[temp][tempc]=='Q')
        return false;
        temp--;
        tempc--;
    }
    temp=row;  tempc=j;
    while(temp>=0 && tempc<Q.length ){
        if(Q[temp][tempc]=='Q')
        return false;
        temp--;
        tempc++;
    }
    return true;
}

public void solve(int row,char Q[][],List<List<String>> res){
    int n=Q.length;
    if(row>n-1){
         List<String> str = new ArrayList<>();
            for(int j = 0; j<n; j++){
                str.add(new String(Q[j]));
            }
            res.add(str);
            return;
    }
    for(int j=0;j<n;j++){
            if(check(row,j,Q)){
                Q[row][j]='Q';
                solve(row+1,Q,res);
                Q[row][j]='.';
            }
        }
        return;
    }

    public List<List<String>> solveNQueens(int n) {
        char Q[][]=new char[n][n];
        for(char arr[]:Q){
            Arrays.fill(arr,'.');
        }
        List<List<String>> result =new ArrayList<>();
        solve(0,Q,result);
        return result;
}
}