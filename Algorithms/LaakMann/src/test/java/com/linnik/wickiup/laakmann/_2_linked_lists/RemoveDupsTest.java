package com.linnik.wickiup.laakmann._2_linked_lists;

import com.linnik.wickiup.laakmann._2_linked_lists.structures.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDupsTest {

    @Test
    public void test1() {
        LinkedList<Integer> linkedList = getLinkedList();

        String expected = "1 -> 2 -> 3 -> 4 -> null";

        RemoveDups removeDups = new RemoveDups();
        removeDups.deleteDups_1(linkedList.head);

        Assert.assertEquals(expected, linkedList.head.toString());
    }

    @Test
    public void test2() {
        LinkedList<Integer> linkedList = getLinkedList();

        String expected = "1 -> 2 -> 3 -> 4 -> null";

        RemoveDups removeDups = new RemoveDups();
        removeDups.deleteDups_2(linkedList.head);

        Assert.assertEquals(expected, linkedList.head.toString());
    }

    private LinkedList<Integer> getLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.append(1);
        linkedList.append(2);
        return linkedList;
    }
}
