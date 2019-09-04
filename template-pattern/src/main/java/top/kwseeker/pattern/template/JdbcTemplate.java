package top.kwseeker.pattern.template;

import javax.sql.DataSource;
import java.util.List;

public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 执行sql语句
     * @param sql       sql语句
     * @param values    sql参数
     * @return
     */
    public List<?> executeQuery(String sql, Object[] values) {
        //1 获取连接

        //2 创建语句集

        //3 执行语句集获取结果集

        //4 解析语句集

        //5 关闭结果集

        //6 关闭语句集

        //7 关闭连接

        return null;
    }

}
