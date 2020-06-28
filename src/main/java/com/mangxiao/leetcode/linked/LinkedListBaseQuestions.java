package com.mangxiao.leetcode.linked;
/**
 * @description: questions of array
 * @author : mangxiao2018@126.com
 * @date:2020-6-28
 * @since 1.0
 */
public class LinkedListBaseQuestions {

    private Node head;

    public LinkedListBaseQuestions(){
        head = new Node();
    }

    /**
     * 增加节点
     * @param node
     */
    public void addNode(Node node){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    /**
     * 通过指定位置插入新节点
     * @param index
     * @param node
     */
    public void insertNode(int index, Node node){
        if(index < 1 || index > length() + 1){
            //
            return;
        }
        int length = 1;
        Node temp = head;
        while (head.next != null){
            if(index == length++){
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
    }

    /**
     * 计算单链表的长度
     * @return
     */
    public int length(){
        int length = 0;
        Node temp = head;
        while (temp.next != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}
