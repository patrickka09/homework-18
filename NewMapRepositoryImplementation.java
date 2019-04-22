package edu.dmacc.codedsm.hw18;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NewMapRepositoryImplementation implements MapRepository {

    private Map<Integer, Result> storage = new HashMap<>();
    private BufferedWriter writer;
    {
        try {
            writer = new BufferedWriter( new FileWriter("fizzbuzz_result.txt"));
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }

    @Override
    public void save(Result result) {
        storage.put(1, result);
        try {
            writer.write(result.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
