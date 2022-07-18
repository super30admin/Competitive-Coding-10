TC- O(1) for all methods
SC- O(1) for all methods

class PeekingIterator {
    
    constructor(iterator) {
        this.itr = iterator;
        this.peeked = null;
    }
    
    peek() {
        if(!this.peeked) this.peeked = this.itr.next();
        return this.peeked;
    }
    
    next() {
        if(!this.peeked) return this.itr.next()
        const temp = this.peeked;
        this.peeked = null;
        return temp;
    }
    
    hasNext() {
        if(!this.peeked) return this.itr.hasNext()
        return true;
    }
}