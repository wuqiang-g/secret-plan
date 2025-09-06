# 二叉搜索树（Binary Search Tree BST）

    特性：左子树所有节点值小于根节点，右子树所有节点值都大于跟节点，每个节点都是二叉搜索树。
    基于BST的数据结构：AVL树、红黑树拥有了自平衡性质，可以提供 logN 级别的增删查改效率；
    还有 B+ 树，线段树等结构都是基于 BST 的思想来设计的
--- 

### [例题](https://labuladong.online/algo/data-structure/bst-part1/)

[1038. 从二叉搜索树到更大和树](https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/description/)

[230. 二叉搜索树中第 K 小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-bst/description/)

[538. 把二叉搜索树转换为累加树](https://leetcode.cn/problems/convert-bst-to-greater-tree/description/)

[98. 验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/description/) 这题需要传递参数来获取父节点的最大值和最小值范围

[700. 二叉搜索树中的搜索](https://leetcode.cn/problems/search-in-a-binary-search-tree/description/) 查

[701. 二叉搜索树中的插入操作](https://leetcode.cn/problems/insert-into-a-binary-search-tree/description/) 找到合适空位置，插入

[450. 删除二叉搜索树中的节点](https://leetcode.cn/problems/delete-node-in-a-bst/description/) 三种情况：无子树直接删；有单个子树，返回单子树；两个子树，把右子树最小值先删除，再当做要替换的根节点。