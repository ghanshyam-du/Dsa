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
var preorderTraversal = function(root) {
    if(!root) return [];
   let arr = [];
   let stack = [root];

   while(stack.length){
    let crnt = stack.pop();
    arr.push(crnt.val);
    crnt.right && stack.push(crnt.right);
    crnt.left &&  stack.push(crnt.left);
   }

    

    // function traversal(crnt){

    //     if(!crnt)  return;
    //     ans.push(crnt.val);
    //     traversal(crnt.left);
    //     traversal(crnt.right);
    // }

    // traversal(root);
    return arr;
    
};