import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class LinkListTest {

    LinkList linkList = new LinkList();

    @Test
    void lengthPositive() {
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(2);

        assertEquals(3, linkList.length());
    }

    @Test
    void lengthNegative() {
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(2);

        assertNotEquals(6, linkList.length());

    }

    @Test
    void getByIndexPositive() {
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(2);

       assertEquals(java.util.Optional.of(3), java.util.Optional.ofNullable(linkList.getByIndex(1)));
    }

    @Test
    void getByIndexNegative() {
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(2);

        assertNotEquals(java.util.Optional.of(4), java.util.Optional.ofNullable(linkList.getByIndex(1)));
    }

    @Test
    void getStringByIndexPositive() {
        linkList.insertFirstString("111");
        linkList.insertFirstString("333");
        linkList.insertFirstString("222");

        assertEquals("333", linkList.getStringByIndex(1));
    }

    @Test
    void getStringByIndexNegative() {
        linkList.insertFirstString("111");
        linkList.insertFirstString("333");
        linkList.insertFirstString("222");

        assertNotEquals("---", linkList.getStringByIndex(1));
    }

    @Test
    void insertFirstPositive() {
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(4);

        assertEquals(java.util.Optional.of(4), java.util.Optional.ofNullable(linkList.getByIndex(0)));
    }

    @Test
    void insertFirstNegative() {
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(4);

        assertNotEquals(java.util.Optional.of(1), java.util.Optional.ofNullable(linkList.getByIndex(0)));
    }

    @Test
    void insertLastPositive() {
        linkList.insertFirst(2);
        linkList.insertLast(1);
        linkList.insertFirst(3);

        assertEquals(java.util.Optional.of(1), java.util.Optional.ofNullable(linkList.findLast()));
    }

    @Test
    void insertLastNegative() {
        linkList.insertFirst(2);
        linkList.insertLast(1);
        linkList.insertFirst(3);

        assertNotEquals(java.util.Optional.of(3), java.util.Optional.ofNullable(linkList.findLast()));
    }

    @Test
    void insertFirstStringPositive(){
        linkList.insertFirstString("111");
        linkList.insertFirstString("333");
        linkList.insertFirstString("222");

        assertEquals("222", linkList.getStringByIndex(0));
    }

    @Test
    void insertFirstStringNegative(){
        linkList.insertFirstString("111");
        linkList.insertFirstString("333");
        linkList.insertFirstString("222");

        assertNotEquals("111", linkList.getStringByIndex(0));
    }

    @Test
    void insertLastStringPositive() {
        linkList.insertFirstString("333");
        linkList.insertLastString("111");
        linkList.insertFirstString("222");

        assertEquals("111", linkList.getStringByIndex(2));
    }

    @Test
    void insertLastStringNegative() {
        linkList.insertFirstString("333");
        linkList.insertLastString("111");
        linkList.insertFirstString("222");

        assertNotEquals("222", linkList.getStringByIndex(2));
    }


}