package com.chuanqi.leetcode.grammer;

import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GlobalCoordinates;
import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * @author xuchuanqi
 * @date 2022/2/27 19:57.
 */
public class Testttt {
    @Test
    public void test04() {
        String radius7 = "200|180|250|250";
        boolean b = inRadius(radius7, -2, -2, 0, 0);
        System.out.println(b);
    }

    /**
     * @param radius7
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return true 在风圈内，false 不再风圈内。
     */
    public static boolean inRadius(String radius7, double x1, double y1, double x2, double y2) {
        if (!StringUtils.hasLength(radius7)) {
            return false;
        }
        Integer quadrant = getQuadrant(x1, y1, x2, y2);
        String[] split = radius7.split("\\|");
        Double radius = Double.valueOf(split[quadrant - 1]);

        double distance = getDistance(x1, y1, x2, y2);
        double dnm = distance / 1852;
        if (radius > dnm) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("经纬度距离计算结果：" + getDistance(109.371319, 22.155406, 108.009758, 21.679011) + "米");
    }

    public static double getDistance(double longitudeFrom, double latitudeFrom, double longitudeTo, double latitudeTo) {
        GlobalCoordinates source = new GlobalCoordinates(latitudeFrom, longitudeFrom);
        GlobalCoordinates target = new GlobalCoordinates(latitudeTo, longitudeTo);

        return new GeodeticCalculator().calculateGeodeticCurve(Ellipsoid.Sphere, source, target).getEllipsoidalDistance();
    }


    /**
     * 向量的坐标:(x2,y2) -> (x1,y1)的坐标在第几象限
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    private static Integer getQuadrant(double x1, double y1, double x2, double y2) {
        boolean x = x1 - x2 >= 0;
        boolean y = y1 - y2 >= 0;
        if (x && y) {
            return 1;
        } else if (!x && y) {
            return 2;
        } else if (!x && !y) {
            return 3;
        } else if (x && !y) {
            return 4;
        }
        return null;
    }


    /**
     * 向量1的坐标:(x1,y1)，向量2的坐标:(x2,y2)
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    private void getAngle(double x1, double y1, double x2, double y2) {
        // 向量1的坐标:(x1,y1)，向量2的坐标:(x2,y2); 则
        double value = (x1 * x2 + y1 * y2) / (Math.sqrt(x1 * x1 + y1 * y1) * Math.sqrt(x2 * x2 + y2 * y2)); // 余弦值
//        System.out.println(Math.acos(value));// 弧度
        double angle = Math.toDegrees(Math.acos(value));   // 角度
        System.out.println(angle);
//        System.out.println(angle / 180 * Math.PI);  // 弧度
    }

    @Test
    public void test03() {
        int i;
        if (false || (i = 3) == 5) {
            System.out.println("jin");
        } else {
            System.out.println("232");
        }
    }

    @Test
    public void test02() {
        int i = 5 / 3;
        System.out.println(i);
        double j = Double.valueOf(5d / 3d);
        System.out.println(j);
    }

    @Test
    public void test01() {
        Integer integer = new Integer(1);
        System.out.println(integer == new Integer(1));

    }
}
