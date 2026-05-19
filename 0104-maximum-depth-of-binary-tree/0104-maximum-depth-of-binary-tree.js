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
var maxDepth = function(root) {
    if(!root) return 0;    // this is bottom up approach 

    let leftM = maxDepth(root.left);
    let rightM = maxDepth(root.right); 
     
    return 1 + Math.max(leftM, rightM);


    // if(!root) return 0;  this is the top down approch 
    // let Mdepth = 0;

    // var traverse = (curr, depth)=>{
    //     Mdepth = Math.max(Mdepth, depth);

    //     curr.left && traverse(curr.left, depth+1);
    //     curr.right && traverse(curr.right, depth+1);

    // }
    // traverse(root, 1);

    // return Mdepth;
    
};