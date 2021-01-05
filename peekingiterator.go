// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
in constructor if iterator has next then create peeking iterator with nextIter pointer to iterator, val as tmp and has as true
else create with iter, nil and false

for hasNext return this.has

for peek return this.val

for next if this.has then point to next in iterator and return current val else return currnt val
*/
package main

import "fmt"

type Iterator struct {
	arr []int
}

func (this *Iterator) hasNext() bool {
	// Returns true if the iteration has more elements.
	if len(this.arr) > 0 {
		return true
	}
	return false
}

func (this *Iterator) next() int {
	// Returns the next element in the iteration.
	if this.hasNext() {
		v := this.arr[0]
		this.arr = this.arr[1:]
		return v
	}
	return -1
}

type PeekingIterator struct {
	nextIter *Iterator
	val      interface{}
	has      bool
}

func Constructor(iter *Iterator) *PeekingIterator {
	if iter.hasNext() {
		tmp := iter.next()
		return &PeekingIterator{
			nextIter: iter,
			val:      tmp,
			has:      true,
		}
	} else {
		return &PeekingIterator{
			nextIter: iter,
			val:      nil,
			has:      false,
		}
	}
}

func (this *PeekingIterator) hasNext() bool {
	return this.has
}

func (this *PeekingIterator) next() int {
	if this.has {
		tmp := this.val
		this.has = this.nextIter.hasNext()
		this.val = this.nextIter.next()
		return tmp.(int)
	} else {
		return this.val.(int)
	}
}

func (this *PeekingIterator) peek() int {
	return this.val.(int)
}

func MainPeekingIterator() {
	iter := &Iterator{
		arr: []int{1, 2, 3},
	}
	obj := Constructor(iter)
	fmt.Println(obj.next())    //expected 1
	fmt.Println(obj.peek())    //expected 2
	fmt.Println(obj.next())    //expected 2
	fmt.Println(obj.next())    //expected 3
	fmt.Println(obj.hasNext()) //expected false
}
