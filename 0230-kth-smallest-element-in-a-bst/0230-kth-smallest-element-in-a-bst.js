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
 * @param {number} k
 * @return {number}
 */
var kthSmallest = function(root, k) {

    let count = k;
    let ans = null

    let inOrder = (crnt) =>{
        if(ans !== null) return;
       crnt.left && inOrder(crnt.left);
       --count;

       if(count === 0){
        ans = crnt.val;
       }

        crnt.right && inOrder(crnt.right);
    }
    inOrder(root);
    return ans;
    
};