package practice;

public class EvenProduct {

    // Initially the Product of elements of the array A is ODD
    // you need to find the total number of distinct operations (modulo 109 + 7) you can perform to make the product of array EVEN.
    public static void main(String[] args) {
        int[] a = {469, 335, 501, 171, 725, 479, 359, 963, 465, 707, 147, 283, 829, 963, 493, 997, 943, 829, 437, 393, 605, 903, 155, 293, 383, 423, 717, 719, 897, 449, 727, 773, 539, 871, 913, 669, 301, 37, 895, 705, 813, 323, 335, 675, 665, 143, 713, 255, 869, 549, 645, 663, 759, 39, 861, 725, 743, 531, 779, 317, 37, 191, 843, 289, 107, 41, 943, 265, 649, 447, 807, 891, 731, 371, 351, 7, 103, 395, 549, 631, 625, 85, 955, 757, 841, 967, 377, 933, 309, 945, 441, 627, 325, 539, 539, 119, 83, 931, 543, 835, 117, 641, 659, 705, 931, 979, 307, 675, 387, 23, 747, 925, 73, 271, 831, 779, 575, 99, 513, 987, 291, 163, 637, 357, 769, 657, 575, 33, 53, 351, 151, 943, 725, 967, 431, 109, 193, 9, 339, 459, 289};
    EvenProduct ep = new EvenProduct();
        int res = ep.solve2(a);
        System.out.println(res);
    }

    public int solve(int[] A) {
        int n = A.length;
        int res = 1;
        if(n == 1)
            return 1;
        if(n > 1){
            res = (int)Math.pow(2,n);
        }
        return res-1;
    }

    public int solve2(int[] A) {
        int res=1,m=1000000007;
        for(int i=1;i<=A.length;i++) {
            res=(res%m*2%m)%m;
        }
        return (res-1+m)%m;
    }
}
