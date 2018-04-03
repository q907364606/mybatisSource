package com.zwz.testTypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;


@MappedJdbcTypes(JdbcType.TINYINT)
@MappedTypes({String.class})
public class MytinyintTypeHandler extends BaseTypeHandler<String>{

	@Override
	public void setNonNullParameter(PreparedStatement paramPreparedStatement,
			int paramInt, String paramT, JdbcType paramJdbcType)
			throws SQLException {
		// TODO Auto-generated method stub
		paramPreparedStatement.setString(paramInt, paramT);
	}

	@Override
	public String getNullableResult(ResultSet paramResultSet, String paramString)
			throws SQLException {
		// TODO Auto-generated method stub
		return paramResultSet.getString(paramString)+"哈哈哈";
	}

	@Override
	public String getNullableResult(ResultSet paramResultSet, int paramInt)
			throws SQLException {
		// TODO Auto-generated method stub
		return paramResultSet.getString(paramInt)+"呵呵呵";
	}

	@Override
	public String getNullableResult(CallableStatement paramCallableStatement,
			int paramInt) throws SQLException {
		// TODO Auto-generated method stub
		return paramCallableStatement.getString(paramInt)+"啦啦啦啦";
	}


	
	
}
