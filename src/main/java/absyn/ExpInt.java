package absyn;

import io.vavr.collection.Tree;

public class ExpInt extends Exp {
   public final int value;

   public ExpInt(int value) {
      this.value = value;
   }

   @Override
   public Tree.Node<String> toTree() {
      return Tree.of("ExpInt: " + value);
   }
}
