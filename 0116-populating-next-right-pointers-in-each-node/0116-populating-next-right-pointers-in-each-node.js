/**
 * // Definition for a _Node.
 * function _Node(val, left, right, next) {
 *    this.val = val === undefined ? null : val;
 *    this.left = left === undefined ? null : left;
 *    this.right = right === undefined ? null : right;
 *    this.next = next === undefined ? null : next;
 * };
 */

/**
 * @param {_Node} root
 * @return {_Node}
 */
var connect = function (root) {
    if (!root) return root;

    let traverse = (crnt) => {
        if (crnt.left) {
            crnt.left.next = crnt.right;
        }
        if (crnt.next && crnt.right) {
            crnt.right.next = crnt.next.left;
        }
        crnt.left && traverse(crnt.left);
        crnt.right && traverse(crnt.right);
    }
    traverse(root);

    return root;


};