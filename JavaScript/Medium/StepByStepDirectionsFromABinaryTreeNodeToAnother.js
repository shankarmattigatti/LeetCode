/**
 * 2096. Step-By-Step Directions From a Binary Tree Node to Another
 * @param {TreeNode} root
 * @param {number} startValue
 * @param {number} destValue
 * @return {string}
 */
const getDirections = function (root, startValue, destValue) {
  const lca = findLCA(root, startValue, destValue);

  const pathToStart = [];
  findPath(lca, startValue, pathToStart);

  const pathToDest = [];
  findPath(lca, destValue, pathToDest);

  const directionsToStart = 'U'.repeat(pathToStart.length);

  return directionsToStart + pathToDest.join('');
};

const findLCA = function (root, startValue, destValue) {
  if (!root || root.val === startValue || root.val === destValue)
    return root;

  const left = findLCA(root.left, startValue, destValue);
  const right = findLCA(root.right, startValue, destValue);

  if (left && right)
    return root;

  return left ? left : right;
};

const findPath = function (root, targetValue, path) {
  if (!root)
    return false;
  if (root.val === targetValue)
    return true;

  path.push('L');
  if (findPath(root.left, targetValue, path))
    return true;
  path.pop();

  path.push('R');
  if (findPath(root.right, targetValue, path))
    return true;
  path.pop();

  return false;
};