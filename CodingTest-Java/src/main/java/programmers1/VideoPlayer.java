package programmers1;

public class VideoPlayer {

    //프로그래머스 Level 1. [PCCP 기출문제] 1번 / 동영상 재생기
    //https://school.programmers.co.kr/learn/courses/30/lessons/340213
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();

        String video_len1 = "34:33";
        String pos1 = "13:00";
        String op_start1 = "00:55";
        String op_end1 = "02:55";
        String[] commands1 = {"next", "prev"};
        String result1 = videoPlayer.solution(video_len1, pos1, op_start1, op_end1, commands1);
        System.out.println(result1); // "13:00"
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] video_len_arr = video_len.split(":");
        String[] pos_arr = pos.split(":");
        String[] op_start_arr = op_start.split(":");
        String[] op_end_arr = op_end.split(":");
        int video_len_int = Integer.parseInt(video_len_arr[0]) * 60 + Integer.parseInt(video_len_arr[1]);
        int pos_int = Integer.parseInt(pos_arr[0]) * 60 + Integer.parseInt(pos_arr[1]);
        int op_start_int = Integer.parseInt(op_start_arr[0]) * 60 + Integer.parseInt(op_start_arr[1]);
        int op_end_int = Integer.parseInt(op_end_arr[0]) * 60 + Integer.parseInt(op_end_arr[1]);

        if (pos_int >= op_start_int && pos_int <= op_end_int) {
            pos_int = op_end_int;
        }

        for (String command : commands) {
            if (command.equals("next")) {
                if (pos_int + 10 > video_len_int) {
                    pos_int = video_len_int;
                } else {
                    pos_int += 10;
                }
            } else {
                if (pos_int - 10 < 0) {
                    pos_int = 0;
                } else {
                    pos_int -= 10;
                }
            }

            if (pos_int >= op_start_int && pos_int <= op_end_int) {
                pos_int = op_end_int;
            }
        }

        return (pos_int / 60 < 10 ? "0" + pos_int / 60 : pos_int / 60) + ":" + (pos_int % 60 < 10 ? "0" + pos_int % 60 : pos_int % 60);
    }

}
