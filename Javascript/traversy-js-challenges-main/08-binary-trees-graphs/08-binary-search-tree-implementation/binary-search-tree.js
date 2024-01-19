class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    printNode(node) {
        console.log(`Node with value ${this.data}; left: ${this.left}; ${this.right}`)
    }
}

class BinarySearchTree {
    constructor() {
        this.root = null;
    }

      
    
    insert(data) {
        const newNode = new Node(data);

        if(this.root === null) {
            this.root = newNode;
        } else {
           let currentNode = this.root;

           while(true) {
            if (newNode.data < currentNode.data) {
                if (!currentNode.left) {
                    currentNode.left = newNode;
                    return this;
                }
                currentNode = currentNode.left;
            } else {
                if(!currentNode.right) {
                    currentNode.right = newNode;
                    return this;
                }
                currentNode = currentNode.right;
            }
           }
        }
    }
        /*
    
    lookup(value) {
        let currentNode = this.root;
    
        if (!currentNode) {
          return null;
        }
    
        while (currentNode) {
          if (value < currentNode.value) {
            currentNode = currentNode.left;
          }
          else if (value > currentNode.value) {
            currentNode = currentNode.right;
          }
          else if (value === currentNode.value) {
            return currentNode;
          }
        }
    
        return null;
    }

*/
    lookup(data) {
      //console.log(`Beginning lookup with this root: ${this.root}`)
        if(!this.root) {
            return null;
        } else {
            let currentNode = this.root;
            console.log(`This is the current node starting the search: ${currentNode.data}`)
            while(currentNode !==null) {
                console.log('next iteration....')
                if (data < currentNode.data) { // && currentNode.left !== null
                    currentNode = currentNode.left;
                    console.log(`Now moving to the left`)
                    //console.log(currentNode.data);
                } else if (data > currentNode.data){ // && currentNode.right !==null
                  console.log(`Now moving to the right`)
                  currentNode = currentNode.right;
                } else if (data === currentNode.data) {
                    console.log(`found the node with value: ${data}`)
                    return currentNode;
                }
                //return null;
            }
            
            return null;
        }
    } 


    printTree() {
        const printNode = (node) => {
            if (node===null) {
                return;
            }
            printNode(node.left);
            console.log(node.data);
            printNode(node.right);
        }
        printNode(this.root);
    }
    

    remove(value) {
      console.log(`Beginning method to remove node with value: ${value} and root value: ${this.root.data}`)
      const removeNode = (node, value) => {
        console.log(`New iteration with node: ${node.data} and value ${value}`)
        if (node===null) {
          console.log(`The node is null`)
          return null;
        } 
        if (value < node.data) {
          console.log(`The value (${value}) is less than the node value (${node.data}), so now calling function with left node`);
          node.left = removeNode(node.left, value);
          return node;
        } else if (value > node.data) {
          console.log(`The value (${value}) is greater than the node value (${node.data}), so now calling function with right node`);
          node.right = removeNode(node.right, value)
        } else {
          console.log(`The node has no child or only one child`);
          if (node.left === null) {
            console.log(`There is no left node, so returning the right node (${node.right})`);
            return node.right;
          } else if (node.right === null) {
            console.log(`There is no right node, so return the left node ${node.left}`);
            return node.left;
          }
          console.log(`The node has two children`)
          let temporaryNode = node.right;
          console.log(`This is the temporary node: ${temporaryNode.data} -- formerly the right node ${node.right}`);
          while (temporaryNode.left !== null) {
            console.log(`The temporary node's left node isn't null so reassigning to left node: ${temporaryNode.left.data}`);
            temporaryNode = temporaryNode.left;
          }
          console.log(`The node is the root node, so replacing root with temporary (succcessor value: ${temporaryNode.data})`);
          node.data = temporaryNode.data;
          console.log(`Now calling the remove node again with the right node ${node.right.data} and temporary node ${temporaryNode.data}`)
          node.right = removeNode(node.right, temporaryNode.data);
          return node;
        }
      }
      if (this.root!==null) {
        if (value === this.root.data && this.root.left === null && this.root.right === null) {
          const returnValue = this.root;
          this.root = null;
          return returnValue;
        }
      }
      console.log(`calling recursive function for first time`)
      removeNode(this.root, value);
    }
  /*
    remove(value) {
      const removeNode = (node, value) => {
        if (node === null) {
          return null;
        }
    
        if (value < node.value) {
          node.left = removeNode(node.left, value);
          return node;
        }
        else if (value > node.value) {
          node.right = removeNode(node.right, value);
          return node;
        }
        else {
          // Case 1: Node with no child or only one child
          if (node.left === null) {
            return node.right;
          } else if (node.right === null) {
            return node.left;
          }
    
          // Case 2: Node with two children
          // Find the smallest value in the right subtree (successor)
          let tempNode = node.right;
          while (tempNode.left !== null) {
            tempNode = tempNode.left;
          }
    
          // Case 3: Node is the root node
          // Replace the node's value with the successor's value
          node.value = tempNode.value;
    
          node.right = removeNode(node.right, tempNode.value);
          return node;
        }
      };
    
      // Start at the root
      this.root = removeNode(this.root, value);
    }
      */
}

module.exports = { Node, BinarySearchTree };
