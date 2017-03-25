package FirstWeek;
import java.io.*;  
import java.net.*;  
import java.util.ArrayList;  
import java.util.regex.*;  
  
public class Main {  
    static String SendGet(String url) {  
        // ����һ���ַ��������洢��ҳ����  
        String result = "";  
        // ����һ�������ַ�������  
        BufferedReader in = null;  
  
        try {  
            // ��stringת��url����  
            URL realUrl = new URL(url);  
            // ��ʼ��һ�����ӵ��Ǹ�url������  
            URLConnection connection = realUrl.openConnection();  
            // ��ʼʵ�ʵ�����  
            connection.connect();  
            // ��ʼ�� BufferedReader����������ȡURL����Ӧ  
            in = new BufferedReader(new InputStreamReader(  
                    connection.getInputStream(), "UTF-8"));  
            // ������ʱ�洢ץȡ����ÿһ�е�����  
            String line;  
            while ((line = in.readLine()) != null) {  
                // ����ץȡ����ÿһ�в�����洢��result����  
                result += line;  
            }  
        } catch (Exception e) {  
            System.out.println("����GET��������쳣��" + e);  
            e.printStackTrace();  
        }  
        // ʹ��finally���ر�������  
        finally {  
            try {  
                if (in != null) {  
                    in.close();  
                }  
            } catch (Exception e2) {  
                e2.printStackTrace();  
            }  
        }  
        return result;  
  
    }  
  
    static ArrayList<String> RegexString(String targetStr, String patternStr) {  
        // Ԥ����һ��ArrayList���洢���  
        ArrayList<String> results = new ArrayList<String>();  
        // ����һ����ʽģ�壬����ʹ��������ʽ����������Ҫץ������  
        Pattern pattern = Pattern.compile(patternStr);  
        // ����һ��matcher������ƥ��  
        Matcher matcher = pattern.matcher(targetStr);  
        // ����ҵ���  
        boolean isFind = matcher.find();  
        // ʹ��ѭ�������������е�kelvin�ҳ����滻�ٽ����ݼӵ�sb��  
        while (isFind) {  
            //��ӳɹ�ƥ��Ľ��  
            results.add(matcher.group(1));  
            // ����������һ��ƥ�����  
            isFind = matcher.find();  
        }  
        return results;  
    }  
  
    public static void main(String[] args) {  
  
        // ���弴�����ʵ�����  
        String url = "http://www.zhihu.com/explore/recommendations";  
        // �������Ӳ���ȡҳ������  
        String result = SendGet(url);  
        // ʹ������ƥ��ͼƬ��src����  
        ArrayList<String> imgSrc = RegexString(result, "post-link.+?>(.+?)<");  
        // ��ӡ���  
        System.out.println(imgSrc);  
    }  
}  