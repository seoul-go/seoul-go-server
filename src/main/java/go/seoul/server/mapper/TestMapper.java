package go.seoul.server.mapper;

import go.seoul.server.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestDto> getUserList();
}
