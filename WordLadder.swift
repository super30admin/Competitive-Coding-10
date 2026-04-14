//
//  WordLadder.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 2/22/26.
//

class WordLadder {
    
    class QueueUsingLinkedList<T> {
        
        private class LinkedListNode<T> {
            var value: T
            var next: LinkedListNode<T>?
            init(value: T) {
                self.value = value
            }
        }
        
        private var front: LinkedListNode<T>?
        private var rear: LinkedListNode<T>?
        private var count = 0
        
        func enqueue(value: T) {
            let newNode = LinkedListNode(value: value)
            if (front == nil) {
                front = newNode
                rear = newNode
            } else {
                rear?.next = newNode
                rear = newNode
            }
            count += 1
        }
        
        func dequeue() -> T? {
            if (front == nil) {
                return nil
            }
            let value = front?.value
            front = front?.next
            if (front == nil) {
                rear = nil
            }
            count -= 1
            return value
        }
        
        var isEmpty: Bool {
            return count == 0
        }
        
        var size: Int {
            return count
        }
    }
    
    init() {
        let length = ladderLength("hit", "cog", ["hot","dot","dog","lot","log","cog"])
        print("length  \(length)")
    }
    
    func ladderLength(_ beginWord: String, _ endWord: String, _ wordList: [String]) -> Int {
        
        if (beginWord == endWord) {
            return 0
        }
        let aToZ = "abcdefghijklmnopqrstuvwxyz"
        
        var queue = QueueUsingLinkedList<String>()
        queue.enqueue(value: beginWord)
        var level = 1
        var visitedStrSet = Set<String>()
        visitedStrSet.insert(beginWord)
        
        while (!queue.isEmpty) {
            let size  = queue.size
            for s in 0..<size {
                let currStr = queue.dequeue()
                
                if let currStr = currStr {
                    var currArray: [Character] = Array(currStr)
                    for i in 0..<currArray.count {
                        var intermediateCurrArray = currArray
                        for char in aToZ  {
                            intermediateCurrArray[i] = char
                            let currChangedStr = String(intermediateCurrArray)
                            if (wordList.contains(currChangedStr)) {
                                if (currChangedStr == endWord) {
                                    return level + 1
                                }
                                if (!visitedStrSet.contains(currChangedStr)) {
                                    queue.enqueue(value: currChangedStr)
                                    visitedStrSet.insert(currChangedStr)
                                }
                            }
                        }
                    }
                }
            }
            level += 1
        }
        return 0
        
    }
}
