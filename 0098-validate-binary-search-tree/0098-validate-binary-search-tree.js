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
   
   let isBST = (crnt, low, high) =>{

    if(!crnt) return true;

    if((low != null && crnt.val <= low) || (high != null && crnt.val >= high)){
        return false;
    }

    let isLeftBST = isBST(crnt.left, low, crnt.val);
    let isRightBST = isBST(crnt.right, crnt.val, high);

    return isLeftBST && isRightBST;

   }
   return isBST(root, null, null);
    
};