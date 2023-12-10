// LogInDanCaptcha.java
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class LogInDanCaptcha {
    private String username;
    private String password;
    private String captcha;

    public LogInDanCaptcha(String username, String password) {
        this.username = username;
        this.password = password;
        this.captcha = generateCaptcha();
    }

    public boolean checkLogin(String enteredUsername, String enteredPassword, String enteredCaptcha) {
        return username.equals(enteredUsername) && password.equals(enteredPassword) && captcha.equalsIgnoreCase(enteredCaptcha);
    }

    public String getCaptcha() {
        return captcha;
    }

    private String generateCaptcha() {
        // Daftar karakter yang mungkin digunakan dalam captcha
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Panjang captcha yang diinginkan
        int captchaLength = 6;

        // Membangun captcha secara acak
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < captchaLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            captcha.append(characters.charAt(randomIndex));
        }

        return captcha.toString();
    }

    public String formatTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        return timeFormat.format(new Date());
    }
}
