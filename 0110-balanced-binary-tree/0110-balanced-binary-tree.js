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
 * @return {boolean}
 */
var isBalanced = function (root) {
    let ans = true;

    let heightC = (curr) => {
        if (!curr) return 0;

        let leftH = heightC(curr.left);
        let rightH = heightC(curr.right);

        if (Math.abs(leftH - rightH) > 1) {
            ans = ans && false;
        }

        return 1 + Math.max(leftH, rightH);
    }
    heightC(root);
    
    return ans;

};