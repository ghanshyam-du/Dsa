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
var searchBST = function(root, val) {
    let ans = null;

    let search = (crnt, val) =>{

        if( crnt.val === val){
            ans =  crnt;
        }
        else if(crnt.val > val){
            crnt.left && search(crnt.left, val);
        }
        else{
           crnt.right &&  search(crnt.right, val);
        }

    }
    search(root, val);
    return ans;
    
};