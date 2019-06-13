package DesignPattern.templatemethod;

/**
 * @ClassName: NormalLoginModel
 * @Auther: zhoucc
 * @Date: 2019/6/13 10:40
 * @Description:
 */
public class NormalLoginModel extends LoginModel {

    /**
     * 密码验证问题
     */
    private String question;
    /**
     * 密码验证答案
     */
    private String answer;

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
