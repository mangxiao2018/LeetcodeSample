package com.mangxiao.leetcode.linked;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @description: questions of LinkedList
 * @author : mangxiao2018@126.com
 * @date:2020-6-28
 * @since 1.0
 */
public class LinkedListBaseQuestions {
    private static Log log = LogFactory.getLog(LinkedListBaseQuestions.class);
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
            log.error("Error of input for length.");
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

    /**
     * 打印链表数据值
     * @param node
     */
    public void getList(Node node){
        while (node != null){
            log.debug("Node.data:" + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args){
        log.debug("test logback");
        LinkedListBaseQuestions lbq = new LinkedListBaseQuestions();
        Node node_1 = new Node(1);
        lbq.addNode(node_1);
        Node node_2 = new Node(2);
        lbq.addNode(node_2);
        Node node_3 = new Node(3);
        lbq.addNode(node_3);
        log.debug("length:" + lbq.length());
        // 插入节点测试
        Node node_4 = new Node(4);
        lbq.insertNode(2,node_4);
        log.debug("length:" + lbq.length());
        // 打印链表各节点数据值
        lbq.getList(node_1);

    }
}
