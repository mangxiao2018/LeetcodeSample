package com.mangxiao.leetcode.array;

/**
 * @description: questions of array
 * @author : mangxiao2018@126.com
 * @date:2020-6-25
 * @since 1.0
 */
public class ArrayQuestions {

    private static Log log = LogFactory.getLog(ArrayQuestions.class);

    /**
     * 用Random初始化一维数组
     * @return
     */
    int[] init(){
        int[] arr = new int[5];
        Random r = new Ramdom(1000);
        for(int i=0; i<arr.length; i++){
            arr[i] = r.nextInt();
        }
        return arr;
    }

    public static void main(String[] args){
        ArrayQuestions aq = new ArrayQuestions();
        aq.init();
    }

}
