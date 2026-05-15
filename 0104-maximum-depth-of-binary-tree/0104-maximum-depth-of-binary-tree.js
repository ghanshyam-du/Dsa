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
    // Bottom-up approach 
    if (!root) return 0;

    let leftMax = maxDepth(root.left);
    let rightMax = maxDepth(root.right);

    return 1 + Math.max(leftMax, rightMax);


    // Top-Down approach
    // if(!root) return 0;
    // let maxDep = 0;

    // function traversal(crnt, level){
    //     maxDep = Math.max(maxDep, level);
    //    crnt.left &&  traversal(crnt.left, level+1);
    //    crnt.right &&  traversal(crnt.right, level+1);

    // }

    // traversal(root, 1);
    // return maxDep;

};