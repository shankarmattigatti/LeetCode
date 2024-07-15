/**
 * 2196. Create Binary Tree From Descriptions
 * @param {number[][]} descriptions
 * @return {TreeNode}
 */
const createBinaryTree = function (descriptions) {
  const nodes = new Map();
  const childNodes = new Set();

  descriptions.forEach(([parent, child, isLeft]) => {
    if (!nodes.has(parent)) {
      nodes.set(parent, new TreeNode(parent));
    }
    if (!nodes.has(child)) {
      nodes.set(child, new TreeNode(child));
    }

    if (isLeft) {
      nodes.get(parent).left = nodes.get(child);
    } else {
      nodes.get(parent).right = nodes.get(child);
    }

    childNodes.add(child);
  });

  let root = null;
  nodes.forEach((node, val) => {
    if (!childNodes.has(val)) {
      root = node;
    }
  });

  return root;
};