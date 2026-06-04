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
 * @param {number} val
 * @return {TreeNode}
 */
var insertIntoBST = function(root, val) {

    let traverse = (crnt, val) =>{

        if(crnt === null) {
           return new TreeNode(val);
        }

        if(crnt.val > val){
           crnt.left = traverse(crnt.left, val);
        }else{
           crnt.right = traverse(crnt.right, val);
        }

        return crnt;

    }
    return  traverse(root, val);


    
};