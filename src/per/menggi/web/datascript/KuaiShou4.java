package per.menggi.web.datascript;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KuaiShou4 {
    public static void main(String[] args) {
        char[][] s = {
                {'*','.','*','*','.'},
                {'*','.','*','*','*'},
                {'*','.','*','*','.'}
        };
        System.out.println(new KuaiShou4().GetMaxStaffs(s));
    }

    class Node {
        public int x;
        public int y;

        public Node(int a, int b) {
            this.x = a;
            this.y = b;
        }
    }

    public int GetMaxStaffs(char[][] pos) {
        // write code here
        int row = pos.length;
        int col = pos[0].length;
        boolean[][] vi = new boolean[row][col];
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pos[i][j] == '.') {
                    stack.push(new Node(i, j));
                }
            }
        }
        int count = 0;
        int[][] dirc = {
                {1, 0},
                {-1, 0},
                {0, -1},
                {0, 1}
        };
        System.out.println(stack.size());
        next:
        while (!stack.empty()) {
            Node node = stack.pop();
            for (int i = 0; i < 4; i++) {
              if(vi[node.x][node.y] ){
               continue next;
              }
              if( node.x+dirc[i][0] >= row || node.x+dirc[i][0] < 0 || node.y+dirc[i][1] >=col || node.y+dirc[i][1] < 0){
                 continue ;
              }
              if(vi[node.x+dirc[i][0]][node.y+dirc[i][1]]){
                  continue  next;
              }
            }
            vi[node.x][node.y] = true;
            count++;
        }
        return count;
    }

}
