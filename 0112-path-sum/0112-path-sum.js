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
 * @param {number} targetSum
 * @return {boolean}
 */
var hasPathSum = function(root, targetSum) {
    if(!root) return false;
    let ans = false
   

    var traverse = (curr, vala)=>{
        if(!curr.left && !curr.right){
            if(curr.val + vala === targetSum){
               ans = ans || true;
            }
        }
        curr.left && traverse(curr.left, curr.val + vala);
        curr.right && traverse(curr.right, curr.val + vala);

    }
    traverse(root, 0);
    return ans;
    
};