package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test @DisplayName("학습테스트 실습")
    void replace(){
        String actual = "abc".replace("b","d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test @DisplayName("요구사항 1-split Test")
    void split(){
        String[] actual = "1,2".split(",");
        assertThat(actual[0]).isEqualTo("1");
        assertThat(actual[1]).isEqualTo("2");
    }

    @Test @DisplayName("요구사항 2-substring Test")
    void substring(){
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }


}
