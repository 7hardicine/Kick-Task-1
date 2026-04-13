package me.hardicine.task.factory.impl;

import me.hardicine.task.entity.CustomEntityIntArray;
import me.hardicine.task.exception.CustomArrayException;
import me.hardicine.task.factory.ArrayFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFactoryImpl implements ArrayFactory {

  private static final Logger logger = LogManager.getLogger("LogFile");

  @Override
  public CustomEntityIntArray createArray(int size) throws CustomArrayException {
    logger.log(Level.INFO, "ArrayFactoryImpl is creating a new array of size ({}).", size);
    return new CustomEntityIntArray(size);
  }

  @Override
  public CustomEntityIntArray createArray(int... incomingData) throws CustomArrayException {
    logger.log(Level.INFO, "ArrayFactoryImpl is creating a new array from existing varargs/array.");
    return new CustomEntityIntArray(incomingData);
  }

  @Override
  public CustomEntityIntArray createArray(CustomEntityIntArray entityArray) throws CustomArrayException {
    logger.log(Level.INFO, "ArrayFactoryImpl is cloning an existing CustomEntityIntArray.");
    return new CustomEntityIntArray(entityArray);
  }
}
