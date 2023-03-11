public static int sumOfEvenNumbers(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) { // kiểm tra số chẵn
            sum += arr[i]; // thêm vào tổng
        }
    }
    return sum;
}