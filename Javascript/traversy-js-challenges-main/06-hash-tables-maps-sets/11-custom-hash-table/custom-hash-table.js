class HashTable {
    constructor(limit = 14) {
        this.storage = [];
        this.limit = limit;
    }

    clear() {
        this.storage = [];
    }

    get(key) {
        const index = this._hash(key, this.limit);
        let bucket = this.storage[index];
        if (bucket !== undefined) {
            for (const keyValue of bucket) {
                if (keyValue[0] === key) {
                    return keyValue[1]
                }
            }
        }
        return undefined;
    }

    has(key) {
        const index = this._hash(key, this.limit);
        let bucket = this.storage[index];
        if (bucket !== undefined) {
            for (const keyValue of bucket) {
                if (keyValue[0] === key) {
                    return true
                }
            }
        }
        return false;
    }

    // note: this is a simplified version of a hash
    // sum of charcodes modulus max is just an arbitrary calculation
    _hash(key, max) {
        let hash = 0;
        for (let i = 0; i < key.length; i++) {
            hash += key.charCodeAt(i);
        }
        return hash % max;
    }

    printTable() {
        for (let i = 0; i < this.storage.length; i++) {
            if (this.storage[i] !== undefined) {
                console.log(`This bucket: ${i}: ${JSON.stringify(this.storage[i])}`)
            } else {
                console.log(`Bucket ${i}: empty`)
            }
        }
    }

    remove(key) {
        const index = this._hash(key, this.limit);
        let bucket = this.storage[index];
        if (bucket !== undefined) {
            if (bucket.length === 1 && bucket[0][0] === key) {
                delete this.storage[index]
            } else {
                for (let i = 0; i < bucket.length; i++) {
                    if (bucket[i][0] === key) {
                        delete this.storage[index][i]
                    }
                }
            }

        }
    }

    set(key, value) {
        let index = this._hash(key, this.limit);
        if (this.storage[index] === undefined) {
            // no collision
            this.storage[index] = [[key, value]]
        } else {
            let inserted = false;
            // loop over key,value pairs in current bucket
            for (let i=0; i < this.storage[index].length; i++) {
                // check whether to update (key exists already -- 1st index of nested array)
                if (this.storage[index][i][0] === key) {
                    this.storage[index][i][1] = value;
                    inserted = true;
                }

            }
            if (inserted === false) {
                this.storage[index].push([key, value]);
            }
        }
    }
}

module.exports = HashTable;
