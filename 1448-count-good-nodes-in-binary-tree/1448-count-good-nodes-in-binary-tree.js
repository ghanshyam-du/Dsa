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
var goodNodes = function(root) {
  let count = 0;
  function xNode(crnt, max){

    if(crnt.val >= max){
        count++;
    }
    max = Math.max(crnt.val, max);
    crnt.left && xNode(crnt.left, max);
    crnt.right && xNode(crnt.right, max);

  }
  xNode(root, root.val);
  return count;
};