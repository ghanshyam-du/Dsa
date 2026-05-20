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
var isSymmetric = function (root) {

    let q = [root.left, root.right];

    while (q.length) {
        let q1 = q.shift();
        let q2 = q.shift();

        if (!q1 && !q2) {
            continue;
        }
        if (!q1 || !q2) {
            return false;
        }
        if (q1.val != q2.val) {
            return false;
        }


        q.push(q1.left, q2.right);
        q.push(q1.right, q2.left);
    }

    return true;


    // let isMirror = (left, right) => {
    //     if (!left && !right) return true;
    //     if (!left || !right) return false;
    //     return left.val === right.val &&
    //         isMirror(left.left, right.right) &&
    //         isMirror(left.right, right.left);
    // }
    // return isMirror(root.left, root.right);

};