package me.hardicine.task.factory;

import me.hardicine.task.entity.CustomEntityIntArray;
import me.hardicine.task.exception.CustomArrayException;

public interface ArrayFactory {
  CustomEntityIntArray createArray(int size) throws CustomArrayException;

  CustomEntityIntArray createArray(int... incomingData) throws CustomArrayException;

  CustomEntityIntArray createArray(CustomEntityIntArray entityArray) throws CustomArrayException;
}
