package com.biz.hello;

import org.apache.ibatis.session.SqlSession;

import com.biz.hello.config.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SqlSession sqlSession = DBConnection.getSqlSessionFactory().openSession(true);
    	
        System.out.println( "Hello World!" );
    }
}
