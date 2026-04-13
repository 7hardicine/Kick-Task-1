package me.hardicine.task.service;

import me.hardicine.task.entity.CustomEntityIntArray;
import me.hardicine.task.exception.CustomArrayException;

public interface IntArraySort {
  void bubbleSort(CustomEntityIntArray entity) throws CustomArrayException;

  void smoothSort(CustomEntityIntArray entity) throws CustomArrayException;
}
