package me.hardicine.task.reader;

import me.hardicine.task.exception.CustomArrayException;

import java.util.List;

public interface ArrayReader {
  List<String> readLinesFromFile(String filePath) throws CustomArrayException;
}
