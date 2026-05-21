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
var diameterOfBinaryTree = function (root) {
    let maxDepth = 0;

    var findDepth = (curr) => {
        if(!curr) return 0;
        
        let leftD = findDepth(curr.left);
        let rightD = findDepth(curr.right);


        let currtD = leftD + rightD;
        maxDepth = Math.max(maxDepth, currtD);

        return 1 + Math.max(leftD, rightD);

    }

    findDepth(root);
    return maxDepth;

};