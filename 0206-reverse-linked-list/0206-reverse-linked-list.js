/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    let crnt = head;
    let prev = null;
   

    while(crnt != null){
        let frnt = crnt.next;

        crnt.next = prev;
        prev = crnt;
        crnt =  frnt;
    }
    return prev; 
};