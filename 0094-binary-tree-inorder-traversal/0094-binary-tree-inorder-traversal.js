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
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    if(!root) return [];
    let ans = [];
    let stk = [];
    let curr = root;


    while(curr || stk.length){

        while(curr){
            stk.push(curr);
            curr = curr.left;
        }

        curr = stk.pop();
        ans.push(curr.val);
        curr = curr.right;
    }
    return ans;
};