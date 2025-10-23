package Arrays;
import java.util.*;
public class ValidSudoku {

        public boolean isValidSudoku(char[][] board) {
            boolean num[] = new boolean[9];
            for(int i=0;i<9;i++){
                Arrays.fill(num,false);
                for(int j=0;j<9;j++){

                    if(Character.isDigit(board[i][j])){
                        int number = board[i][j] - '0';
                        if(num[number-1]==false){
                            num[number-1] = true;
                        }else{
                            return false;
                        }
                    }
                }
            }
            for(int j=0;j<9;j++){
                Arrays.fill(num,false);
                for(int i=0;i<9;i++){

                    if(Character.isDigit(board[i][j])){
                        int number = board[i][j] - '0';
                        if(num[number-1]==false){
                            num[number-1] = true;
                        }else{
                            return false;
                        }
                    }
                }
            }
            for(int i=0;i<9;i+=3){
                for(int j=0;j<9;j+=3){
                    Arrays.fill(num,false);
                    for(int k=i;k<i+3;k++){
                        for(int l=j;l<j+3;l++){
                            if(Character.isDigit(board[k][l])){
                                int number = board[k][l] - '0';
                                if(num[number-1]==false){
                                    num[number-1] = true;
                                }else{
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }

}
