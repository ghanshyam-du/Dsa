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
    let ans = [];
    let stack = [];
    let crnt = root;

    while(crnt || stack.length){
        while(crnt){
         stack.push(crnt);
           crnt = crnt.left;
        }
        crnt = stack.pop();
        ans.push(crnt.val);
        crnt = crnt.right;
    }

    // function traversal(crnt){
    //     //left -> root -> right
    //     if(!crnt) return;

    //     traversal(crnt.left);
    //     ans.push(crnt.val);
    //     traversal(crnt.right);

    // }
    // traversal(root);

    return ans;
    
};