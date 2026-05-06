/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
    let map = new Map();
    let temp = head;
    let cnt = 0;

    while(temp != null){
        if(map.has(temp)){
            return temp;
        }
        map.set(temp,cnt++ );
        temp = temp.next;
    }
    return null;





    
};