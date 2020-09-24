package com.mangxiao.leetcode.array;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Random;
/**
 * @description: questions of array
 * @author : mangxiao2018@126.com
 * @date:2020-6-30
 * @since 1.0
 */
public class ArrayBaseQuestions {
    private static Log log = LogFactory.getLog(ArrayBaseQuestions.class);
    /**定义一个一维空整型数组*/
    private int[] arrs;
    /** 默认大小 */
    private int DEFAULT_SIZE = 10;
    private Double[] darrs = new Double[5];
    private double[] darrx = {6.0,7.0,8.0,9.0,10.0};

    /**
     * 初始化这个一维整形数组 dimension:维度
     */
    void init1Dimen(){
        arrs = new int[10];
        Random r = new Random(1000);
        for(int i = 0; i< arrs.length; i++){
            arrs[i] = r.nextInt();
        }
    }

    /**
     * 迭代遍历出这个一维整形数组
     * Traversal:遍历
     * @param arr
     */
    void traversal(int[] arr){
        for(int i = 0; i < arr.length; i++){
            // 迭代遍历arr
            System.out.println(arr[i]);
        }
    }

    /**
     * 找出数组中最大的元素
     * @param arrs
     */
    int findMaxVal(int[] arrs){
        int maxVal = arrs[0];
        for (int i=0; i<arrs.length; i++){
            if (arrs[i] > maxVal){
                maxVal = arrs[i];
            }
        }
        return maxVal;
    }

    /**
     * 计算数组元素的平均值
     * @param arrs
     * @return
     */
    double getAvgVal(int[] arrs){
        double averageVal = 0;
        int sum = 0;
        for (int i=0; i< arrs.length; i++){
            sum = sum + arrs[i];
        }
        return averageVal = sum / arrs.length;
    }

    /**
     * 复制数组
     * @param sourceArray
     * @param targetArray
     * @return
     */
    int[] copyArray(int[] sourceArray, int[] targetArray){
        targetArray = new int[sourceArray.length];
        for (int i=0; i<sourceArray.length; i++){
            targetArray[i] = sourceArray[i];
        }
        return targetArray;
    }

    /***
     * 颠倒数组元素的顺序
     * @return
     */
    int[] convert(int[] sourceArray){
        int temp = 0;
        for (int i=0; i< sourceArray.length/2; i++){
            temp = sourceArray[i];
            sourceArray[i] = sourceArray[sourceArray.length - i - 1];
            sourceArray[sourceArray.length - i - 1] = temp;
        }
        return sourceArray;
    }

    /**
     * 矩阵相乘
     * @param factor1
     * @param factor2
     * @return
     */
    double[][] matrixMulti(double[][] factor1, double[][] factor2){
        int n = factor1.length;
        double[][] c = new double[n][n];
        for (int i=0; i< n; i++){
            for (int j=0; j<n; j++)
                for (int k=0; k<n; k++){
                    c[i][j] = factor1[i][k] * factor2[k][j];
                }
        }
        return c;
    }
    /***
     * 向一维数组里添加元素
     * @param arr
     * @param arg
     */
    void addElement(int[] arr, int arg){
        arr[arr.length + 1] = arg;
    }

    /**
     * 初始化二维数组
     * @param m
     * @param n
     * @return
     */
    double[][] init2Dimen(int m,int n){
        double[][] arrs = new double[m][n];
        Random r = new Random(1000);

        for (int i=0; i< m; i++){
            for (int j=0; j<n; j++){
                arrs[i][j] = r.nextDouble();
            }
        }
        return arrs;
    }

    /**
     * 初始化一维数组
     * @param length
     */
    public void init(int length){
        if (length > 0){
            arrs = new int[length];
        }else {
            arrs = new int[DEFAULT_SIZE];
        }
    }

    /**
     * 给默认数组插入数据值
     * @param value
     */
    public void add(int value){
        arrs.length
    }
    public static void main(String[] args){
        ArrayBaseQuestions ads = new ArrayBaseQuestions();
        log.debug("=========初始化并测试2维数组==========================");
        // 初始化并测试2维数组
        int m = 10;
        int n = 10;
        double[][] x = ads.init2Dimen(m,n);
        for (int i=0; i< m; i++){
            for (int j=0; j<n; j++){
                log.debug(x[i][j]);
            }
        }
        log.debug("=========初始化并测试1维数组==========================");
        // 初始化并测试1维数组
        ads.init1Dimen();
        //ads.traverse(ads.arrs);

      
    }
}
