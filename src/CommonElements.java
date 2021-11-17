public class CommonElements {

        public static void main(String[] args) {
        int [] arr = new int [] {1, 8, 3, 7, 2, 7, 1, 8, 3};
        System.out.println("Common elements in given array: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
