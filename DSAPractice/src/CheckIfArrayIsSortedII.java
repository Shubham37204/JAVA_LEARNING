//import java.util.ArrayList;

//not a correct code
//class Solution {
//
//    boolean isSorted(ArrayList<Integer> list) {
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < list.get(i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

//class Solution {
//            public boolean check(int[] list) {
//                int n = list.length;
//                int count = 0;
//
//                for (int i = 0; i < n; i++) {
//                    //finds a drop (where the order decreases).
////                    For a sorted and rotated array:
////                    0 or 1 drop → true
////                    2 or more drops → false
//                    if (list[i] > list[(i + 1) % n]) {
//                        count++;
//                    }
//                }
//
//                return count <= 1;
//            }
//        }
//void main() {
//    var solution = new Solution();
//
//    var list = new ArrayList<Integer>();
//
//    list.add(10);
//    list.add(20);
//    list.add(30);
//    list.add(40);
//    list.add(50);
//
//    System.out.println(solution.isSorted(list)); // true
//
//    list.add(25);
//
//    System.out.println(solution.isSorted(list)); // false
//}
//


