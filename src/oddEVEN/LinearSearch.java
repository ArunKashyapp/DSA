package oddEVEN;
class LinearSearch {

    // this is the bascially method for the linear seach which take target value and
    // an array and it will return the index of the elemnt if it is found otherwise
    // it will return the -1

    int linearSearch(int target, int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i : arr) {
            if (target == i) {
                return i;
            }

        }

        return -1;
    }


    int newMethod(){
        return -1;
        
    }

    boolean linearSearchString(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {

                return true;
            }

        }
        return false;
    }


    int maxOfArray(int[] arr) {
        int max =  Integer.MAX_VALUE;// Initialize max with the first element of the array
    
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
        }
    
        return max; // Return the maximum value after the loop
    }



    int[] searchingIn2dArray( int[][] arr, int target){
        
        for( int i = 0 ; i < arr.length ; i++){
            for ( int j = 0 ; j < arr.length ; j++){
                if( target == arr[i][j]){
                 return new int[]{i,j};
                }
            }
        }
          return new int[]{-1,-1};
    }
    
}


        