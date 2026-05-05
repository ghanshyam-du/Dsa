function Node(val) {
    this.val = val;
    this.next = null;
}

var MyLinkedList = function() {
    this.head = null;
    this.size = 0;
};

// 🔹 Get value at index
MyLinkedList.prototype.get = function(index) {
    if (index < 0 || index >= this.size) return -1;

    let temp = this.head;

    while (index > 0) {
        temp = temp.next;
        index--;
    }

    return temp.val;
};

// 🔹 Add at head
MyLinkedList.prototype.addAtHead = function(val) {
    let newNode = new Node(val);
    newNode.next = this.head;
    this.head = newNode;
    this.size++;
};

// 🔹 Add at tail
MyLinkedList.prototype.addAtTail = function(val) {
    let newNode = new Node(val);

    if (this.head == null) {
        this.head = newNode;
        this.size++;
        return;
    }

    let temp = this.head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
    this.size++;
};

// 🔹 Add at index
MyLinkedList.prototype.addAtIndex = function(index, val) {
    if (index < 0 || index > this.size) return;

    if (index === 0) {
        this.addAtHead(val);
        return;
    }

    let newNode = new Node(val);
    let temp = this.head;

    while (index > 1) {
        temp = temp.next;
        index--;
    }

    newNode.next = temp.next;
    temp.next = newNode;
    this.size++;
};

// 🔹 Delete at index
MyLinkedList.prototype.deleteAtIndex = function(index) {
    if (index < 0 || index >= this.size) return;

    if (index === 0) {
        this.head = this.head.next;
        this.size--;
        return;
    }

    let temp = this.head;

    while (index > 1) {
        temp = temp.next;
        index--;
    }

    temp.next = temp.next.next;
    this.size--;
};