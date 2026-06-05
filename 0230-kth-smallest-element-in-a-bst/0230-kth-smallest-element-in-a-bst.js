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

    let ans = [];
    let stk = [];
    let crnt = root;

    let traverse = (crnt) =>{

        while(crnt || stk.length){
            while(crnt){
                stk.push(crnt);
                crnt = crnt.left;
            }

            crnt = stk.pop();
            ans.push(crnt.val);
            crnt = crnt.right;
        }

    }
    traverse(crnt);
    return ans[k-1];
    
};