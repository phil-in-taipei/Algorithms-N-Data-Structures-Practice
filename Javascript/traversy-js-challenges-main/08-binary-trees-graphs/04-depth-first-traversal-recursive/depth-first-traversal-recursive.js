class Node {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

function recDepthFirstTraversal(rootNode) {
  const result = [];

  function recursivelyTraverse(node) {
    //console.log("##########################################################################")
    //console.log(`Passing node into recursive function: ${node}`)
    if (node !== null) {
      //console.log(`Node is not null and has this data: ${node.data} -- push on list`)
      result.push(node.data);
      //console.log('**************************************************')
      //console.log('attempt left traversal...')
      //console.log('**************************************************')
      recursivelyTraverse(node.left);
      //console.log('**************************************************')
      //console.log('attempty right traversal ....')
      //console.log('**************************************************')
      recursivelyTraverse(node.right);
      //console.log("##########################################################################")
    }
  }
  //console.log("First calling the function with the root node......")
  recursivelyTraverse(rootNode);

  return result;

}

module.exports = {
  Node,
  recDepthFirstTraversal,
};
