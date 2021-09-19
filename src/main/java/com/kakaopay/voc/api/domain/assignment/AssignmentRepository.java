package com.kakaopay.voc.api.domain.assignment;
import com.kakaopay.voc.api.domain.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AssignmentRepository extends JpaRepository<Assignment,Long> {

    Optional<Assignment> findByQuestionId(Long questionId);
    List<Assignment> findAllByCounselorIdOrderByCreatedAtDesc(String counselorId);

    @Query("select q from Assignment a left join a.question q on a.question.id = q.id where q is null order by q.createdAt desc")
    List<Question> findAllByNonAssignment();
}
