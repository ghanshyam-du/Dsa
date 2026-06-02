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
var isValidBST = function(root) {
   
   let isBST = (crnt, lo, hi) =>{

    if(!crnt) return true;
    if((lo != null && crnt.val <= lo) || (hi != null && crnt.val >= hi)){
        return false;
    }

    let isLeft = isBST(crnt.left, lo, crnt.val);
    let isRight = isBST(crnt.right, crnt.val, hi);

    return isLeft && isRight;

   }
 
   return isBST(root, null, null);
    
};