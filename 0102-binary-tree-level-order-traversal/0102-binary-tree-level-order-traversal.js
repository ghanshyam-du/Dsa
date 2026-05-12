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
 * @return {number[][]}
 */
var levelOrder = function (root) {
    if(!root) return [];
    let queue = [root];
    let ans = [];
    while (queue.length) {

        let leveArr = [];
        let size = queue.length;
        for (let i = 0; i < size; i++) {
            let curr = queue.shift();
            leveArr.push(curr.val);
            curr.left && queue.push(curr.left);
            curr.right && queue.push(curr.right);
        }
        ans.push(leveArr);
    }


    return ans;


};