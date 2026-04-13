package me.hardicine.task.service.impl;

import me.hardicine.task.entity.CustomEntityIntArray;
import me.hardicine.task.service.IntArrayAction;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntArrayActionImpl implements IntArrayAction {

  @Override
  public OptionalInt min(CustomEntityIntArray intArray) {
    return Arrays.stream(intArray.getData()).min();
  }

  @Override
  public OptionalInt max(CustomEntityIntArray intArray) {
    return Arrays.stream(intArray.getData()).max();
  }

  @Override
  public OptionalInt sum(CustomEntityIntArray intArray) {
    return Arrays.stream(intArray.getData()).reduce(Integer::sum) ;
  }

  @Override
  public OptionalDouble average(CustomEntityIntArray intArray) {
    return Arrays.stream(intArray.getData()).average();
  }
}
