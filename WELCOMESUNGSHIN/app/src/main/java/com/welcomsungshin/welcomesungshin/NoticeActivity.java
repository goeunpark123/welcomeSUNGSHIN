package com.welcomsungshin.welcomesungshin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

    public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        String[] list = {
                "< 학 사 공 지 >",
                "[기숙사] 2021학년도 기숙사 신청 안내",
                "방학 중 사회적 거리두기 단계별 도서관 운영 안내",
                "★[교수학습지원팀] 2020학년도 2학기 <학부> 기말강의평가 시행 안내(미완료 시 성적조회 제한)★",
                "2020학년도 겨울방학 온라인 대학원 어학특강 연장접수 안내",
                "< 일 반 공 지 >",
                "[뷰티생활산업국제대학] 동계방학 교육분야 진로 희망자를 위한 워크숍 <미래교사의 행복한 수업>",
                "[소비자생활문화산업학과] 'CS Leaders' 자격 취득 특강",
                "방학 중 사회적 거리두기 단계별 도서관 운영 안내",
                "[대학혁신(2차)]학생전문성 활용 지역사회 주민을 위한 온라인 클래스 참여자 모집\n",
        };


        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);

        ListView listView = (ListView) findViewById(R.id.ListView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                int pposition = position;
                switch (pposition) {
                    case 0:
                        break;
                    case 1:
                        Intent aIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11107/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgxJTJGOTgzMDUlMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(aIntent);
                        break;
                    case 2:
                        Intent bIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11107/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgxJTJGOTgxMzIlMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(bIntent);
                        break;
                    case 3:
                        Intent cIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11107/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgxJTJGOTgxMjUlMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(cIntent);
                        break;
                    case 4:
                        Intent dIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11107/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgxJTJGOTgwOTAlMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(dIntent);
                        break;
                    case 5:
                        break;
                    case 6:
                        Intent eIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11108/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgyJTJGOTg0MTQlMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(eIntent);
                        break;
                    case 7:
                        Intent fIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11108/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgyJTJGOTg0MTIlMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(fIntent);
                        break;
                    case 8:
                        Intent gIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11108/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgyJTJGOTgxMzYlMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(gIntent);
                        break;
                    case 9:
                        Intent hIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sungshin.ac.kr/main_kor/11108/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFpbl9rb3IlMkYzMTgyJTJGOTgwNjklMkZhcnRjbFZpZXcuZG8lM0ZwYWdlJTNEMSUyNnNyY2hDb2x1bW4lM0QlMjZzcmNoV3JkJTNEJTI2YmJzQ2xTZXElM0QlMjZiYnNPcGVuV3JkU2VxJTNEJTI2cmdzQmduZGVTdHIlM0QlMjZyZ3NFbmRkZVN0ciUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnBhc3N3b3JkJTNEJTI2"));
                        startActivity(hIntent);
                        break;
                    case 10:
                        finish();
                }
            }
        });
    }
}