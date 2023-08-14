package Test;

import Io.LeaderBoardFiles;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class LeaderBoardFilesTest {

    @Test
    public void read() {
        Map<String,Integer> map = null;
        map = LeaderBoardFiles.read("D:\\Java_project\\Tetris\\src\\Files\\ListLeader.json");
        Assert.assertNotNull(map);
    }
}