package BackTracking;

public class SolvetheSudokuG4G {
    public void solveSudoku(int[][] mat) {
        backtrack(mat,0,0);

    }
    boolean backtrack(int[][] mat, int i, int j){
        if(i==9){
            return true;
        }
        if(j==9){
            return backtrack(mat,i+1,0);
        }
        if(mat[i][j]!=0){
            return backtrack(mat,i,j+1);
        }

        for(int k=1;k<10;k++){
            if(isCorrect(mat,i,j,k)){
                mat[i][j]=k;
                if(backtrack(mat,i,j+1))return true;
                mat[i][j]=0;
            }
        }
        return false;
    }

    boolean isCorrect(int[][] mat, int i, int j, int num){

        for(int k=0;k<9;k++){
            if(mat[i][k]==num)return false;
        }
        for(int k=0;k<9;k++){
            if(mat[k][j]==num)return false;
        }
        int i1 = i/3 * 3;
        int j1 = j/3 * 3;
        for(int i2 = i1;i2<i1+3;i2++){
            for(int j2=j1;j2<j1+3;j2++){
                if(mat[i2][j2]==num)return false;
            }
        }
        return true;
    }
}
