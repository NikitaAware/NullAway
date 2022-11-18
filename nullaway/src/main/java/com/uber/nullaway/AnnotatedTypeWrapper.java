package com.uber.nullaway;

import com.google.errorprone.VisitorState;
import com.sun.source.tree.AssignmentTree;
import java.util.HashSet;

public interface AnnotatedTypeWrapper<T1, T2> {

  public HashSet<Integer> getNullableTypeArgIndices(T2 wrapper, Config config);

  public void checkAssignmentTypeMatch(
      AssignmentTree tree, T1 lhs, T2 rhs, Config config, VisitorState state, NullAway analysis);
}