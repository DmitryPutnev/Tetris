package Io;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class LeaderBoardFiles {
    public static void write(String name, int score, String file) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Integer> listLeader = null;
        try {
            listLeader = mapper.readValue(
                    new File(file),
                    new TypeReference<Map<String, Integer>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        listLeader.put(name, score);
        try {
            mapper.writeValue(new File(file), listLeader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Integer> read(String file) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Integer> listLeader = null;
        try {
            listLeader = mapper.readValue(
                    new File(file),
                    new TypeReference<Map<String, Integer>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return  listLeader;
    }
}
