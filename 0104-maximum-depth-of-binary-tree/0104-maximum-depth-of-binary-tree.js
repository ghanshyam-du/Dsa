/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxDepth = function (root) {
    let count = 0;

    function traverse(crnt, cnt) {
        if (!crnt) return 0;

        count = Math.max(count, cnt);
        crnt.left && traverse(crnt.left, cnt + 1);
        crnt.right && traverse(crnt.right, cnt + 1);

    }
    traverse(root, 1);
    return count;


};