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
var zigzagLevelOrder = function(root) {
    let ans = [];
    if(!root) return [];

    var zigZag = (curr, level) =>{
        if(!ans[level]) ans[level] = [];

        if(level % 2 == 0){
            ans[level].push(curr.val);
        }else{
            ans[level].unshift(curr.val);
        }
        curr.left &&  zigZag(curr.left, level+1);
        curr.right && zigZag(curr.right, level+1);

    }
    zigZag(root, 0);
    
    //  let ans = [];
    // if(!root) return ans;
    // let q  = [root];
    // let level = 0;

    // while(q.length){
    //     let levelArr = [];
    //     let levelSize = q.length;

    //     for(let i = 0; i< levelSize ; i++){
    //         let curr = q.shift();
    //         if(level % 2 == 0){
    //             levelArr.push(curr.val);
    //         }
    //         else{
    //             levelArr.unshift(curr.val);
    //         }
    //         curr.left && q.push(curr.left);
    //        curr.right &&  q.push(curr.right);
    //     }
    //     ans.push(levelArr);
    //     ++level;

    // }

    return ans;
    
};