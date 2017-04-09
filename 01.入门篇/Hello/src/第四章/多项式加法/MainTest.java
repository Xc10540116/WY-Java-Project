package 第四章.多项式加法;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;// 从大到小排序
            }
        });
        // 两次输入
        Scanner scanner = new Scanner(System.in);
        int[] str = new int[101];
        int power, coef;
        for (int flags = 0; flags < 2; flags++) {
            do {
                power = scanner.nextInt(); // 幂次
                coef = scanner.nextInt(); // 系数
 
                if (power > 100) {
                    System.exit(0);
                }
                // 是否存在幂次，存在就系数相加
                boolean isContain = map.containsKey(power);
                if (isContain) {
                    coef += map.get(power);
                }
                // 系数为0就删除该项，不为0就插入
                if (coef != 0) {
                    map.put(power, coef);
                } else {
                    map.remove(power);
                }
            } while (power != 0);
        }
 
        // 为空
        if (map.isEmpty()) {
            System.out.println(0);
            return;
        }
 
        // 输出结果
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            power = entry.getKey();// 幂次
            coef = entry.getValue();// 系数
            index++;
            // 不是第一次输出且系数大于0
            if (index != 1 && coef > 0) {
                System.out.print("+");
            }
 
            // 幂次不等于0
            if (power != 0) {
                if (coef == 1) {
                    if (power == 1) {// 系数为1，幂次等于1
                        System.out.print("x");
                    } else {// 系数为1，幂次不等于0且不等于1
                        System.out.print("x" + power);
                    }
                } else {
                    if (power == 1) {// 系数不等于1，幂次等于1
                        System.out.print(coef + "x");
                    } else {// 系数不等于1，幂次不等于1
                        System.out.print(coef + "x" + power);
                    }
                }
            } else {// 幂次等于0
                System.out.print(coef);
            }
        }
	}

}
