/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findKthLargest = function(nums, k) {

    class MinHeap {
        constructor() {
            this.heap = [];
        }

        insert(value) {
            this.heap.push(value);

            let index = this.heap.length - 1;

            while (index > 0) {
                let parent = Math.floor((index - 1) / 2);

                if (this.heap[index] >= this.heap[parent]) {
                    break;
                }

                [this.heap[index], this.heap[parent]] =
                [this.heap[parent], this.heap[index]];

                index = parent;
            }
        }

        remove() {
            let root = this.heap[0];
            let last = this.heap.pop();

            if (this.heap.length > 0) {
                this.heap[0] = last;

                let index = 0;

                while (true) {
                    let left = 2 * index + 1;
                    let right = 2 * index + 2;
                    let smallest = index;

                    if (
                        left < this.heap.length &&
                        this.heap[left] < this.heap[smallest]
                    ) {
                        smallest = left;
                    }

                    if (
                        right < this.heap.length &&
                        this.heap[right] < this.heap[smallest]
                    ) {
                        smallest = right;
                    }

                    if (smallest === index) {
                        break;
                    }

                    [this.heap[index], this.heap[smallest]] =
                    [this.heap[smallest], this.heap[index]];

                    index = smallest;
                }
            }

            return root;
        }

        peek() {
            return this.heap[0];
        }

        size() {
            return this.heap.length;
        }
    }

    let minHeap = new MinHeap();

    for (let num of nums) {
        minHeap.insert(num);

        if (minHeap.size() > k) {
            minHeap.remove();
        }
    }

    return minHeap.peek();
};