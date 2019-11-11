package cn.waqwb.seckilldemo.mapper;

import cn.waqwb.seckilldemo.po.UserDO;
import cn.waqwb.seckilldemo.po.UserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    long countByExample(UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int deleteByExample(UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    List<UserDO> selectByExample(UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    UserDO selectByPrimaryKey(Integer id);
    UserDO selectByTelphone(String telphone);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Oct 18 19:16:21 CST 2019
     */
    int updateByPrimaryKey(UserDO record);
}