
package oddEVEN;

import java.util.List;

class SpiralMatrix {
  int[] spiralOrder(int[][] matrix) {

    int left = 0;
    int top = 0;
    int right = matrix[0].length;
    int bottom = matrix.length;
    int[] res = new int[matrix[0].length * matrix.length];
    int index = 0;
    while (left < right && top < bottom) {

      for (int i = left; i < right; i++) {
        res[index++] = matrix[top][i];
      }
      top += 1;

      // res= [1,2,3,4]
      // top = 1
      for (int i = top; i < bottom; i++) {
        res[index++] = matrix[i][right - 1];
      }
      right -= 1;
      // res= [1,2,3,4]
      // [_,_,_,8]
      // [_,_,_,4]
      // right - = 1; -> 3
      if (left < right && top < bottom)
        for (int i = right - 1; i >= left; i--) {
          res[index++] = matrix[bottom - 1][i];
        }
      bottom -= 1;
      // res= [1,2,3,4]
      // [_,_,_,8]
      // [1,2,3,4]
      // bottm - = 1; -> 2

      for (int i = bottom - 1; i >= top; i--) {
        res[index++] = matrix[i][left];
      }
      left += 1;

    }

    return res;

  }
}