package org.datastructure;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 随机打印一道题目，等待用户确认后显示解释
 */
public class RandomQuestion {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String filePath = System.getProperty("user.dir") + "/src/main/java/org/datastructure/AllQuestion.txt";

        RandomQuestion randomQuestion = null;
        try {
            randomQuestion = new RandomQuestion(filePath);

            // 示例：循环打印3道题
            for (int i = 0; i < 3; i++) {
                randomQuestion.printRandomQuestionWithExplanation();
            }

        } catch (IOException e) {
            System.err.println("读取文件时出错: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (randomQuestion != null) {
                randomQuestion.close();
            }
        }
    }

    // 存储题目链接部分和解释的内部类
    static class Question {
        String markdownLink; // 形如 [题目名](链接)
        String explanation;

        public Question(String markdownLink, String explanation) {
            this.markdownLink = markdownLink;
            this.explanation = explanation.trim(); // 去除首尾空格
        }
    }

    private List<Question> questions;
    private Random random;
    private Scanner scanner;

    // 正则表达式：匹配 [title](url) 后面跟着解释
    private static final Pattern LINE_PATTERN = Pattern.compile("^([^\\]]+\\]\\([^)]+\\))\\s*(.*)$");

    public RandomQuestion(String filePath) throws IOException {
        this.questions = new ArrayList<>();
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        loadQuestions(filePath);
    }

    /**
     * 从文件加载题目数据
     */
    private void loadQuestions(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            if (line.isEmpty() || line.startsWith("#")) continue; // 跳过空行和注释

            Matcher matcher = LINE_PATTERN.matcher(line);
            if (matcher.matches()) {
                String markdownLink = matcher.group(1).trim();
                String explanation = matcher.group(2).trim();
                questions.add(new Question(markdownLink, explanation));
            } else {
                System.err.println("第 " + (i + 1) + " 行格式不匹配，已跳过: " + line);
            }
        }

        if (questions.isEmpty()) {
            throw new IllegalArgumentException("文件中没有加载到有效题目: " + filePath);
        }
    }

    /**
     * 随机打印一道题目，等待用户确认后显示解释
     */
    public void printRandomQuestionWithExplanation() {
        if (questions.isEmpty()) {
            System.out.println("没有可用的题目。");
            return;
        }

        // 随机选择一个题目
        Question selected = questions.get(random.nextInt(questions.size()));

        // 打印可点击的题目链接（Markdown格式）
        System.out.println("题目: " + selected.markdownLink);

        // 等待用户按键确认
        System.out.print("按回车键显示解释...");
        scanner.nextLine(); // 等待用户输入（回车）

        // 显示解释
        System.out.println("解释: " + selected.explanation);
        System.out.println(); // 空行分隔
    }

    /**
     * 关闭资源
     */
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
