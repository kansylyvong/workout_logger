package com.vansylyvong.workout.logger.controller;

import com.vansylyvong.workout.logger.model.Category;
import com.vansylyvong.workout.logger.model.Equipment;
import com.vansylyvong.workout.logger.service.ExerciseService;
import com.vansylyvong.workout.logger.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {
    @Autowired
    ExerciseService exerciseService;


    @GetMapping("/exercise")
    public Exercise getExercise(@RequestParam(value="exercise_name", defaultValue ="push-ups") String ename) {
        return exerciseService.getExerciseByName(ename);
    }

    @PostMapping("/exercise")
    public Exercise addExercise(@RequestParam(value="exercise_name") String ename,
                                @RequestParam(value="category_name") String catName,
                                @RequestParam(value="exercise_desc") String exerDesc,
                                @RequestParam(value="equipment_name") String eqName,
                                @RequestParam(value="muscle_name") String muscleName,
                                @RequestParam(value="muscle_group_name") String muscGrpName,
                                @RequestParam(value="body_part_name") String bodyPartName,
                                @RequestParam(value="exercise_duration") int exercise_duration
                                ) {

        return exerciseService.addExercise(ename,catName,exerDesc,eqName,muscleName,muscGrpName,bodyPartName,exercise_duration);
    }
    @PostMapping("/categories")
    public Category addCategory(@RequestParam(value="category_name") String catName,
                                @RequestParam(value="sub_name", defaultValue= "null") String subName,
                                @RequestParam(value="mic_name", defaultValue= "null") String micName)  {

        return exerciseService.addCategory(catName,subName,micName);
    }
    @GetMapping("/categories")
    public List<Category> getCategories() {
        return exerciseService.getAllCategories();
    }
    @PostMapping("/equipment")
    public Equipment addEquipment(@RequestParam(value="eq_name") String eqName,
                                  @RequestParam(value="eq_desc") String eqDesc,
                                  @RequestParam(value="eq_cat_pk") long eqCatPk) {
        return exerciseService.addEquipment(eqName,eqDesc,eqCatPk);
    }
}
