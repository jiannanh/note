// temperature change
// TODO:
public void tempChange() {
    int[] arr = {6,-2,5};
//        int[] arr = {-1, 2, 3};
    int[] pre_sum = new int[arr.length];
    pre_sum[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
        pre_sum[i] = arr[i] + pre_sum[i - 1];
    }
    int max_agg = pre_sum[arr.length - 1];
    // for (int i = 1; i < arr.length-1; i++) {
    for (int i = 1; i < arr.length; i++) {
        int tmp = Math.max(pre_sum[i], pre_sum[arr.length - 1] - pre_sum[i - 1]);
        max_agg = Math.max(tmp, max_agg);
    }
    System.out.println("x is = " + max_agg);
}

// TODO: test
public void minNetStockChange() {
//        int[] arr = {1, 3, 2, 3};
//        int[] arr = {1, 3, 2, 4, 5};
    int[] arr = {1, 2, 3, 4, 5, 6};
//        int[] arr = {1,1,1,1,1,1};
    int[] pre_sum = new int[arr.length];
    pre_sum[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
        pre_sum[i] = arr[i] + pre_sum[i - 1];
    }
    int min = Integer.MAX_VALUE, res = -1;
    for (int i = 1; i < arr.length - 1; i++) {
        int tmp = Math.abs(pre_sum[i-1] / i - (pre_sum[arr.length - 1] - pre_sum[i - 1]) / (arr.length - i));
        if (min > tmp) {
            min = Math.min(min, tmp);
            System.out.println(min);
            res = i;
        }
    }
    System.out.println("res is = " + res);
}
